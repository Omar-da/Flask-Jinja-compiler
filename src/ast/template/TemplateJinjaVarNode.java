package ast.template;


import ast.template.expr.TemplateExpr;

public class TemplateJinjaVarNode extends TemplateASTNode {
    public TemplateExpr expr;

    public TemplateJinjaVarNode(TemplateExpr expr) {
        super();
        this.expr = expr;
    }

    public TemplateJinjaVarNode(TemplateExpr expr, int line, int column) {
        super(line, column);
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "\nTemplateJinjaVarNode{ " +
                line + ":" + column +
                ", expr=" + expr +
                '}';
    }
}
