
package ast.flask.expr;

import java.util.List;

import ast.flask.misc.ArgKw;

public class CallExpr extends Expr {
    public final List<ArgKw> routeArgKws;

    public CallExpr(List<ArgKw> routeArgKws, int line, int column) {
        super(line, column);
        this.routeArgKws = routeArgKws;
        addChildrenFrom(routeArgKws);
    }

    @Override
    public String toString() {
        return String.valueOf(routeArgKws);
    }
}
