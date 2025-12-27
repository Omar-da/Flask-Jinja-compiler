package ast.flask.expr;

public class NoneExpr extends Expr {

    public NoneExpr(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "NoneExpr{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
