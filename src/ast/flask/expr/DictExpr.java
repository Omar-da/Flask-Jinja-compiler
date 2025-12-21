package ast.flask.expr;

import java.util.List;

public class DictExpr extends Expr {
    public final List<DictEntry> entries;

    public DictExpr(List<DictEntry> entries, int line, int column) {
        super(line, column);
        this.entries = entries;
    }
}
