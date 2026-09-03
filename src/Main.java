import ast.flask.FlaskASTPrinter;
import ast.flask.stmt.FuncDefStmt;
import ast.flask.stmt.FunctionDefNode;
import ast.template.TemplateASTNode;
import ast.template.TemplateASTPrinter;
import codegen.jinja.JinjaRenderer;
import codegen.output.JsonExporter;
import codegen.output.FileCopier;
import codegen.output.OutputGenerator;
import codegen.python.PythonInterpreter;
import codegen.python.RedirectResponse;
import codegen.python.RuntimeContext;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

import gen.grammers.MiniFlaskLexer;
import gen.grammers.MiniFlaskParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.grammers.MiniTemplateLexer;
import gen.grammers.MiniTemplateParser;
import ast.builder.FlaskASTBuilder;
import ast.builder.TemplateASTBuilder;
import ast.flask.FlaskASTNode;
import ast.flask.stmt.FunctionDefNode;

public class Main {

    private static final Path GENERATION_LOG = Path.of("src", "compiler_output", "generation_log.txt");
        private static final Path SEMANTIC_REPORT = Path.of("src", "compiler_output", "semantic_report.txt");
        private static final Path ERRORS_HANDLING_SEMANTIC_REPORT =
            Path.of("src", "compiler_output", "errors_handling_semantic_report.txt");

    // ==================================================
    // Entry Point
    // ==================================================
    public static void main(String[] args) throws Exception {

        Files.createDirectories(GENERATION_LOG.getParent());
        try { Files.deleteIfExists(GENERATION_LOG); } catch (IOException ignored) {}

        Files.createDirectories(SEMANTIC_REPORT.getParent());
        Files.writeString(SEMANTIC_REPORT, "", StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        // 1) Parse and build Flask AST for the app
        FlaskASTNode appAst = parseAndBuildFlaskAST("src/input/app.txt");

        // 2) Interpret app to populate runtime context
        logGenerationPhase(GENERATION_LOG, "interpreting and store var in context", "starting");
        PythonInterpreter interpreter = new PythonInterpreter();
        RuntimeContext runtimeContext = interpreter.execute(appAst);
        logGenerationPhase(GENERATION_LOG, "interpreting and store var in context", runtimeContext.toString());

        // Build template AST map and route table for the HTTP server simulation.
        Map<String, TemplateASTNode> templates = buildTemplateMap();
        Router routes = new Router();
        routes.putAll(interpreter.getRoutes());

        startHttpServer(interpreter, templates, routes);

        // 3) Render templates using the produced runtime context
        generateTemplateHtmlOutputs(runtimeContext, templates);

        // 4) Copy assets
        copyAppAndStyleAssets();

        // 5) Run semantic checks on the dedicated ErrorsHandling fixture
        testErrorsHandling();

    }

    // ==================================================
    // AST Printing
    // ==================================================
    private static void printFlaskAST(String title, String filePath) throws Exception {

        System.out.println("\n" + title);

        MiniFlaskParser parser = createFlaskParser(filePath);
        ParseTree tree = parser.file();

        FlaskASTBuilder builder = new FlaskASTBuilder();
        FlaskASTNode ast = builder.visit(tree);

        JsonExporter exporter = new JsonExporter();
        exporter.export("ast_python.json", FlaskASTPrinter.serialize(ast));
        System.out.println("Wrote Flask AST JSON to compiler_output/ast_python.json");

        if (builder.hasSemanticErrors()) {
            writeSemanticReport(builder.getSemanticErrors());

            System.out.println("Semantic errors found. See semantic_report.txt");
            return;
        }
    }

    private static FlaskASTNode parseAndBuildFlaskAST(String filePath) throws Exception {
        logGenerationPhase(GENERATION_LOG, "parsing", filePath);

        MiniFlaskParser parser = createFlaskParser(filePath);
        ParseTree tree = parser.file();

        logGenerationPhase(GENERATION_LOG, "building ast", filePath);
        FlaskASTBuilder builder = new FlaskASTBuilder();
        FlaskASTNode ast = builder.visit(tree);

        JsonExporter exporter = new JsonExporter();
        exporter.export("ast_python.json", FlaskASTPrinter.serialize(ast));
        logGenerationPhase(GENERATION_LOG, "created AST JSON", "compiler_output/ast_python.json");

        if (builder.hasSemanticErrors()) {
            writeSemanticReport(builder.getSemanticErrors());
            logGenerationPhase(GENERATION_LOG, "check of semantic errors", "FOUND");
        } else {
            writeSemanticReport(builder.getSemanticErrors());
            logGenerationPhase(GENERATION_LOG, "check of semantic errors", "OK");
        }

        return ast;
    }


    private static FlaskASTNode buildErrorsHandlingAst() throws Exception {
        String filePath = "tests/ErrorsHandling";
        logGenerationPhase(GENERATION_LOG, "parsing errors handling fixture", filePath);

        MiniFlaskLexer lexer = new MiniFlaskLexer(CharStreams.fromString(Files.readString(Path.of(filePath))));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniFlaskParser parser = new MiniFlaskParser(tokens);

        FlaskASTBuilder builder = new FlaskASTBuilder();
        FlaskASTNode ast = builder.visit(parser.file());

        if (builder.hasSemanticErrors()) {
            writeSemanticReport(builder.getSemanticErrors(), ERRORS_HANDLING_SEMANTIC_REPORT);
            logGenerationPhase(GENERATION_LOG, "errors handling semantic report", "FOUND");
        } else {
            writeSemanticReport(builder.getSemanticErrors(), ERRORS_HANDLING_SEMANTIC_REPORT);
            logGenerationPhase(GENERATION_LOG, "errors handling semantic report", "OK");
        }

        return ast;
    }

    private static void printTemplateAST(String title, String filePath) throws Exception {

            System.out.println("\n" + title);

            MiniTemplateParser parser = createTemplateParser(filePath);
            ParseTree tree = parser.template();

            TemplateASTNode ast = new TemplateASTBuilder().visit(tree);
            String path = "src/compiler_output/ast_" + filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf(".")) + ".json";
            JsonExporter exporter = new JsonExporter();
            exporter.export(path.replace("src/compiler_output/", "").replace("/", "_"), TemplateASTPrinter.serialize(ast));
            System.out.println("Wrote Template AST JSON to " + path);
    }

