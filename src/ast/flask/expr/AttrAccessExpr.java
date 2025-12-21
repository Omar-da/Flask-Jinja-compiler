package ast.flask.expr;

public class AttrAccessExpr extends Expr {
    public final Expr target;
    public final String attribute;

    public AttrAccessExpr(Expr target, String attribute, int line, int column) {
        super(line, column);
        this.target = target;
        this.attribute = attribute;
    }
}
