package ast.flask.expr;

import java.util.List;

public class PrimaryExpr extends Expr {
    public final Expr base;
    public final List<Expr> suffixes;

    public PrimaryExpr(Expr base, List<Expr> suffixes, int line, int column) {
        super(line, column);
        this.base = base;
        this.suffixes = suffixes;
    }

    @Override
    public String toString() {
        return "\nPrimaryExpr{ " +
                line + ":" + column +
                ", base=" + base +
                ", suffixes=" + suffixes +
                '}';
    }

}
