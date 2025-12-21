package ast.flask.expr;

public class GenExpr extends Expr {
    public final Expr element;
    public final String var;
    public final Expr iterable;
    public final Expr condition;

    public GenExpr(Expr element, String var, Expr iterable, Expr condition, int line, int column) {
        super(line, column);
        this.element = element;
        this.var = var;
        this.iterable = iterable;
        this.condition = condition;
    }
}
