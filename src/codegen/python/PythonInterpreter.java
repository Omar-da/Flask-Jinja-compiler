package codegen.python;

import ast.builder.TemplateASTBuilder;
import ast.flask.FlaskASTNode;
import ast.flask.misc.Param;
import ast.flask.misc.RouteArg;
import ast.flask.misc.RouteArgString;
import ast.flask.stmt.AssignStmt;
import ast.flask.stmt.ExprStmt;
import ast.flask.stmt.FuncDefStmt;
import ast.flask.stmt.FunctionDefNode;
import ast.flask.stmt.IfStmt;
import ast.flask.stmt.ReturnStmt;
import ast.flask.stmt.RouteDefStmt;
import ast.template.TemplateASTNode;
import codegen.jinja.JinjaRenderer;
import gen.grammers.MiniFlaskLexer;
import gen.grammers.MiniTemplateParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import codegen.python.RedirectResponse;

public class PythonInterpreter {

    private final RuntimeContext context = new RuntimeContext();
    private final JinjaRenderer jinjaRenderer = new JinjaRenderer();

    private final ValueEvaluator evaluator = new ValueEvaluator(context);
    private final Map<String, RouteDefStmt> routeDefMap = new LinkedHashMap<>();
    private FlaskASTNode rootNode = null;


    public RuntimeContext execute(FlaskASTNode root) {
        this.rootNode = root;
        registerRoutes(root, context);
        visit(root);
        return context;
    }

    private void registerRoutes(FlaskASTNode node, RuntimeContext scopeContext) {
        if (node instanceof RouteDefStmt routeDef) {
            registerRoute(routeDef, scopeContext);
            return;
        }

        for (FlaskASTNode child : node.getChildren()) {
            if (child != null) {
                registerRoutes(child, scopeContext);
            }
        }
    }

    private void registerRoute(RouteDefStmt routeDef, RuntimeContext scopeContext) {
        if (routeDef.function == null) {
            return;
        }

        String routeUrl = null;
        for (RouteArg arg : routeDef.routeArgs) {
            if (arg instanceof RouteArgString routeArgString) {
                routeUrl = routeArgString.path;
                break;
            }
        }

        if (routeUrl == null) {
            return;
        }

        String method = routeDef.method != null ? routeDef.method : "ANY";
        if ("ROUTE".equals(method)) {
            method = "ANY";
        }
        String routeKey = method + ":" + routeUrl;

        Map<String, Object> routes = new LinkedHashMap<>();
        Object existingRoutes = scopeContext.get("urls");
        if (existingRoutes instanceof Map<?, ?> existingMap) {
            for (Map.Entry<?, ?> entry : existingMap.entrySet()) {
                routes.put(String.valueOf(entry.getKey()), entry.getValue());
            }
        }

        Map<String, FunctionDefNode> routeNodes = new LinkedHashMap<>();
        Object existingRouteNodes = scopeContext.get("routes");
        if (existingRouteNodes instanceof Map<?, ?> existingRouteMap) {
            for (Map.Entry<?, ?> entry : existingRouteMap.entrySet()) {
                if (entry.getKey() instanceof String key && entry.getValue() instanceof FunctionDefNode fn) {
                    routeNodes.put(key, fn);
                }
            }
        }

        Map<String, Object> routeInfo = new LinkedHashMap<>();
        routeInfo.put("url", routeUrl);
        routeInfo.put("method", method);
        for (String paramName : extractDynamicParams(routeUrl)) {
            routeInfo.put(paramName, null);
        }

        routes.put(routeDef.function.name, routeInfo);
        routeNodes.put(routeKey, routeDef.function);
        if ("ANY".equals(method)) {
            routeNodes.put(routeUrl, routeDef.function);
        }

        scopeContext.set("urls", routes);
        scopeContext.set("routes", routeNodes);

        routeDefMap.put(routeKey, routeDef);
        if ("ANY".equals(method)) {
            routeDefMap.put(routeUrl, routeDef);
        }
    }

