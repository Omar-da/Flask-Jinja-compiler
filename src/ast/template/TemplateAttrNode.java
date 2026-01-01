package ast.template;

public class TemplateAttrNode extends TemplateASTNode {

    public final String name;
    public final AttrValueNode attrValueNode;

    public TemplateAttrNode(String name, AttrValueNode attrValueNode, int line, int column) {
        super(line, column);
        this.name = name;
        this.attrValueNode = attrValueNode;
    }

    @Override
    public String toString() {
        return "\nTemplateAttrNode{ " +
                line + ":" + column +
                ", name='" + name + '\'' +
                ", attrValueNode=" + attrValueNode +
                '}';
    }
}
