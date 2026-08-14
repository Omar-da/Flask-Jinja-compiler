package codegen.python;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.flask.FlaskASTNode;
import ast.flask.expr.AttrAccessExpr;
import ast.flask.expr.BinaryExpr;
import ast.flask.expr.BoolExpr;
import ast.flask.expr.CallExpr;
import ast.flask.expr.DictExpr;
import ast.flask.expr.Expr;
import ast.flask.expr.GenExpr;
import ast.flask.expr.IndexExpr;
import ast.flask.expr.ListExpr;
import ast.flask.expr.LiteralExpr;
import ast.flask.expr.NameExpr;
import ast.flask.expr.NoneExpr;
import ast.flask.expr.PrimaryExpr;
import ast.flask.misc.ArgKw;
import ast.flask.misc.DictPair;

public class ValueEvaluator {

    private final RuntimeContext context;

    public ValueEvaluator(RuntimeContext context) {
        this.context = context;
    }


    public Object evaluate(FlaskASTNode node) {


        if(node instanceof LiteralExpr literal) {
            return literal.value;
        }

        if(node instanceof BoolExpr boolExpr) {
            return boolExpr.value;
        }

        if(node instanceof ListExpr list) {
            return evaluateList(list);
        }

        if(node instanceof DictExpr dict) {
            return evaluateDict(dict);
        }

        if(node instanceof NoneExpr none) {
            return null;
        }

        if(node instanceof NameExpr identifier) {
            if ("next".equals(identifier.name)) {
                return identifier.name;
            }

            if(!context.contains(identifier.name)) {
                throw new RuntimeException(
                        "Undefined variable: "
                                + identifier.name
                );
            }

            return context.get(identifier.name);
        }

        if(node instanceof GenExpr genExpr) {
            return evaluateGenExpr(genExpr);
        }

        if(node instanceof ArgKw argKw) {
            return evaluate(argKw.value);
        }

        if(node instanceof BinaryExpr binary) {
            return evaluateBinary(binary);
        }

        if (node instanceof PrimaryExpr primary) {
            return evaluatePrimary(primary);
        }


        return null;
    }

