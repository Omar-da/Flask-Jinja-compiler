package ast.flask.misc;

import ast.flask.FlaskASTNode;
import ast.flask.expr.Expr;

public class DictPair extends FlaskASTNode {
    public final String key;
    public final Expr value;

    public DictPair(int line, int column, String key, Expr value) {
        super(line, column);
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nDictPair{ " +
                line + ":" + column +
                ", key=" + key +
                ", value=" + value +
                '}';
    }
}
