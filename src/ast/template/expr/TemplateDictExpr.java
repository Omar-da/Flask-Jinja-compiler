package ast.template.expr;

import ast.template.misc.TemplateDictPair;

import java.util.List;

public class TemplateDictExpr extends TemplateExpr {
    public final List<TemplateDictPair> pairs;

    public TemplateDictExpr(List<TemplateDictPair> pairs, int line, int column) {
        super(line, column);
        this.pairs = pairs;
        addChildren(pairs);
    }

    @Override
    public String toString() {
        return String.valueOf(pairs);
    }
}
