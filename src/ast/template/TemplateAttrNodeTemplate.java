package ast.template;

public class TemplateAttrNodeTemplate extends TemplateASTNode {
    public final String key;
    public final TemplateQuotedNodeTemplate value;

    public TemplateAttrNodeTemplate(String key, TemplateQuotedNodeTemplate value) { super(); this.key = key; this.value = value; }
    public TemplateAttrNodeTemplate(String key, TemplateQuotedNodeTemplate value, int line, int column) { super(line, column); this.key = key; this.value = value; }

    @Override
    public String toString() {
        return "TemplateAttrNode{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
