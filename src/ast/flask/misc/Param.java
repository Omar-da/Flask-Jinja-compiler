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
        addChildrenFrom(defaultValue);
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
