package ast.flask.expr;

public class AppExpr extends Expr {

    public AppExpr(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "AppExpr{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
