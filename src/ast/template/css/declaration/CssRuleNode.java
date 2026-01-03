package ast.template.css.declaration;

import ast.template.TemplateASTNode;
import ast.template.css.selector.CssSelectorListNode;

public class CssRuleNode extends TemplateASTNode {
    public final CssSelectorListNode selectors;
    public final CssDeclarationListNode declarations;

    public CssRuleNode(
            CssSelectorListNode selectors,
            CssDeclarationListNode declarations,
            int line,
            int column
    ) {
        super(line, column);
        this.selectors = selectors;
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        return "\nTemplateCssRuleNode{ " +
                line + ":" + column +
                ", selectors=" + selectors +
                ", declarations=" + declarations +
                '}';
    }
}
