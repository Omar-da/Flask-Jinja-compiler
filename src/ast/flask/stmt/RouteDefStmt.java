package ast.flask.stmt;

import ast.flask.misc.RouteArg;

import java.util.List;

public class RouteDefStmt extends Stmt {
    public final List<RouteArg> routeArgs;
    public final FuncDefStmt function;
    public final String method;

    public RouteDefStmt(List<RouteArg> routeArgs, FuncDefStmt function, String method, int line, int column) {
        super(line, column);
        this.routeArgs = routeArgs;
        this.function = function;
        this.method = method == null ? "ANY" : method.toUpperCase();
        addChildrenFrom(routeArgs, function);
    }

    @Override
    public String toString() {
        return method + " " + routeArgs;
    }
}
