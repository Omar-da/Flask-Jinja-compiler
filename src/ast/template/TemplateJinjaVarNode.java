package ast.template;


import ast.template.expr.TemplateExpr;

public class TemplateJinjaVarNode extends TemplateASTNode {
    public TemplateExpr expr;

    public TemplateJinjaVarNode(TemplateExpr expr, int line, int column) {
        super(line, column);
        this.expr = expr;
        addChildren(expr);
    }

    @Override
    public String toString() {
        return "";
    }
}
