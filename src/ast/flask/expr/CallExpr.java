package ast.flask.expr;

import ast.flask.misc.Arg;
import java.util.List;

public class CallExpr extends Expr {
    public final Expr callee;
    public final List<Arg> args;

    public CallExpr(Expr callee, List<Arg> args, int line, int column) {
        super(line, column);
        this.callee = callee;
        this.args = args;
    }
}
