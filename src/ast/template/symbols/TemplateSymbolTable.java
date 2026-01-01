package ast.template.symbols;

public class TemplateSymbolTable {
    private TemplateScope globalTemplateScope;
    private TemplateScope currentTemplateScope;

    public TemplateSymbolTable() {
        this.globalTemplateScope = new TemplateScope(null, "global");
        // Flask
        globalTemplateScope.define(new TemplateSymbol("__name__", TemplateSymbolKind.VARIABLE, null, -1, -1));
        globalTemplateScope.define(new TemplateSymbol("next", TemplateSymbolKind.FUNCTION, null, -1, -1));
        globalTemplateScope.define(new TemplateSymbol("len", TemplateSymbolKind.FUNCTION, null, -1, -1));

        // Template
        globalTemplateScope.define(new TemplateSymbol("products", TemplateSymbolKind.VARIABLE, null, -1, -1));
        globalTemplateScope.define(new TemplateSymbol("url_for", TemplateSymbolKind.VARIABLE, null, -1, -1));
        globalTemplateScope.define(new TemplateSymbol("p", TemplateSymbolKind.VARIABLE, null, -1, -1));
        globalTemplateScope.define(new TemplateSymbol("product", TemplateSymbolKind.VARIABLE, null, -1, -1));

        this.currentTemplateScope = globalTemplateScope;
    }

    public TemplateScope getGlobalScope() {
        return globalTemplateScope;
    }

    public TemplateScope getCurrentScope() {
        return currentTemplateScope;
    }

    public void enterScope(String name) {
        TemplateScope newTemplateScope = new TemplateScope(currentTemplateScope, name);
        currentTemplateScope = newTemplateScope;
    }

    public void exitScope() {
        if (currentTemplateScope.getParent() != null) {
            currentTemplateScope = currentTemplateScope.getParent();
        }
    }

    public void define(TemplateSymbol templateSymbol) {
        currentTemplateScope.define(templateSymbol);
    }

    public TemplateSymbol resolve(String name) {
        return currentTemplateScope.resolve(name);
    }
}
