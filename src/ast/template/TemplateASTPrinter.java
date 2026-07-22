package ast.template;

import java.util.List;

public class TemplateASTPrinter {

    public static void print(TemplateASTNode root) {
        if (root == null) {
            System.out.println("(empty AST)");
            return;
        }

        printNode(root, "", true);
    }

    private static void printNode(TemplateASTNode node, String prefix, boolean isLast) {
        String connector = isLast ? "└── " : "├── ";
        System.out.println(prefix + connector + getNodeLabel(node));

        String childPrefix = prefix + (isLast ? "    " : "│   ");
        List<TemplateASTNode> children = node.getChildren();
        if (children == null || children.isEmpty()) {
            return;
        }

        for (int i = 0; i < children.size(); i++) {
            printNode(children.get(i), childPrefix, i == children.size() - 1);
        }
    }

    private static String getNodeLabel(TemplateASTNode node) {
        if (node == null) {
            return "<null>";
        }

        String type = node.getClass().getSimpleName();
        String content = node.toString();
        boolean hasChildren = !node.getChildren().isEmpty();
        return formatNodeLabel(type, content, node.line, node.column, hasChildren);
    }

    private static String formatNodeLabel(String type, String content, int line, int column, boolean hasChildren) {
        String position = line + ":" + column;
        if (content == null || content.isBlank() || type.equals("TemplatePrimaryExpr") || type.equals("TemplateCallExpr") || type.equals("TemplateArgKw")) {
            return type + "(" + position + ")";
        }
        if (hasChildren) {
            return type + "(" + content + ")" + "(" + position + ")";
        }
        return type + "(" + content + ")" + "(" + position + ")";
    }
}
