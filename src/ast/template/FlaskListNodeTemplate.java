package ast.template;

import java.util.List;

public class FlaskListNodeTemplate extends FlaskExprNodeTemplate {
    public final List<FlaskExprNodeTemplate> elements;

    public FlaskListNodeTemplate(List<FlaskExprNodeTemplate> elements) { super(); this.elements = elements; }
    public FlaskListNodeTemplate(List<FlaskExprNodeTemplate> elements, int line, int column) { super(line, column); this.elements = elements; }

    @Override
    public String toString() {
        return "FlaskListNode{" +
                "elements=" + elements +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
