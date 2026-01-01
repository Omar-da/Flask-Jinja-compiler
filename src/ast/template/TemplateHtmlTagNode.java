package ast.template;

import java.util.List;

public class TemplateHtmlTagNode extends TemplateElementNode {
    public final String tagName;
    public final TemplateTagWithContentNode tagContent;
    public final List<TemplateASTNode> children;

    public TemplateHtmlTagNode(
            String tagName,
            TemplateTagWithContentNode tagContent,
            List<TemplateASTNode> children,
            int line,
            int column
    ) {
        super(line, column);
        this.tagName = tagName;
        this.tagContent = tagContent;
        this.children = children;
    }

    @Override
    public String toString() {
        String tagAttrsSting = "";
        if(!tagContent.attrs.isEmpty())
            tagAttrsSting = ", tagAttrs = " + tagContent;
        return "\nTemplateHtmlTagNode{ " +
                line + ":" + column +
                ", tagName='" + tagName + '\'' +
                tagAttrsSting +
                ", tagContent=" + children +
                '}';
    }
}
