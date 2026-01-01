package ast.flask.expr;

public class AttrAccessExpr extends Expr {
    public final String attribute;

    public AttrAccessExpr(String attribute, int line, int column) {
        super(line, column);
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "\nAttrAccessExpr{ " +
                line + ":" + column +
                ", attribute='" + attribute + '\'' +
                '}';
    }


}
