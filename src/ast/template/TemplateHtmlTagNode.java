package ast.template;

import java.util.List;

public class TemplateHtmlTagNode extends TemplateElementNode {
    public final String tagName;
    public final TemplateTagWithContentNode tagContent;

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
        addChildrenFrom(tagContent, children);
    }

    @Override
    public String toString() {
        return String.valueOf(tagName);
    }
}
