package codegen.python;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.template.TemplateASTNode;
import ast.template.TemplateJinjaBlockNode;
import ast.template.expr.TemplateAttrAccessExpr;
import ast.template.expr.TemplateBinaryExpr;
import ast.template.expr.TemplateBoolExpr;
import ast.template.expr.TemplateCallExpr;
import ast.template.expr.TemplateExpr;
import ast.template.expr.TemplateIndexExpr;
import ast.template.expr.TemplateLiteralExpr;
import ast.template.expr.TemplateNameExpr;
import ast.template.expr.TemplatePrimaryExpr;
import ast.template.misc.TemplateArgKw;

public class TemplateValueEvaluator {
    
    private final RuntimeContext context;

    public TemplateValueEvaluator(RuntimeContext context) {
        this.context = context;
    }

    
    public Object evaluateTemplate(TemplateASTNode node) {
        if (node instanceof TemplateLiteralExpr literal) {
            return literal.value;
        }
        if (node instanceof TemplateBoolExpr boolExpr) {
            return boolExpr.value;
        }
        if (node instanceof TemplateNameExpr identifier) {
            if ("url_for".equals(identifier.name)) {
                return identifier.name;
            }
            if (!context.contains(identifier.name)) {
                throw new RuntimeException(
                        "Undefined variable: "
                                + identifier.name);
            }
            return context.get(identifier.name);
        }
        if (node instanceof TemplateBinaryExpr binary) {
            return evaluateTemplateBinary(binary);
        }
        if (node instanceof TemplatePrimaryExpr primary) {
            return evaluateTemplatePrimary(primary);
        }
        if (node instanceof TemplateJinjaBlockNode block && "for".equals(block.type)) {
            return evaluateTemplatePrimary((TemplatePrimaryExpr) block.conditionOrIterable);
        }

        return null;
    }
       
    private Object evaluateTemplateBinary(TemplateBinaryExpr expr) {

        Object left = evaluateTemplate(expr.left);

        Object right = evaluateTemplate(expr.right);

        switch (expr.operator) {

            case "+":
                return add(left, right);

            case "-":
                return ((Number) left).doubleValue()
                        - ((Number) right).doubleValue();

            case "*":
                return ((Number) left).doubleValue()
                        * ((Number) right).doubleValue();

            case "/":
                return ((Number) left).doubleValue()
                        / ((Number) right).doubleValue();
            
            default:
                throw new RuntimeException(
                        "Unknown operator "
                                + expr.operator);
        }
    }

    private Object add(Object left, Object right) {

        // String concatenation
        if (left instanceof String || right instanceof String) {
            return String.valueOf(left) + String.valueOf(right);
        }

        // Numeric addition
        if (left instanceof Number && right instanceof Number) {
            return ((Number) left).doubleValue()
                    +
                    ((Number) right).doubleValue();
        }

        throw new RuntimeException(
                "Cannot add "
                        + left.getClass()
                        + " and "
                        + right.getClass());
    }
    
    private Object evaluateTemplatePrimary(TemplatePrimaryExpr expr) {

        // 1. Evaluate the base first
        Object value = evaluateTemplate(expr.base);

        // 2. Apply suffixes on the result
        for (TemplateExpr suffix : expr.suffixes) {

            if (suffix instanceof TemplateCallExpr call && expr.base instanceof TemplateNameExpr nameExpr
                    && "url_for".equals(nameExpr.name)) {
                return handleUrlFor(call);
            }

            value = applyTemplateSuffix(value, suffix);
        }

        return value;
    }
    
    private Object applyTemplateSuffix(Object value, TemplateExpr suffix) {

        if (suffix instanceof TemplateAttrAccessExpr attr) {

            return applyTemplateAttribute(value, attr);
        }

        if (suffix instanceof TemplateIndexExpr index) {

            return applyTemplateIndex(value, index);
        }

        throw new RuntimeException(
                "Unknown suffix: " + suffix.getClass());
    }

    private Object applyTemplateAttribute(Object value, TemplateAttrAccessExpr attr) {
        if (value instanceof Map<?, ?> map) {
            return map.get(attr.attribute);
        }

        // Be tolerant: if value is null or not a map, return null instead of throwing
        return null;
    }

    private Object handleUrlFor(TemplateCallExpr call) {
        Object routes = context.get("urls");
        if (!(routes instanceof Map<?, ?> routeMap)) {
            return null;
        }

        String routeName = null;
        Map<String, Object> paramValues = new LinkedHashMap<>();
        boolean firstArgSeen = false;
        for (TemplateArgKw arg : call.routeArgKws) {
            if (arg == null) {
                continue;
            }

            Object evaluatedValue = evaluateTemplate(arg.value);
            if (!firstArgSeen) {
                routeName = normalizeRouteName(String.valueOf(evaluatedValue));
                firstArgSeen = true;
                continue;
            }

            if (arg.name != null && evaluatedValue != null) {
                paramValues.put(arg.name, evaluatedValue);
            }
        }

        if (routeName == null) {
            return null;
        }

        Object routeEntry = routeMap.get(routeName);
        if (routeEntry instanceof Map<?, ?> routeInfo) {
            String resolvedUrl = String.valueOf(routeInfo.get("url"));
            for (Map.Entry<String, Object> paramEntry : paramValues.entrySet()) {
                String paramName = paramEntry.getKey();
                Object paramValue = paramEntry.getValue();
                if (paramValue != null) {
                    String replacement = String.valueOf(paramValue);
                    Pattern pattern = Pattern.compile("<(?:[^:>]+:)?" + Pattern.quote(paramName) + ">" );
                    Matcher matcher = pattern.matcher(resolvedUrl);
                    resolvedUrl = matcher.replaceAll(replacement);
                }
            }
            return resolvedUrl;
        }

        return routeEntry;
    }

    private String normalizeRouteName(String value) {
        if (value.length() >= 2) {
            char first = value.charAt(0);
            char last = value.charAt(value.length() - 1);
            if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
                return value.substring(1, value.length() - 1);
            }
        }
        return value;
    }

    private Object applyTemplateIndex(Object value, TemplateIndexExpr index) {

        Object key = evaluateTemplate(index.index);

        if (value instanceof List<?> list) {

            return list.get(
                    ((Number) key).intValue());
        }

        if (value instanceof Map<?, ?> map) {

            return map.get(key);
        }

        throw new RuntimeException(
                "Cannot index value: " + value);
    }

}
