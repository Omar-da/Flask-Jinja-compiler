package ast.template;

public class TemplateQuotedNode extends ASTNode {
    public final String content;

    public TemplateQuotedNode(String content) { super(); this.content = content; }
    public TemplateQuotedNode(String content, int line, int column) { super(line, column); this.content = content; }
}
