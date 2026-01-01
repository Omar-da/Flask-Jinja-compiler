package ast.template.expr;

import ast.flask.expr.Expr;

public class TemplateAppExpr extends TemplateExpr {

    public TemplateAppExpr(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nTemplateAppExpr{ " +
                line + ":" + column +
                '}';
    }
}
