package ast.template;

import ast.template.expr.TemplateExpr;

/**
 * Generic Jinja node
 * type: "for", "if", "else"
 */
public class TemplateJinjaBlockNode extends TemplateElementNode {
    public final String type;
    public final String varName;
    public final TemplateExpr conditionOrIterable;

    public TemplateJinjaBlockNode(String type, String varName, TemplateExpr conditionOrIterable) {
        super();
        this.type = type;
        this.varName = varName;
        this.conditionOrIterable = conditionOrIterable;
    }

    public TemplateJinjaBlockNode(String type, String varName, TemplateExpr conditionOrIterable, int line, int column) {
        super(line, column);
        this.type = type;
        this.varName = varName;
        this.conditionOrIterable = conditionOrIterable;
    }

    @Override
    public String toString() {
        return  "\nTemplateJinjaBlockNode{ " +
                line + ":" + column +
                ", type=" + type +
                ", varName=" + varName +
                ", conditionOrIterable=" + conditionOrIterable +
                ", forLines=" + children +
                '}';
    }
}
