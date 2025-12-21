package ast.flask.misc;

import ast.flask.ASTNode;
import ast.flask.expr.Expr;

public class DictPair extends ASTNode {
    public final Expr key;
    public final Expr value;

    public DictPair(Expr key, Expr value, int line, int column) {
        super(line, column);
        this.key = key;
        this.value = value;
    }
}