    @SuppressWarnings("unchecked")
    public Map<String, FunctionDefNode> getRoutes() {
        Object routes = context.get("routes");
        if (routes instanceof Map<?, ?> routeMap) {
            return (Map<String, FunctionDefNode>) routeMap;
        }
        return Collections.emptyMap();
    }

    public RouteDefStmt getRouteDef(String routeUrl) {
        return getRouteDef(routeUrl, null);
    }

    public RouteDefStmt getRouteDef(String routeUrl, String requestMethod) {
        String normalizedMethod = requestMethod == null ? "ANY" : requestMethod.trim().toUpperCase();
        String methodSpecificKey = normalizedMethod + ":" + routeUrl;
        if (routeDefMap.containsKey(methodSpecificKey)) {
            return routeDefMap.get(methodSpecificKey);
        }
        return routeDefMap.getOrDefault(routeUrl, routeDefMap.get("ANY:" + routeUrl));
    }

    public Object renderRouteByUrl(
            String routeUrl,
            String requestMethod,
            Map<String, Object> routeParams,
            Map<String, Object> formData
    ) {
        RouteDefStmt routeDef = getRouteDef(routeUrl, requestMethod);

        if (routeDef == null || routeDef.function == null) {
            return null;
        }

        // Create a separate context for this HTTP request
        RuntimeContext requestContext = context.copy();

        Map<String, Object> requestObject = new LinkedHashMap<>();
        requestObject.put("method", requestMethod != null ? requestMethod : "GET");
        requestObject.put("form", formData != null ? formData : Map.of());
        requestContext.set("request", requestObject);

        // Add route parameters such as <int:pid>
        if (routeParams != null) {
            for (Map.Entry<String, Object> entry : routeParams.entrySet()) {
                requestContext.set(entry.getKey(), entry.getValue());
            }
        }

        // Execute the route function
        Object result = evaluateRouteDef(
                routeDef,
                requestContext,
                false
        );

        // Persist any in-place mutations (such as products.append(...)) back to the shared app context.
        for (Map.Entry<String, Object> entry : requestContext.getVariables().entrySet()) {
            String key = entry.getKey();
            if ("request".equals(key) || "urls".equals(key) || "routes".equals(key)) {
                continue;
            }
            context.set(key, entry.getValue());
        }

        // Route returned render_template(...)
        if (result instanceof TemplateRenderRequest request) {
            TemplateASTNode templateAST =
                    buildTemplateAST(request.templateName);

            return jinjaRenderer.render(
                    templateAST,
                    request.context
            );
        }

        // Route returned redirect(...)
        if (result instanceof RedirectResponse redirectResponse) {
            return redirectResponse;
        }

        /*
        * Fallback:
        * Some return statements may have been parsed as
        * top-level sibling statements after the route definition.
        */
        if (rootNode instanceof ast.flask.stmt.FileNodeFlask fileNode) {

            List<FlaskASTNode> siblings = fileNode.getChildren();

            int startIndex = -1;

            // Find the current route definition
            for (int i = 0; i < siblings.size(); i++) {
                if (siblings.get(i) == routeDef) {
                    startIndex = i;
                    break;
                }
            }

            if (startIndex >= 0) {

                // Evaluate statements after the route definition
                for (int i = startIndex + 1; i < siblings.size(); i++) {

                    Object siblingResult =
                            visit(siblings.get(i), requestContext);

                    // render_template(...)
                    if (siblingResult instanceof TemplateRenderRequest req2) {

                        TemplateASTNode templateAST =
                                buildTemplateAST(req2.templateName);

                        return jinjaRenderer.render(
                                templateAST,
                                req2.context
                        );
                    }

                    // redirect(...)
                    if (siblingResult instanceof RedirectResponse redirectResponse) {
                        return redirectResponse;
                    }

                    // Other non-null result
                    if (siblingResult != null) {
                        return String.valueOf(siblingResult);
                    }
                }
            }
        }

        return null;
    }

