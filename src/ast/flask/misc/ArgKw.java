package ast.flask.misc;

import ast.flask.FlaskASTNode;
import ast.flask.expr.Expr;

public class ArgKw extends FlaskASTNode {
    public final String name;  // keyword argument name
    public final Expr value;   // expression assigned to this argument

    public ArgKw(String name, Expr value, int line, int column) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ArgKw{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
