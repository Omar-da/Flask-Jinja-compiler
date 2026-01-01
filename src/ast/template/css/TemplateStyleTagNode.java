package ast.template.css;

import ast.template.TemplateElementNode;

public class TemplateStyleTagNode extends TemplateElementNode {
    public final TemplateCssRulesNode rules;

    public TemplateStyleTagNode(TemplateCssRulesNode rules, int line, int column) {
        super(line, column);
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "\nTemplateStyleTagNode{ " +
                line + ":" + column +
                ", rules=" + rules +
                '}';
    }
}
