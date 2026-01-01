package ast.template.expr;

public class TemplateGenExpr extends TemplateExpr {
    public final TemplateExpr element;
    public final String var;


    public final TemplateExpr iterable;
    public final TemplateExpr condition;

    public TemplateGenExpr(TemplateExpr element, String var, TemplateExpr iterable, TemplateExpr condition, int line, int column) {
        super(line, column);
        this.element = element;
        this.var = var;
        this.iterable = iterable;
        this.condition = condition;
    }
    @Override
    public String toString() {
        return "\nTemplateGenExpr{ " +
                line + ":" + column +
                ", element=" + element +
                ", var=" + var +
                ", iterable=" + iterable +
                ", condition=" + condition +
                '}';
    }
}
