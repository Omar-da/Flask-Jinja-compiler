package ast.flask.expr;

public class DictEntry {
    public final String key;
    public final Expr value;

    public DictEntry(String key, Expr value) {
        this.key = key;
        this.value = value;
    }
}
