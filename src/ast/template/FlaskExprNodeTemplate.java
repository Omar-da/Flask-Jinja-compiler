package ast.template;

public class FlaskExprNodeTemplate extends TemplateASTNode {
    public FlaskExprNodeTemplate() { super(); }
    public FlaskExprNodeTemplate(int line, int column) { super(line, column); }

    @Override
    public String toString() {
        return "FlaskExprNode{" +
                "line=" + line +
                ", column=" + column +
                ", children=" + children +
                '}';
    }
}
