package ast.flask.expr;

import ast.flask.misc.ArgKw;
import ast.flask.misc.RouteRouteArgKw;

import java.util.List;

public class CallExpr extends Expr {
    public final List<ArgKw> routeArgKws;

    public CallExpr(List<ArgKw> routeArgKws, int line, int column) {
        super(line, column);
        this.routeArgKws = routeArgKws;
    }

    @Override
    public String toString() {
        return "CallExpr{" +
                "line=" + line +
                ", column=" + column +
                ", args=" + routeArgKws +
                '}';
    }
}
