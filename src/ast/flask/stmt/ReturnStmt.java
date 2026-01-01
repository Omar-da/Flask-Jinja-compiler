package ast.flask.stmt;

import ast.flask.expr.Expr;

public class ReturnStmt extends Stmt {
    public final Expr value;

    public ReturnStmt(Expr value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nReturnStmt{ " +
                line + ":" + column +
                ", value=" + value +
                "}";
    }
}
