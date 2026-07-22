package ast.template.expr;

import ast.flask.expr.Expr;

public class TemplateIndexExpr extends TemplateExpr {
    public final TemplateExpr index;

    public TemplateIndexExpr(TemplateExpr index, int line, int column) {
        super(line, column);
        this.index = index;
        addChildren(index);
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }
}
