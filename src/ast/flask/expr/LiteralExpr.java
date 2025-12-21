package ast.flask.expr;

public class LiteralExpr extends Expr {
    public final Object value;

    public LiteralExpr(Object value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
