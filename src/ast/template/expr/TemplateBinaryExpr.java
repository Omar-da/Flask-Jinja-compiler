package ast.template.expr;

public class TemplateBinaryExpr extends TemplateExpr {
    public final TemplateExpr left;
    public final String operator;
    public final TemplateExpr right;

    public TemplateBinaryExpr(TemplateExpr left, String operator, TemplateExpr right, int line, int column) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString() {
        return "\nTemplateBinaryExpr{ " +
                line + ":" + column +
                ", left=" + left +
                ", operator='" + operator + '\'' +
                ", right=" + right +
                '}';
    }

}