    private static void generateTemplateHtmlOutputs(RuntimeContext context, Map<String, TemplateASTNode> templates) throws Exception {
        OutputGenerator outputGenerator = new OutputGenerator();
        JinjaRenderer renderer = new JinjaRenderer();

        // Log the app context once
        logGenerationPhase(GENERATION_LOG, "App context", context.toString());

        List<String> createdFiles = new java.util.ArrayList<>();

        for (Map.Entry<String, TemplateASTNode> entry : templates.entrySet()) {
            String templateName = entry.getKey();
            TemplateASTNode ast = entry.getValue();
            String outputName = templateName.replace(".jinja", ".html");
            String outputBaseName = outputName.replace(".html", "");

            JsonExporter exporter = new JsonExporter();
            exporter.export("ast_" + outputBaseName + "Template.json", TemplateASTPrinter.serialize(ast));
            System.out.println("Wrote Template AST JSON to compiler_output/ast_" + outputBaseName + "Template.json");

            String renderedHtml = renderer.render(ast, context);
            outputGenerator.writeHtml(outputName, renderedHtml);
            System.out.println("Wrote rendered HTML to output/" + outputName);

            // Log template-specific context (same runtime context here)
            logGenerationPhase(GENERATION_LOG, "Template context for " + templateName + " template", context.toString());

            createdFiles.add(outputName);
        }

        // Creating HTML files phase
        logGenerationPhase(GENERATION_LOG, "creating html files", String.join(", ", createdFiles));
    }

