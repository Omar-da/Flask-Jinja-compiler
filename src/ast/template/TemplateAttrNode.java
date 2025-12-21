package ast.template;

public class TemplateAttrNode extends ASTNode {
    public final String key;
    public final TemplateQuotedNode value;

    public TemplateAttrNode(String key, TemplateQuotedNode value) { super(); this.key = key; this.value = value; }
    public TemplateAttrNode(String key, TemplateQuotedNode value, int line, int column) { super(line, column); this.key = key; this.value = value; }
}
