package ast.flask;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FlaskASTPrinter {

    public static void print(FlaskASTNode root) throws IOException {
        writeJson(root, "src/output/ast_python.json");
    }

    public static void writeJson(FlaskASTNode root, String outputPath) throws IOException {
        Path path = Path.of(outputPath);
        Files.createDirectories(path.getParent());

        String json = root == null ? "null" : serializeNode(root);
        Files.writeString(path, json, StandardCharsets.UTF_8);
    }

    private static String serializeNode(FlaskASTNode node) {
        return serializeNode(node, 0);
    }

    private static String serializeNode(FlaskASTNode node, int indentLevel) {
        if (node == null) {
            return "null";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        builder.append(indent(indentLevel + 1)).append("\"type\": \"").append(escapeJson(node.getClass().getSimpleName())).append("\",\n");
        builder.append(indent(indentLevel + 1)).append("\"content\": \"").append(escapeJson(node.toString())).append("\",\n");
        builder.append(indent(indentLevel + 1)).append("\"position\": {\n");
        builder.append(indent(indentLevel + 2)).append("\"line\": ").append(node.line).append(",\n");
        builder.append(indent(indentLevel + 2)).append("\"column\": ").append(node.column).append("\n");
        builder.append(indent(indentLevel + 1)).append("},\n");
        builder.append(indent(indentLevel + 1)).append("\"children\": [");

        List<FlaskASTNode> children = node.getChildren();
        if (children.isEmpty()) {
            builder.append("]\n");
        } else {
            builder.append("\n");
            for (int i = 0; i < children.size(); i++) {
                builder.append(indent(indentLevel + 2)).append(serializeNode(children.get(i), indentLevel + 2));
                if (i < children.size() - 1) {
                    builder.append(",");
                }
                builder.append("\n");
            }
            builder.append(indent(indentLevel + 1)).append("]\n");
        }

        builder.append(indent(indentLevel)).append("}");
        return builder.toString();
    }

    private static String indent(int level) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            builder.append("  ");
        }
        return builder.toString();
    }

    private static String escapeJson(String value) {
        if (value == null) {
            return "";
        }

        return value
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
