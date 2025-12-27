package ast.template;

public class FlaskGeneratorNodeTemplate extends FlaskExprNodeTemplate {
    public final String var;
    public final FlaskExprNodeTemplate iterable;
    public final FlaskExprNodeTemplate filter; // optional

    public FlaskGeneratorNodeTemplate(String var, FlaskExprNodeTemplate iterable, FlaskExprNodeTemplate filter) {
        super();
        this.var = var;
        this.iterable = iterable;
        this.filter = filter;
    }

    public FlaskGeneratorNodeTemplate(String var, FlaskExprNodeTemplate iterable, FlaskExprNodeTemplate filter, int line, int column) {
        super(line, column);
        this.var = var;
        this.iterable = iterable;
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "FlaskGeneratorNode{" +
                "var='" + var + '\'' +
                ", iterable=" + iterable +
                ", filter=" + filter +
                ", line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