    private void visit(FlaskASTNode node) {
        visit(node, context);
    }

    private Object visit(FlaskASTNode node, RuntimeContext scopeContext) {
        ValueEvaluator localEvaluator = new ValueEvaluator(scopeContext);

        if(node instanceof AssignStmt assignment) {

            Object value;
            try {
                value = localEvaluator.evaluate(assignment.value);
            } catch (RuntimeException e) {
                // Evaluation may fail for imports or unknown globals (e.g. Flask)
                // Skip storing the runtime value and continue processing.
                value = null;
            }

            scopeContext.set(assignment.target, value);
            return null;
        }

        if(node instanceof ReturnStmt returnStmt) {

            Object value;
            try {
                value = localEvaluator.evaluate(returnStmt.value);
            } catch (RuntimeException e) {
                // Could not evaluate return value (e.g. reference to unknown symbol).
                return null;
            }

            return value;
        }

        if (node instanceof IfStmt ifStmt) {
            Object conditionValue;
            try {
                conditionValue = localEvaluator.evaluate(ifStmt.condition);
            } catch (RuntimeException e) {
                return null;
            }

            if (Boolean.TRUE.equals(conditionValue)) {
                for (FlaskASTNode stmt : ifStmt.body) {
                    Object result = visit(stmt, scopeContext);
                    if (result != null) {
                        return result;
                    }
                }
            }
            return null;
        }

        if (node instanceof ExprStmt exprStmt) {
            try {
                localEvaluator.evaluate(exprStmt.expr);
            } catch (RuntimeException ignored) {
            }
            return null;
        }

        if(node instanceof RouteDefStmt routeDef) {
            evaluateRouteDef(routeDef, scopeContext, false);
            return null;
        }

        for(FlaskASTNode child : node.getChildren()) {
            Object result = visit(child, scopeContext);
            if (result != null) {
                return result;
            }
        }

        return null;
    }

    private Object evaluateRouteDef(RouteDefStmt routeDef, RuntimeContext scopeContext, boolean writeOutput) {
        if (routeDef.function == null) {
            return null;
        }

        RuntimeContext routeScope = scopeContext.copy();
        for (Param param : routeDef.function.params) {
            Object paramValue = resolveRouteParamValue(param.name, routeDef.function, scopeContext);
            routeScope.set(param.name, paramValue);
        }

        return evaluateFunctionBody(routeDef.function, routeScope, scopeContext, writeOutput);
    }

    private Object resolveRouteParamValue(String paramName, FuncDefStmt function, RuntimeContext scopeContext) {
        if (scopeContext.contains(paramName)) {
            return scopeContext.get(paramName);
        }

        Object routes = scopeContext.get("urls");
        if (routes instanceof Map<?, ?> routeMap) {
            Object routeEntry = routeMap.get(function.name);
            if (routeEntry instanceof Map<?, ?> routeInfo) {
                Object routeParamValue = routeInfo.get(paramName);
                if (routeParamValue != null) {
                    return routeParamValue;
                }
            }
        }

        for (Param param : function.params) {
            if (param.name.equals(paramName) && param.defaultValue != null) {
                try {
                    return new ValueEvaluator(scopeContext).evaluate(param.defaultValue);
                } catch (RuntimeException ignored) {
                    return null;
                }
            }
        }

        if (("pid".equals(paramName) || paramName.endsWith("Id") || paramName.endsWith("_id"))
                && scopeContext.contains("p") && scopeContext.get("p") instanceof Map<?, ?> itemMap) {
            Object idValue = itemMap.get("id");
            if (idValue != null) {
                return idValue;
            }
        }

        return null;
    }

