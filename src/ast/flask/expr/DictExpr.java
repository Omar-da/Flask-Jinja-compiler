package ast.flask.expr;

import ast.flask.misc.DictPair;

import java.util.List;

public class DictExpr extends Expr {
    public final List<DictPair> pairs;

    public DictExpr(List<DictPair> pairs, int line, int column) {
        super(line, column);
        this.pairs = pairs;
        addChildrenFrom(pairs);
    }

    @Override
    public String toString() {
        return String.valueOf(pairs);
    }
}
