package ast.template.expr;
public class TemplateLiteralExpr extends TemplateExpr {
    public final Object value;

    @Override
    public String toString() {
        return "\nTemplateLiteralExpr{ " +
                line + ":" + column +
                ", value=" + value +
                '}';
    }

    public TemplateLiteralExpr(Object value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