    private Object evaluateFunctionBody(FuncDefStmt function, RuntimeContext routeScope, RuntimeContext parentContext, boolean writeOutput) {
        for (FlaskASTNode stmt : function.body) {
            Object result = visit(stmt, routeScope);
            if (result != null) {
                parentContext.putAll(routeScope.getVariables());
                if (result instanceof TemplateRenderRequest request) {
                    if (writeOutput) {
                        TemplateASTNode templateAST = buildTemplateAST(request.templateName);
                        String renderedHtml = jinjaRenderer.render(templateAST, request.context);
                        writeRenderedTemplate(request.templateName, renderedHtml);
                        return null;
                    }
                    return request;
                }
                return result;
            }
        }

        parentContext.putAll(routeScope.getVariables());
        return null;
    }

    public String renderFunction(FuncDefStmt function, Map<String, Object> routeParams) {
        if (function == null) {
            return null;
        }

        RuntimeContext requestContext = context.copy();
        requestContext.set("request", Map.of("method", "GET"));
        if (routeParams != null) {
            for (Map.Entry<String, Object> entry : routeParams.entrySet()) {
                requestContext.set(entry.getKey(), entry.getValue());
            }
        }

        Object result = evaluateFunctionBody(function, requestContext, requestContext, false);
        if (result instanceof TemplateRenderRequest request) {
            TemplateASTNode templateAST = buildTemplateAST(request.templateName);
            String rendered = jinjaRenderer.render(templateAST, request.context);
            return rendered;
        }

        return result != null ? String.valueOf(result) : null;
    }

    private List<String> extractDynamicParams(String routeUrl) {
        List<String> params = new ArrayList<>();
        Matcher matcher = Pattern.compile("<(?:[^:>]+:)?([^>]+)>").matcher(routeUrl);
        while (matcher.find()) {
            params.add(matcher.group(1));
        }
        return params;
    }

    private String resolveTemplatePath(String templateName) {
        if (templateName == null) {
            return templateName;
        }

        // Defensive: strip surrounding single or double quotes if present
        String cleaned = templateName;
        if (cleaned.length() >= 2) {
            if ((cleaned.startsWith("\"") && cleaned.endsWith("\"")) ||
                    (cleaned.startsWith("'") && cleaned.endsWith("'"))) {
                cleaned = cleaned.substring(1, cleaned.length() - 1);
            }
        }

        String normalizedName = cleaned.replace(".html", "");
        Map<String, String> templateFileMap = new LinkedHashMap<>();
        templateFileMap.put("index", "src/input/templates/indexTemplate.txt");
        templateFileMap.put("show", "src/input/templates/showTemplate.txt");
        templateFileMap.put("create", "src/input/templates/createTemplate.txt");

        if (templateFileMap.containsKey(normalizedName)) {
            return templateFileMap.get(normalizedName);
        }

        String txtName = normalizedName + ".txt";
        Path directPath = Path.of(txtName);
        if (Files.exists(directPath)) {
            return directPath.toString();
        }

        Path appPath = Path.of("src/input", txtName);
        if (Files.exists(appPath)) {
            return appPath.toString();
        }

        Path sourcePath = Path.of("src", "input", "templates", txtName);
        if (Files.exists(sourcePath)) {
            return sourcePath.toString();
        }

        return templateName;
    }

    private void writeRenderedTemplate(String templateName, String html) {
        String outputFileName = templateName.replace(".html", "") + ".html";
        Path outputPath = Path.of("src/compiler_output", outputFileName);
        try {
            Files.createDirectories(outputPath.getParent());
            Files.writeString(outputPath, html, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write rendered template: " + outputFileName, e);
        }
    }

    private TemplateASTNode buildTemplateAST(String filePath)  {
        String resolvedPath = resolveTemplatePath(filePath);

        CharStream input = null;
        try {
            input = CharStreams.fromFileName(resolvedPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gen.grammers.MiniTemplateLexer lexer = new gen.grammers.MiniTemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniTemplateParser parser = new MiniTemplateParser(tokens);
        ParseTree tree = parser.template();
        TemplateASTNode ast = new TemplateASTBuilder().visit(tree);

        return ast;
    }

}