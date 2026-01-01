package ast.template.css;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateCssRulesNode extends TemplateASTNode {
    public final List<TemplateCssRuleNode> rules = new ArrayList<>();

    public TemplateCssRulesNode(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "\nTemplateCssRulesNode{ " +
                line + ":" + column +
                ", rules=" + rules +
                '}';
    }
}
