package ast.template;

public class AttrJinjaBlockNode extends QuotedItemNode {
    public final TemplateJinjaBlockNode block;

    public AttrJinjaBlockNode(TemplateJinjaBlockNode block) {
        super(block.line, block.column);
        this.block = block;
    }

    @Override
    public String toString() {
        return String.valueOf(block);
    }
}
