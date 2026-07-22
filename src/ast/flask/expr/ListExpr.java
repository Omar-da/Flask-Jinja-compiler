package ast.flask.expr;

import java.util.List;

public class ListExpr extends Expr {
    public final List<Expr> elements;

    public ListExpr(List<Expr> elements, int line, int column) {
        super(line, column);
        this.elements = elements;
        addChildrenFrom(elements);
    }

    @Override
    public String toString() {
        return String.valueOf(elements);
    }

}
