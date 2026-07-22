package ast.flask.expr;

public class BoolExpr extends Expr {

    public final boolean value;

    public BoolExpr(boolean value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
