package ast.template.css.declaration;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssRulesNode extends TemplateASTNode {
    public final List<CssRuleNode> rules = new ArrayList<>();

    public CssRulesNode(int line, int column) {
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
