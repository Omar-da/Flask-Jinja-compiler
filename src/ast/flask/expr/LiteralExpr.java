package ast.flask.expr;

import ast.flask.misc.LiteralType;

public class LiteralExpr extends Expr {
    public final Object value;
    public final LiteralType type;

    public LiteralExpr(Object value, LiteralType type, int line, int column) {
        super(line, column);
        this.value = value;
        this.type = type;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
