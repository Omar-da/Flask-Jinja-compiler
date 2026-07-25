package codegen.jinja;

import ast.template.TemplateASTNode;
import codegen.python.RuntimeContext;

public class JinjaRenderer {

    private final StringBuilder html =
            new StringBuilder();

    public String render(
            TemplateASTNode root,
            RuntimeContext context) {

        visit(root, context);

        return html.toString();
    }

    private void visit(
            TemplateASTNode node,
            RuntimeContext context) {

    }
}