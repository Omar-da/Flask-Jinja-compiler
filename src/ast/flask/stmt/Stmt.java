package ast.flask.stmt;

import ast.flask.ASTNode;

public abstract class Stmt extends ASTNode {
    protected Stmt(int line, int column) {
        super(line, column);
    }
}
