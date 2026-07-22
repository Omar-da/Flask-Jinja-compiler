package ast.template;

import java.util.ArrayList;
import java.util.List;

public class AttrValueNode extends TemplateASTNode {

    List<QuotedItemNode> attrValues = new ArrayList();

    public AttrValueNode(int line, int column, List<QuotedItemNode> attrValues) {
        super(line, column);
        this.attrValues = attrValues;
        addChildren(attrValues);
    }

    @Override
    public String toString() {
        return "";
    }
}


