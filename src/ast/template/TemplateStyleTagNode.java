package ast.template;

import ast.template.css.declaration.CssRulesNode;

public class TemplateStyleTagNode extends TemplateElementNode {
    public final CssRulesNode rules;

    public TemplateStyleTagNode(CssRulesNode rules, int line, int column) {
        super(line, column);
        this.rules = rules;
        addChildren(rules);
    }

    @Override
    public String toString() {
        return String.valueOf(rules);
    }
}
