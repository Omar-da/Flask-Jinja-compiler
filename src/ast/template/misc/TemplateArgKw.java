package ast.template.misc;

import ast.template.TemplateASTNode;
import ast.template.expr.TemplateExpr;

public class TemplateArgKw extends TemplateASTNode {
    public final String name;
    public final TemplateExpr value;

    public TemplateArgKw(String name, TemplateExpr value, int line, int column) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nTemplateArgKw{ " +
                line + ":" + column +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
