package ast.template;

/**
 * Represents any HTML tag.
 */
public class TemplateHtmlNode extends TemplateElementNode {
    public final String tagName;

    public TemplateHtmlNode(String tagName) { super(); this.tagName = tagName; }
    public TemplateHtmlNode(String tagName, int line, int column) { super(line, column); this.tagName = tagName; }
}
