package ast.flask.misc;

import ast.flask.FlaskASTNode;
import ast.flask.expr.Expr;

public class DictPair extends FlaskASTNode {
    public final String key;
    public final Expr value;

    public DictPair(String key, Expr value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DictEntry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
