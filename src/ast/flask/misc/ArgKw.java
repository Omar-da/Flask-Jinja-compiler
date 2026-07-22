package ast.flask.misc;


import ast.flask.FlaskASTNode;
import ast.flask.expr.Expr;

public class ArgKw extends FlaskASTNode {
    public final String name;
    public final Expr value;

    public ArgKw(String name, Expr value, int line, int column) {
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
