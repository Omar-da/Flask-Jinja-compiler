package ast.flask.stmt;

import ast.flask.expr.Expr;
import java.util.List;

public class RouteDefStmt extends Stmt {
    public final Expr route;
    public final List<Expr> args;
    public final FuncDefStmt function;

    public RouteDefStmt(Expr route, List<Expr> args, FuncDefStmt function, int line, int column) {
        super(line, column);
        this.route = route;
        this.args = args;
        this.function = function;
    }
}
