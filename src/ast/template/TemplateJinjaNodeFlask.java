package ast.template;

/**
 * Generic Jinja node
 * type: "for", "if", "else"
 */
public class TemplateJinjaNodeFlask extends TemplateElementNodeFlask {
    public final String type;
    public final String varName; // for "for"
    public final FlaskExprNodeTemplate conditionOrIterable;

    public TemplateJinjaNodeFlask(String type, String varName, FlaskExprNodeTemplate conditionOrIterable) {
        super();
        this.type = type;
        this.varName = varName;
        this.conditionOrIterable = conditionOrIterable;
    }

    public TemplateJinjaNodeFlask(String type, String varName, FlaskExprNodeTemplate conditionOrIterable, int line, int column) {
        super(line, column);
        this.type = type;
        this.varName = varName;
        this.conditionOrIterable = conditionOrIterable;
    }

    @Override
    public String toString() {
        return "TemplateJinjaNode{" +
                "type='" + type + '\'' +
                ", varName='" + varName + '\'' +
                ", conditionOrIterable=" + conditionOrIterable +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
