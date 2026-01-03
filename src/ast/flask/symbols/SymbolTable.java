package ast.flask.symbols;

public class SymbolTable {
    private Scope globalScope;
    private Scope currentScope;

    public SymbolTable() {
        this.globalScope = new Scope(null, "global");
        globalScope.define(new Symbol("__name__", SymbolKind.VARIABLE, null, -1, -1));
        globalScope.define(new Symbol("next", SymbolKind.FUNCTION, null, -1, -1));
        globalScope.define(new Symbol("len", SymbolKind.FUNCTION, null, -1, -1));
        globalScope.define(new Symbol("max", SymbolKind.FUNCTION, null, -1, -1));
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

    public void printTable() {
        System.out.println();
        System.out.println("========== TEMPLATE SYMBOL TABLE ==========");
        printScopeChain(currentScope);
        System.out.println("===========================================");
        System.out.println();
    }

    private void printScopeChain(Scope scope) {
        if (scope == null) return;

        printScopeChain(scope.getParent()); // print parents first
        printSingleScope(scope);
    }

    private void printSingleScope(Scope scope) {
        System.out.println("+ Scope: " + scope.getName());

        if (scope.getSymbols().isEmpty()) {
            System.out.println("  (no symbols)");
            return;
        }

        int nameWidth = 22;
        int kindWidth = 14;
        int posWidth  = 14;

        System.out.println(
                "  " +
                        pad("NAME", nameWidth) +
                        pad("KIND", kindWidth) +
                        pad("POSITION", posWidth)
        );

        System.out.println(
                "  " +
                        "-".repeat(nameWidth + kindWidth + posWidth)
        );

        for (Symbol s : scope.getSymbols().values()) {
            String pos =
                    s.line >= 0
                            ? s.line + ":" + s.column
                            : "-";

            System.out.println(
                    "  " +
                            pad(s.name, nameWidth) +
                            pad(s.kind.name(), kindWidth) +
                            pad(pos, posWidth)
            );
        }

        System.out.println();
    }

    private String pad(String text, int width) {
        return String.format("%-" + width + "s", text);
    }
}
