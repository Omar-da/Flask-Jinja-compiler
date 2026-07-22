package ast.template.css.declaration;

import java.util.ArrayList;
import java.util.List;

import ast.template.TemplateASTNode;

public class CssRulesNode extends TemplateASTNode {
    public final List<CssRuleNode> rules = new ArrayList<>();

    public CssRulesNode(int line, int column) {
        super(line, column);
        addChildrenFrom(rules);
    }

    @Override
    public String toString() {
        return "";
    }
}
