package ast.template;

public class FlaskAtomNode extends FlaskExprNode {
    public final String value;

    public FlaskAtomNode(String value) { super(); this.value = value; }
    public FlaskAtomNode(String value, int line, int column) { super(line, column); this.value = value; }
}
