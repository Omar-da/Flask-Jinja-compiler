package ast.template;

public class AttrJinjaVarNode extends QuotedItemNode{
    public final TemplateJinjaVarNode var;

    public AttrJinjaVarNode(TemplateJinjaVarNode var) {
        super(var.line, var.column);
        this.var = var;
        addChildren(var);
    }

    @Override
    public String toString() {
        return String.valueOf(var);
    }
}
