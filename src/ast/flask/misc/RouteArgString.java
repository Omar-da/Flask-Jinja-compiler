package ast.flask.misc;

import ast.flask.expr.Expr;

public class RouteArgString extends Expr implements RouteArg {
    public final String path;

    public RouteArgString(String path, int line, int column) {
        super(line, column);
        this.path = path;
    }

    @Override
    public String toString() {
        return "\nArgString{ " +
                line + ":" + column +
                ", path='" + path + '\'' +
                '}';
    }
}
