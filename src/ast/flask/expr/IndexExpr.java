package ast.flask.expr;

public class IndexExpr extends Expr {
    public final Expr target;
    public final Expr index;

    public IndexExpr(Expr target, Expr index, int line, int column) {
        super(line, column);
        this.target = target;
        this.index = index;
    }
}