    private Object evaluateBinary(BinaryExpr expr) {

        Object left = evaluate(expr.left);

        Object right = evaluate(expr.right);

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

            case "==":
                return equals(left, right);

            case "!=":
                return notEquals(left, right);

            case "<":
                return compare(left, right) < 0;

            case ">":
                return compare(left, right) > 0;

            case "<=":
                return compare(left, right) <= 0;

            case ">=":
                return compare(left, right) >= 0;

            default:
                throw new RuntimeException(
                        "Unknown operator "
                                + expr.operator);
        }
    }

    private boolean equals(Object left, Object right) {
        if (left == null) {
            return right == null;
        }
        return left.equals(right);
    }

    private boolean notEquals(Object left, Object right) {
        return !equals(left, right);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private int compare(Object left, Object right) {
        if (left == null || right == null) {
            throw new RuntimeException("Cannot compare null values");
        }

        if (left instanceof Number && right instanceof Number) {
            return Double.compare(
                    ((Number) left).doubleValue(),
                    ((Number) right).doubleValue());
        }

        if (left instanceof Comparable<?> leftComp && right.getClass().isAssignableFrom(left.getClass())) {
            return ((Comparable) leftComp).compareTo(right);
        }

        throw new RuntimeException(
                "Cannot compare values: " + left + " and " + right);
    }
 

    private Object add(Object left, Object right) {

        // String concatenation
        if (left instanceof String || right instanceof String) {
            return String.valueOf(left) + String.valueOf(right);
        }

        // Numeric addition: preserve integer semantics for int + int
        if (left instanceof Number && right instanceof Number) {
            Number leftNum = (Number) left;
            Number rightNum = (Number) right;

            if (isIntegerLike(leftNum) && isIntegerLike(rightNum)) {
                long intResult = leftNum.longValue() + rightNum.longValue();
                return (int) intResult;
            }

            return leftNum.doubleValue() + rightNum.doubleValue();
        }

        throw new RuntimeException(
                "Cannot add "
                        + left.getClass()
                        + " and "
                        + right.getClass()
        );
    }

    private boolean isIntegerLike(Number value) {
        if (value instanceof Integer || value instanceof Long || value instanceof Short || value instanceof Byte) {
            return true;
        }
        double numeric = value.doubleValue();
        return Double.compare(numeric, Math.rint(numeric)) == 0;
    }

    private Object evaluateList(ListExpr list) {

        List<Object> values = new ArrayList<>();

        for(FlaskASTNode element : list.elements) {

            Object value = evaluate(element);

            values.add(value);
        }

        return values;
    }

    private Object evaluateDict(DictExpr dict) {

        Map<String,Object> values = new HashMap<>();

        for(DictPair pair : dict.pairs) {

            Object value = evaluate(pair.value);

            values.put(pair.key, value);
        }


        return values;
    }

    private Object evaluatePrimary(PrimaryExpr expr) {

        Object value;
        Expr invocationTarget = expr.base;
        try {
            value = evaluate(expr.base);
        } catch (RuntimeException e) {
            if (expr.suffixes.size() == 1 && expr.suffixes.get(0) instanceof CallExpr) {
                value = null;
            } else {
                throw e;
            }
        }

        for (Expr suffix : expr.suffixes) {
            if (suffix instanceof AttrAccessExpr attr) {
                invocationTarget = attr;
                value = applyAttribute(value, attr);
                continue;
            }

            if (suffix instanceof IndexExpr index) {
                invocationTarget = index;
                value = applyIndex(value, index);
                continue;
            }

            if (suffix instanceof CallExpr call) {
                return handleCall(value, call, invocationTarget);
            }
        }

        return value;
    }

    private Object applySuffix(Object value, Expr suffix) {

        if (suffix instanceof AttrAccessExpr attr) {
            return applyAttribute(value, attr);
        }

        if (suffix instanceof IndexExpr index) {
            return applyIndex(value, index);
        }

        throw new RuntimeException(
                "Unknown suffix: " + suffix.getClass());
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private Object handleCall(Object baseValue, CallExpr call, Expr baseExpr) {
        if (baseExpr instanceof AttrAccessExpr attrAccess) {
            if ("append".equals(attrAccess.attribute) && baseValue instanceof List<?> list) {
                if (call.routeArgKws.size() == 1) {
                    Object value = evaluate(call.routeArgKws.get(0).value);
                    ((List) list).add(value);
                    return null;
                }
            }
        }

        if (baseExpr instanceof NameExpr nameExpr) {
            switch (nameExpr.name) {
                case "render_template":
                    return handleRenderTemplate(call);
                case "next":
                    return handleNext(call);
                case "url_for":
                    return handleUrlFor(call);
                case "redirect":
                    return handleRedirect(call);
                case "len":
                    return handleLen(call);
                default:
                    break;
            }
        }

        throw new RuntimeException(
                "Unsupported call for base: " + baseValue);
    }

    private Object handleNext(CallExpr call) {
        Object iterator = null;
        Object defaultValue = null;

        for (int i = 0; i < call.routeArgKws.size(); i++) {
            ArgKw arg = call.routeArgKws.get(i);
            Object value = evaluate(arg.value);
            if (i == 0) {
                iterator = value;
            } else if (i == 1) {
                defaultValue = value;
            }
        }

        if (iterator instanceof List<?> list) {
            return list.isEmpty() ? defaultValue : list.get(0);
        }

        return defaultValue;
    }

    private Object evaluateGenExpr(GenExpr genExpr) {
        Object iterableValue = evaluate(genExpr.iterable);
        if (!(iterableValue instanceof List<?> iterable)) {
            throw new RuntimeException(
                    "Generator iterable must be a list, found: " + iterableValue);
        }

        List<Object> results = new ArrayList<>();

        for (Object item : iterable) {
            RuntimeContext childContext = context.copy();
            childContext.set(genExpr.var, item);

            if (genExpr.condition != null) {
                Object conditionValue = new ValueEvaluator(childContext).evaluate(genExpr.condition);
                if (!(conditionValue instanceof Boolean) || !((Boolean) conditionValue)) {
                    continue;
                }
            }

            Object elementValue = new ValueEvaluator(childContext).evaluate(genExpr.element);
            results.add(elementValue);
        }

        return results;
    }

    private Object applyAttribute(Object value, AttrAccessExpr attr) {

        if (value instanceof Map<?, ?> map) {
            return map.get(attr.attribute);
        }

        if (value instanceof List<?> list && "append".equals(attr.attribute)) {
            return list;
        }

        if (value == null && "request".equals(attr.attribute)) {
            return context.get("request");
        }

        throw new RuntimeException(
                "Cannot access attribute "
                        + attr.attribute);
    }

    private Object applyIndex(
            Object value,
            IndexExpr index
    ) {

        Object key = evaluate(index.index);

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

    private Object handleUrlFor(CallExpr call) {
        Object routes = context.get("urls");
        if (!(routes instanceof Map<?, ?> routeMap)) {
            return null;
        }

        String routeName = null;
        Map<String, Object> paramValues = new HashMap<>();
        boolean firstArgSeen = false;
        for (ArgKw arg : call.routeArgKws) {
            if (arg == null) {
                continue;
            }

            Object evaluatedValue = evaluate(arg.value);
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

    private Object handleRedirect(CallExpr call) {
        if (call.routeArgKws.isEmpty()) {
            return null;
        }

        Object target = evaluate(call.routeArgKws.get(0).value);
        String targetUrl = target != null ? String.valueOf(target) : null;
        if (targetUrl == null) {
            return null;
        }
        return new RedirectResponse(targetUrl, 302);
    }

    private Object handleLen(CallExpr call) {
        if (call.routeArgKws.size() != 1) {
            throw new RuntimeException("len() takes exactly one argument");
        }

        Object value = evaluate(call.routeArgKws.get(0).value);
        if (value instanceof List<?> list) {
            return list.size();
        }
        if (value instanceof Map<?, ?> map) {
            return map.size();
        }
        if (value instanceof String s) {
            return s.length();
        }
        throw new RuntimeException("Unsupported type for len(): " + (value == null ? "null" : value.getClass()));
    }

    private TemplateRenderRequest handleRenderTemplate(CallExpr call) {

        // First argument: template name
        Object templateValue = evaluate(call.routeArgKws.get(0));


        String templateName = (String) templateValue;


        RuntimeContext templateContext = new RuntimeContext();

        Object routes = context.get("urls");
        if (routes != null) {
            templateContext.set("urls", routes);
        }

        // keyword arguments
        for (ArgKw arg : call.routeArgKws) {

            Object value = evaluate(arg.value);

            if (arg.name != null) {
                templateContext.set(arg.name, value);
            }
        }

        return new TemplateRenderRequest(templateName, templateContext);
    }
}