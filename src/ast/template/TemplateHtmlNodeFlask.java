package ast.template;

/**
 * Represents any HTML tag.
 */
public class TemplateHtmlNodeFlask extends TemplateElementNodeFlask {
    public final String tagName;

    public TemplateHtmlNodeFlask(String tagName) { super(); this.tagName = tagName; }
    public TemplateHtmlNodeFlask(String tagName, int line, int column) { super(line, column); this.tagName = tagName; }

    @Override
    public String toString() {
        return "TemplateHtmlNode{" +
                "tagName='" + tagName + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
