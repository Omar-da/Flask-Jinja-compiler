package ast.template;

public class TemplateQuotedNodeTemplate extends TemplateASTNode {
    public final String content;

    public TemplateQuotedNodeTemplate(String content) { super(); this.content = content; }
    public TemplateQuotedNodeTemplate(String content, int line, int column) { super(line, column); this.content = content; }

    @Override
    public String toString() {
        return "TemplateQuotedNode{" +
                "content='" + content + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
