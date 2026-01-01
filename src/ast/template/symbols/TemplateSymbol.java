package ast.template.symbols;

import ast.template.TemplateASTNode;

public class TemplateSymbol {
    public final String name;
    public final TemplateSymbolKind kind;
    public final TemplateASTNode node;
    public final int line;
    public final int column;

    public TemplateSymbol(String name, TemplateSymbolKind kind, TemplateASTNode node, int line, int column) {
        this.name = name;
        this.kind = kind;
        this.node = node;
        this.line = line;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
