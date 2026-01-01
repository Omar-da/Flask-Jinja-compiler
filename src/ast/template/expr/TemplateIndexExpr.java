package ast.template.expr;

import ast.flask.expr.Expr;

public class TemplateIndexExpr extends TemplateExpr {
    public final TemplateExpr index;

    public TemplateIndexExpr(TemplateExpr index, int line, int column) {
        super(line, column);
        this.index = index;
    }

    @Override
    public String toString() {
        return "\nTemplateIndexExpr{ " +
                line + ":" + column +
                ", index=" + index +
                '}';
    }
}
