package ast.template.misc;

import ast.flask.expr.Expr;
import ast.template.TemplateASTNode;
import ast.template.expr.TemplateExpr;

public class TemplateDictPair extends TemplateASTNode {
    public final String key;
    public final TemplateExpr value;

    public TemplateDictPair(String key, TemplateExpr value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nTemplateDictEntry{ " +
                line + ":" + column +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
