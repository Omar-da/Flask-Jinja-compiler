package ast.template.expr;


import java.util.List;

public class TemplatePrimaryExpr extends TemplateExpr {
    public final TemplateExpr base;
    public final List<TemplateExpr> suffixes;

    public TemplatePrimaryExpr(TemplateExpr base, List<TemplateExpr> suffixes, int line, int column) {
        super(line, column);
        this.base = base;
        this.suffixes = suffixes;
        addChildrenFrom(base, suffixes);
    }

    @Override
    public String toString() {
        return String.valueOf(base);
    }

}
