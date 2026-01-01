package ast.flask.stmt;

import ast.flask.FlaskASTNode;

public abstract class Stmt extends FlaskASTNode {
    protected Stmt(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nStmt{ " +
                line + ":" + column +
                '}';
    }
}
