package ast.flask.expr;

import ast.flask.ASTNode;

public abstract class Expr extends ASTNode {
    protected Expr(int line, int column) {
        super(line, column);
    }
}
