package ast.flask.stmt;

import ast.flask.expr.Expr;

public class ExprStmt extends Stmt {
    public final Expr expr;

    public ExprStmt(Expr expr, int line, int column) {
        super(line, column);
        this.expr = expr;
    }
}
