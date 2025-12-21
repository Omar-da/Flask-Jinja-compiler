package ast.flask.misc;

import ast.flask.ASTNode;
import ast.flask.expr.Expr;

public class Arg extends ASTNode {
    public final String name;
    public final Expr value;

    public Arg(String name, Expr value, int line, int column) {
        super(line, column);
        this.name = name;
        this.value = value;
    }
}
