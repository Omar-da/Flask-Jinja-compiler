package ast.template.expr;
public class TemplateBoolExpr extends TemplateExpr {

    public final boolean value;

    public TemplateBoolExpr(boolean value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nTemplateBoolExpr{ " +
                line + ":" + column +
                ", value=" + value +
                '}';
    }
}
