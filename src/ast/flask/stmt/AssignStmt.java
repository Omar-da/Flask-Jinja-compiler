package ast.flask.stmt;

import ast.flask.expr.Expr;

public class AssignStmt extends Stmt {
    public final Expr target;
    public final Expr value;

    public AssignStmt(Expr target, Expr value, int line, int column) {
        super(line, column);
        this.target = target;
        this.value = value;
    }
}
