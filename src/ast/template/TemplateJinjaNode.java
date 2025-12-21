package ast.template;

/**
 * Generic Jinja node
 * type: "for", "if", "else"
 */
public class TemplateJinjaNode extends TemplateElementNode {
    public final String type;
    public final String varName; // for "for"
    public final FlaskExprNode conditionOrIterable;

    public TemplateJinjaNode(String type, String varName, FlaskExprNode conditionOrIterable) {
        super();
        this.type = type;
        this.varName = varName;
        this.conditionOrIterable = conditionOrIterable;
    }

    public TemplateJinjaNode(String type, String varName, FlaskExprNode conditionOrIterable, int line, int column) {
        super(line, column);
        this.type = type;
        this.varName = varName;
        this.conditionOrIterable = conditionOrIterable;
    }
}
