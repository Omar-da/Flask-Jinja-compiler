package ast.template;

/**
 * Represents pseudo-class or pseudo-element
 */
public class TemplatePseudoNodeTemplate extends TemplateASTNode {
    public final String type; // "class" or "element"
    public final String name;

    public TemplatePseudoNodeTemplate(String type, String name) { super(); this.type = type; this.name = name; }
    public TemplatePseudoNodeTemplate(String type, String name, int line, int column) { super(line, column); this.type = type; this.name = name; }

    @Override
    public String toString() {
        return "TemplatePseudoNode{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
