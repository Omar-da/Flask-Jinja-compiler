package ast.template.expr;
public class TemplateNameExpr extends TemplateExpr {
    public final String name;

    public TemplateNameExpr(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }

}
