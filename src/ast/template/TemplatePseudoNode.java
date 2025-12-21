package ast.template;

/**
 * Represents pseudo-class or pseudo-element
 */
public class TemplatePseudoNode extends ASTNode {
    public final String type; // "class" or "element"
    public final String name;

    public TemplatePseudoNode(String type, String name) { super(); this.type = type; this.name = name; }
    public TemplatePseudoNode(String type, String name, int line, int column) { super(line, column); this.type = type; this.name = name; }
}
