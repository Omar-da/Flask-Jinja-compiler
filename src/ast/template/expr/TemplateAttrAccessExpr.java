package ast.template.expr;
public class TemplateAttrAccessExpr extends TemplateExpr {
    public final String attribute;

    public TemplateAttrAccessExpr(String attribute, int line, int column) {
        super(line, column);
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "\nTemplateAttrAccessExpr{ " +
                line + ":" + column +
                ", attribute=" + attribute +
                '}';
    }


}
