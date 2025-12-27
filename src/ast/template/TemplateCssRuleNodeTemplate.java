package ast.template;

import java.util.List;

/**
 * A CSS rule: selector(s) + declarations
 */
public class TemplateCssRuleNodeTemplate extends TemplateASTNode {
    public final List<TemplateCssSelectorNodeTemplate> selectors;
    public final List<TemplateCssDeclarationNodeTemplate> declarations;

    public TemplateCssRuleNodeTemplate(List<TemplateCssSelectorNodeTemplate> selectors, List<TemplateCssDeclarationNodeTemplate> declarations) {
        super();
        this.selectors = selectors;
        this.declarations = declarations;
    }

    public TemplateCssRuleNodeTemplate(List<TemplateCssSelectorNodeTemplate> selectors, List<TemplateCssDeclarationNodeTemplate> declarations, int line, int column) {
        super(line, column);
        this.selectors = selectors;
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        return "TemplateCssRuleNode{" +
                "selectors=" + selectors +
                ", declarations=" + declarations +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
