package ast.template.expr;

import java.util.List;

public class TemplateListExpr extends TemplateExpr {
    public final List<TemplateExpr> elements;

    public TemplateListExpr(List<TemplateExpr> elements, int line, int column) {
        super(line, column);
        this.elements = elements;
        addChildren(elements);
    }

    @Override
    public String toString() {
        return String.valueOf(elements);
    }

}
