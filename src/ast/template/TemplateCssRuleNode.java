package ast.template;

import java.util.List;

/**
 * A CSS rule: selector(s) + declarations
 */
public class TemplateCssRuleNode extends ASTNode {
    public final List<TemplateCssSelectorNode> selectors;
    public final List<TemplateCssDeclarationNode> declarations;

    public TemplateCssRuleNode(List<TemplateCssSelectorNode> selectors, List<TemplateCssDeclarationNode> declarations) {
        super();
        this.selectors = selectors;
        this.declarations = declarations;
    }

    public TemplateCssRuleNode(List<TemplateCssSelectorNode> selectors, List<TemplateCssDeclarationNode> declarations, int line, int column) {
        super(line, column);
        this.selectors = selectors;
        this.declarations = declarations;
    }
}
