package ast.flask.expr;

public class BinaryExpr extends Expr {
    public final Expr left;
    public final String operator;
    public final Expr right;

    public BinaryExpr(Expr left, String operator, Expr right, int line, int column) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString() {
        return "\nBinaryExpr{ " +
                line + ":" + column +
                ", left=" + left +
                ", operator='" + operator + '\'' +
                ", right=" + right +
                '}';
    }

}
