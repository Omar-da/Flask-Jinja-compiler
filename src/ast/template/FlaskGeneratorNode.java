package ast.template;

public class FlaskGeneratorNode extends FlaskExprNode {
    public final String var;
    public final FlaskExprNode iterable;
    public final FlaskExprNode filter; // optional

    public FlaskGeneratorNode(String var, FlaskExprNode iterable, FlaskExprNode filter) {
        super();
        this.var = var;
        this.iterable = iterable;
        this.filter = filter;
    }

    public FlaskGeneratorNode(String var, FlaskExprNode iterable, FlaskExprNode filter, int line, int column) {
        super(line, column);
        this.var = var;
        this.iterable = iterable;
        this.filter = filter;
    }
}
