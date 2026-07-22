package ast.flask.misc;

import ast.flask.FlaskASTNode;
import ast.flask.expr.Expr;

public class RouteArgKw extends FlaskASTNode implements RouteArg {
    public final String name;
    public final Expr value;

    public RouteArgKw(String name, Expr value, int line, int column) {
        super(line, column);
        this.name = name;
        this.value = value;
        addChildrenFrom(value);
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
