package ast.template;

import java.util.List;

public class FlaskListNode extends FlaskExprNode {
    public final List<FlaskExprNode> elements;

    public FlaskListNode(List<FlaskExprNode> elements) { super(); this.elements = elements; }
    public FlaskListNode(List<FlaskExprNode> elements, int line, int column) { super(line, column); this.elements = elements; }
}
