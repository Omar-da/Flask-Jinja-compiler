package ast.template.misc;

import ast.template.TemplateASTNode;

import java.util.List;

public class TemplateArgs extends TemplateASTNode {
    public final List<TemplateArgKw> templateArgKws;

    public TemplateArgs(List<TemplateArgKw> templateArgKws, int line, int column) {
        super(line, column);
        this.templateArgKws = templateArgKws;
    }

    @Override
    public String toString() {
        return "\nTemplateArgs{" +
                line + ":" + column +
                ", argKws=" + templateArgKws +
                '}';
    }
}
