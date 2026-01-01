package ast.flask.misc;

import ast.flask.FlaskASTNode;
import ast.flask.expr.Expr;

public class Param extends FlaskASTNode {
    public final String name;
    public final Expr defaultValue;

    public Param(String name, Expr defaultValue, int line, int column) {
        super(line, column);
        this.name = name;
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "\nParam{ " +
                line + ":" + column +
                ", name='" + name + '\'' +
                ", defaultValue=" + defaultValue +
                '}';
    }
}
