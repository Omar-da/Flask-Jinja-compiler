package ast.template.expr;

public class TemplateNoneExpr extends TemplateExpr {

    public TemplateNoneExpr(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "";
    }
}
