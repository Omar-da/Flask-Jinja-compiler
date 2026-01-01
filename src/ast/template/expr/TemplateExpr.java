package ast.template.expr;

import ast.template.TemplateASTNode;

public abstract class TemplateExpr extends TemplateASTNode {
    protected TemplateExpr(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nTemplateExpr{ " +
                line + ":" + column +
                '}';
    }
}
