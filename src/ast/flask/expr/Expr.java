package ast.flask.expr;

import ast.flask.FlaskASTNode;

public abstract class Expr extends FlaskASTNode {
    protected Expr(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nExpr{ " +
                line + ":" + column +
                '}';
    }
}
