package ast.template.expr;

import ast.template.misc.TemplateArgKw;

import java.util.List;

public class TemplateCallExpr extends TemplateExpr {
    public final List<TemplateArgKw> routeArgKws;

    public TemplateCallExpr(List<TemplateArgKw> routeArgKws, int line, int column) {
        super(line, column);
        this.routeArgKws = routeArgKws;
        addChildren(routeArgKws);
    }

    @Override
    public String toString() {
        return String.valueOf(routeArgKws);
    }
}
