package ast.flask.stmt;

import ast.flask.misc.RouteArg;

import java.util.List;

public class RouteDefStmt extends Stmt {
    public final List<RouteArg> routeArgs;
    public final FuncDefStmt function;

    public RouteDefStmt(List<RouteArg> routeArgs, FuncDefStmt function, int line, int column) {
        super(line, column);
        this.routeArgs = routeArgs;
        this.function = function;
    }

    @Override
    public String toString() {
        return "\nRouteDefStmt{ " +
                line + ":" + column +
                ", args=" + routeArgs +
                ", function=" + function +
                "}";
    }
}
