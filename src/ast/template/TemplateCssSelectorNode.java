package ast.template;

/**
 * Generic CSS selector node.
 * type: "tag", "class", "id", "pseudo"
 */
public class TemplateCssSelectorNode extends ASTNode {
    public final String type;
    public final String value;
    public final String combinator; // e.g. ">", "+", "~" or null

    public TemplateCssSelectorNode(String type, String value, String combinator) {
        super();
        this.type = type;
        this.value = value;
        this.combinator = combinator;
    }

    public TemplateCssSelectorNode(String type, String value, String combinator, int line, int column) {
        super(line, column);
        this.type = type;
        this.value = value;
        this.combinator = combinator;
    }
}
