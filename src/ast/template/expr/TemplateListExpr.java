package ast.template.expr;

import java.util.List;

public class TemplateListExpr extends TemplateExpr {
    public final List<TemplateExpr> elements;

    public TemplateListExpr(List<TemplateExpr> elements, int line, int column) {
        super(line, column);
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "\nTemplateListExpr{ " +
                line + ":" + column +
                ", elements=" + elements +
                '}';
    }

}
