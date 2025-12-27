package ast.template;

/**
 * Generic CSS selector node.
 * type: "tag", "class", "id", "pseudo"
 */
public class TemplateCssSelectorNodeTemplate extends TemplateASTNode {
    public final String type;
    public final String value;
    public final String combinator; // e.g. ">", "+", "~" or null

    public TemplateCssSelectorNodeTemplate(String type, String value, String combinator) {
        super();
        this.type = type;
        this.value = value;
        this.combinator = combinator;
    }

    public TemplateCssSelectorNodeTemplate(String type, String value, String combinator, int line, int column) {
        super(line, column);
        this.type = type;
        this.value = value;
        this.combinator = combinator;
    }

    @Override
    public String toString() {
        return "TemplateCssSelectorNode{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", combinator='" + combinator + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
