package ast.template;

import ast.template.TemplateASTNode;

public abstract class QuotedItemNode extends TemplateASTNode {
    public QuotedItemNode(int line, int column) {
        super(line, column);
    }
}
