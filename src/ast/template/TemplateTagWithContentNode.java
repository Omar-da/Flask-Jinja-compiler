package ast.template;

import ast.template.TemplateASTNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateTagWithContentNode extends TemplateASTNode {

    List<TemplateAttrNode> attrs;

    public TemplateTagWithContentNode(List<TemplateAttrNode> attrs, int line, int column) {
        super(line, column);
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        return "{ " +
                line + ":" + column +
                ", attributes=" + attrs +
                '}';
    }
}
