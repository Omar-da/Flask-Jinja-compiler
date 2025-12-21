package ast.flask.misc;

import ast.flask.ASTNode;
import ast.flask.expr.Expr;

public class Param extends ASTNode {
    public final String name;
    public final Expr defaultValue;

    public Param(String name, Expr defaultValue, int line, int column) {
        super(line, column);
        this.name = name;
        this.defaultValue = defaultValue;
    }
}
