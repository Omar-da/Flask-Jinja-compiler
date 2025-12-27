package ast.flask.symbols;

public class SymbolTable {
    private Scope globalScope;
    private Scope currentScope;

    public SymbolTable() {
        this.globalScope = new Scope(null, "global");
        globalScope.define(new Symbol("__name__", SymbolKind.VARIABLE, null, -1, -1));
        globalScope.define(new Symbol("next", SymbolKind.FUNCTION, null, -1, -1));
        globalScope.define(new Symbol("len", SymbolKind.FUNCTION, null, -1, -1));
        this.currentScope = globalScope;
    }

    public Scope getGlobalScope() {
        return globalScope;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void enterScope(String name) {
        Scope newScope = new Scope(currentScope, name);
        currentScope = newScope;
    }

    public void exitScope() {
        if (currentScope.getParent() != null) {
            currentScope = currentScope.getParent();
        }
    }

    public void define(Symbol symbol) {
        currentScope.define(symbol);
    }

    public Symbol resolve(String name) {
        return currentScope.resolve(name);
    }
}
