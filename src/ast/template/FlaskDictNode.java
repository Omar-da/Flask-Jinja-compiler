package ast.template;

import java.util.Map;

public class FlaskDictNode extends FlaskExprNode {
    public final Map<String, FlaskExprNode> pairs;

    public FlaskDictNode(Map<String, FlaskExprNode> pairs) { super(); this.pairs = pairs; }
    public FlaskDictNode(Map<String, FlaskExprNode> pairs, int line, int column) { super(line, column); this.pairs = pairs; }
}
