package ast.template.misc;

import ast.template.TemplateASTNode;

import java.util.List;

public class TemplateDictPairs extends TemplateASTNode {
    public final List<TemplateDictPair> pairs;

    public TemplateDictPairs(List<TemplateDictPair> pairs, int line, int column) {
        super(line, column);
        this.pairs = pairs;
    }

    @Override
    public String toString() {
        return "\nTemplateDictPairs{ " +
                line + ":" + column +
                ", entries=" + pairs +
                '}';
    }
}
