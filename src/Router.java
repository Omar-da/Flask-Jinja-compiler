import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.flask.stmt.FunctionDefNode;

public class Router {
    public static class RouteMatch {
        public final String routePattern;
        public final FunctionDefNode function;
        public final Map<String, Object> params;

        public RouteMatch(String routePattern, FunctionDefNode function, Map<String, Object> params) {
            this.routePattern = routePattern;
            this.function = function;
            this.params = params;
        }
    }

    private final Map<String, FunctionDefNode> routes = new LinkedHashMap<>();

    public void put(String path, FunctionDefNode function) {
        routes.put(path, function);
    }

    public void putAll(Map<String, FunctionDefNode> functions) {
        if (functions == null) {
            return;
        }
        for (Map.Entry<String, FunctionDefNode> entry : functions.entrySet()) {
            routes.put(entry.getKey(), entry.getValue());
        }
    }

    public RouteMatch lookup(String path) {
        return lookup(path, null);
    }

    public RouteMatch lookup(String path, String method) {
        String normalizedPath = normalizePath(path);
        if (normalizedPath == null) {
            return null;
        }

        String methodKey = method == null ? null : method.trim().toUpperCase();
        if (methodKey != null) {
            String directKey = methodKey + ":" + normalizedPath;
            if (routes.containsKey(directKey)) {
                return new RouteMatch(normalizedPath, routes.get(directKey), Map.of());
            }
        }

        if (routes.containsKey(normalizedPath)) {
            return new RouteMatch(normalizedPath, routes.get(normalizedPath), Map.of());
        }

        for (Map.Entry<String, FunctionDefNode> entry : routes.entrySet()) {
            String candidatePattern = entry.getKey();
            if (methodKey != null && candidatePattern.startsWith(methodKey + ":")) {
                candidatePattern = candidatePattern.substring(methodKey.length() + 1);
            }
            Map<String, Object> params = extractPathParams(candidatePattern, normalizedPath);
            if (params != null) {
                return new RouteMatch(candidatePattern, entry.getValue(), params);
            }
        }

        return null;
    }

    public Map<String, FunctionDefNode> getRoutes() {
        return new LinkedHashMap<>(routes);
    }

    private String normalizePath(String path) {
        if (path == null) {
            return null;
        }
        if (path.length() > 1 && path.endsWith("/")) {
            return path.substring(0, path.length() - 1);
        }
        return path;
    }

    private Map<String, Object> extractPathParams(String routePattern, String requestPath) {
        if (routePattern == null || requestPath == null) {
            return null;
        }

        StringBuilder regex = new StringBuilder("^");
        int index = 0;
        Map<String, String> paramTypes = new LinkedHashMap<>();

        while (index < routePattern.length()) {
            char current = routePattern.charAt(index);
            if (current == '<') {
                int closing = routePattern.indexOf('>', index);
                if (closing < 0) {
                    return null;
                }
                String segment = routePattern.substring(index + 1, closing);
                String paramName;
                String typeName = "string";
                if (segment.contains(":")) {
                    String[] parts = segment.split(":", 2);
                    typeName = parts[0];
                    paramName = parts[1];
                } else {
                    paramName = segment;
                }
                paramTypes.put(paramName, typeName);
                if ("int".equals(typeName)) {
                    regex.append("(?<").append(paramName).append(">[0-9]+)");
                } else {
                    regex.append("(?<").append(paramName).append(">[^/]+)");
                }
                index = closing + 1;
            } else {
                regex.append(Pattern.quote(String.valueOf(current)));
                index++;
            }
        }

        regex.append("$");
        Pattern compiled = Pattern.compile(regex.toString());
        Matcher matcher = compiled.matcher(requestPath);
        if (!matcher.matches()) {
            return null;
        }

        Map<String, Object> params = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : paramTypes.entrySet()) {
            String name = entry.getKey();
            String type = entry.getValue();
            String value = matcher.group(name);
            if (value == null) {
                continue;
            }
            if ("int".equals(type)) {
                params.put(name, Integer.valueOf(value));
            } else {
                params.put(name, value);
            }
        }

        return params;
    }
}
