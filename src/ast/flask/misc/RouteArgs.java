package ast.flask.misc;

import ast.flask.FlaskASTNode;

import java.util.List;

public class RouteArgs extends FlaskASTNode {
    public final List<RouteArg> routeArgs;

    public RouteArgs(List<RouteArg> routeArgs, int line, int column) {
        super(line, column);
        this.routeArgs = routeArgs;
        addChildrenFrom(routeArgs);
    }

    @Override
    public String toString() {
        return String.valueOf(routeArgs);
    }
}

