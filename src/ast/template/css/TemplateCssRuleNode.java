package ast.template.css;

import ast.template.TemplateASTNode;

public class TemplateCssRuleNode extends TemplateASTNode {
    public final TemplateCssSelectorListNode selectors;
    public final TemplateCssDeclarationListNode declarations;

    public TemplateCssRuleNode(
            TemplateCssSelectorListNode selectors,
            TemplateCssDeclarationListNode declarations,
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