    private static void copyAppAndStyleAssets() throws IOException {
        FileCopier copier = new FileCopier();

        Path appSource = Path.of("src/input", "app.txt");
        Path appDestination = Path.of("src", "output", "app.py");
        copier.copy(appSource, appDestination);
        System.out.println("Copied src/input/app.txt to src/output/app.py");
        logGenerationPhase(GENERATION_LOG, "copying app.py file", "src/output/app.py");

        Path appFolder = Path.of("src/input");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(appFolder)) {
            for (Path source : stream) {
                String fileName = source.getFileName().toString();
                if (fileName.endsWith(".css") || fileName.endsWith(".js")) {
                    Path destination = Path.of("src", "output", fileName);
                    copier.copy(source, destination);
                    System.out.println("Copied " + fileName + " to src/output/" + fileName);
                    logGenerationPhase(GENERATION_LOG, "copying css/js files", fileName);
                }
            }
        }
    }

    private static Map<String, TemplateASTNode> buildTemplateMap() throws Exception {
        Map<String, TemplateASTNode> templates = new LinkedHashMap<>();
        templates.put("index.jinja", parseTemplateAST("src/input/templates/indexTemplate.txt"));
        templates.put("show.jinja", parseTemplateAST("src/input/templates/showTemplate.txt"));
        templates.put("create.jinja", parseTemplateAST("src/input/templates/createTemplate.txt"));
        return templates;
    }

    private static TemplateASTNode parseTemplateAST(String filePath) throws Exception {
        MiniTemplateParser parser = createTemplateParser(filePath);
        ParseTree tree = parser.template();
        return new TemplateASTBuilder().visit(tree);
    }

    private static void startHttpServer(PythonInterpreter interpreter, Map<String, TemplateASTNode> templates, Router routes) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", exchange -> {
            String path = exchange.getRequestURI().getPath();
            String method = exchange.getRequestMethod();
            Router.RouteMatch match = routes.lookup(path, method);
            String response;
            int status;

            logGenerationPhase(GENERATION_LOG, "Page navigation request", "method=" + method + " path=" + path);

            if (match == null || match.function == null) {
                logGenerationPhase(GENERATION_LOG, "Page navigation unmatched route", "method=" + method + " path=" + path);
                response = "404 Not Found: " + path;
                status = 404;
                exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=utf-8");
            } else {
                String functionName = (match.function instanceof ast.flask.stmt.FuncDefStmt funcDef)
                        ? funcDef.name
                        : match.function.getClass().getSimpleName();

                Object result;
                try {
                    Map<String, Object> formData = "POST".equalsIgnoreCase(method)
                            ? parseFormData(exchange)
                            : Map.of();

                    logGenerationPhase(GENERATION_LOG, "Route match", "path=" + path + " matchedPattern=" + match.routePattern + " function=" + functionName + " params=" + match.params + " method=" + method + " formData=" + formData);
                    logGenerationPhase(GENERATION_LOG, "Interpreter route lookup", "pattern=" + match.routePattern + " hasRouteDef=" + (interpreter.getRouteDef(match.routePattern) != null));

                    result = interpreter.renderRouteByUrl(match.routePattern, method, match.params, formData);
                } catch (Throwable t) {
                    logGenerationPhase(GENERATION_LOG, "Page render failure", "path=" + path + " function=" + functionName + " error=" + t.getMessage());
                    result = null;
                }

                if (result instanceof RedirectResponse redirectResponse) {
                    logGenerationPhase(GENERATION_LOG, "Page redirect", "from=" + path + " to=" + redirectResponse.getLocation());
                    status = redirectResponse.getStatusCode();
                    response = "";
                    exchange.getResponseHeaders().add("Location", redirectResponse.getLocation());
                    exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=utf-8");
                } else if (result instanceof String body) {
                    logGenerationPhase(GENERATION_LOG, "Page rendered", "path=" + path + " function=" + functionName);
                    response = body;
                    status = 200;
                    exchange.getResponseHeaders().add("Content-Type", "text/html; charset=utf-8");
                } else {
                    logGenerationPhase(GENERATION_LOG, "Page render null result", "pattern=" + match.routePattern + " function=" + functionName);
                    response = "500 Internal Server Error: no response generated for " + functionName;
                    status = 500;
                    exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=utf-8");
                }
            }

            byte[] bytes = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(status, bytes.length);
            try (OutputStream body = exchange.getResponseBody()) {
                body.write(bytes);
            }
        });

        server.setExecutor(Executors.newFixedThreadPool(4));
        server.start();
        System.out.println("HTTP server started on http://localhost:8080");
    }

    private static Map<String, Object> parseFormData(com.sun.net.httpserver.HttpExchange exchange) {
        try {
            byte[] bodyBytes = exchange.getRequestBody().readAllBytes();
            if (bodyBytes.length == 0) {
                return Map.of();
            }
            String body = new String(bodyBytes, StandardCharsets.UTF_8);
            Map<String, Object> formData = new LinkedHashMap<>();
            for (String pair : body.split("&")) {
                if (pair.isBlank()) {
                    continue;
                }
                String[] parts = pair.split("=", 2);
                String key = URLDecoder.decode(parts[0], StandardCharsets.UTF_8);
                String value = parts.length > 1
                        ? URLDecoder.decode(parts[1], StandardCharsets.UTF_8)
                        : "";
                formData.put(key, value);
            }
            return formData;
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse form data", e);
        }
    }

    // ==================================================
    // Parser Creation Helpers
    // ==================================================
    private static MiniFlaskParser createFlaskParser(String filePath) throws Exception {

        CharStream input = CharStreams.fromFileName(filePath);

        MiniFlaskLexer lexer = new MiniFlaskLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return new MiniFlaskParser(tokens);
    }

    private static MiniTemplateParser createTemplateParser(String filePath) throws Exception {

        CharStream input = CharStreams.fromFileName(filePath);

        MiniTemplateLexer lexer = new MiniTemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return new MiniTemplateParser(tokens);
    }

    // ==================================================
    // Parse Tree Printing
    // ==================================================
    private static void printParseTree() throws Exception {

        parseAndPrint(
                "================================================================ Flask Parse Tree ================================================================",
                "tests/FlaskTest3(scopes)",
                MiniFlaskLexer::new,
                MiniFlaskParser::new,
                parser -> ((MiniFlaskParser) parser).file()
        );

        parseAndPrint(
                "================================================================ Index Template Parse Tree ================================================================",
                "App/indexTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        parseAndPrint(
                "================================================================ Create Template Parse Tree ================================================================",
                "App/createTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        parseAndPrint(
                "================================================================ Show Template Parse Tree ================================================================",
                "App/showTemplate.txt",
                MiniTemplateLexer::new,
                MiniTemplateParser::new,
                parser -> ((MiniTemplateParser) parser).template()
        );

        parseAndPrint(
                "================================================================ Runtime Context Test (Parser) ================================================================",
                "tests/RuntimeContextTest",
                MiniFlaskLexer::new,
                MiniFlaskParser::new,
                parser -> ((MiniFlaskParser) parser).file()
        );
    }

    private static void logGenerationPhase(Path logFile, String phase, String context) throws IOException {
        Files.createDirectories(logFile.getParent());

        String logEntry = "Phase: " + phase + "\n" +
                "Context: " + context + "\n\n";

        Files.writeString(
                logFile,
                logEntry,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    // ==================================================
    // Generic Parse Pipeline
    // ==================================================
    private static <L extends Lexer, P extends Parser> void parseAndPrint(
            String title,
            String filePath,
            LexerFactory<L> lexerFactory,
            ParserFactory<P> parserFactory,
            ParseEntry<P> entryRule
    ) throws Exception {

        System.out.println("\n" + title);

        CharStream input = CharStreams.fromFileName(filePath);

        L lexer = lexerFactory.create(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        P parser = parserFactory.create(tokens);

        ParseTree tree = entryRule.parse(parser);

        printTree(tree, parser);
    }

    // ==================================================
    // Pretty Tree Printer
    // ==================================================
    private static void printTree(ParseTree tree, Parser parser) {

        printTree(tree, parser, "", true);
    }

    private static void printTree(
            ParseTree tree,
            Parser parser,
            String prefix,
            boolean isLast
    ) {

        String connector = isLast ? "└── " : "├── ";

        if (tree instanceof RuleContext ctx) {

            String ruleName =
                    parser.getRuleNames()[ctx.getRuleIndex()];

            System.out.println(prefix + connector + ruleName);

            String childPrefix =
                    prefix + (isLast ? "    " : "│   ");

            for (int i = 0; i < tree.getChildCount(); i++) {

                boolean childIsLast =
                        i == tree.getChildCount() - 1;

                printTree(
                        tree.getChild(i),
                        parser,
                        childPrefix,
                        childIsLast
                );
            }
        }
        else if (tree instanceof TerminalNode terminal) {

            String text = terminal.getText();

            if ("<EOF>".equals(text)) {
                return;
            }

            String tokenName =
                    parser.getVocabulary()
                            .getSymbolicName(
                                    terminal.getSymbol().getType()
                            );

            if (tokenName == null) {
                tokenName = text;
            }

            System.out.println(
                    prefix +
                            connector +
                            tokenName +
                            " → \"" +
                            text +
                            "\""
            );
        }
    }

    // ==================================================
    // Functional Interfaces
    // ==================================================
    @FunctionalInterface
    interface LexerFactory<L extends Lexer> {
        L create(CharStream input);
    }

    @FunctionalInterface
    interface ParserFactory<P extends Parser> {
        P create(TokenStream tokens);
    }

    @FunctionalInterface
    interface ParseEntry<P extends Parser> {
        ParseTree parse(P parser);
    }

    private static void
    writeSemanticReport(java.util.List<String> errors) throws IOException {
        writeSemanticReport(errors, SEMANTIC_REPORT);
    }

    private static void
    writeSemanticReport(java.util.List<String> errors, Path reportPath) throws IOException {
        Files.createDirectories(reportPath.getParent());

        StringBuilder content = new StringBuilder();
        if (errors == null || errors.isEmpty()) {
            content.append("No semantic errors found.\n");
        } else {
            content.append("Semantic errors found during Flask AST build:\n");
            for (String error : errors) {
                content.append("- ").append(error).append("\n");
            }
        }

        Files.writeString(reportPath, content.toString(), StandardCharsets.UTF_8);
    }

    public static void testErrorsHandling() throws Exception {
        buildErrorsHandlingAst();
        System.out.println("AST built successfully.");
    }

}
    