package ast.template;

public class FlaskAtomNodeTemplate extends FlaskExprNodeTemplate {
    public final String value;

    public FlaskAtomNodeTemplate(String value) { super(); this.value = value; }
    public FlaskAtomNodeTemplate(String value, int line, int column) { super(line, column); this.value = value; }

    @Override
    public String toString() {
        return "FlaskAtomNode{" +
                "value='" + value + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
