package ast.template;

public class AttrTextNode extends QuotedItemNode {
    public final String text;

    public AttrTextNode(String text, int line, int column) {
        super(line, column);
        this.text = text;
    }

    @Override
    public String toString() {
        return "\nAttrTextNode{ " +
                line + ":" + column +
                ", text='" + text + '\'' +
                '}';
    }
}

