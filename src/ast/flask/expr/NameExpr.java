package ast.flask.expr;

public class NameExpr extends Expr {
    public final String name;

    public NameExpr(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nNameExpr{ " +
                line + ":" + column +
                ", name='" + name + '\'' +
                '}';
    }

}
