package ast.template;

import java.util.Map;

public class FlaskDictNodeTemplate extends FlaskExprNodeTemplate {
    public final Map<String, FlaskExprNodeTemplate> pairs;

    public FlaskDictNodeTemplate(Map<String, FlaskExprNodeTemplate> pairs) { super(); this.pairs = pairs; }
    public FlaskDictNodeTemplate(Map<String, FlaskExprNodeTemplate> pairs, int line, int column) { super(line, column); this.pairs = pairs; }

    @Override
    public String toString() {
        return "FlaskDictNode{" +
                "pairs=" + pairs +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
