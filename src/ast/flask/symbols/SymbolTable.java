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


    public boolean exitScope() {
        if (currentScope.getParent() != null) {
            currentScope = currentScope.getParent();
            return true;
        }
        else
        {
           return false;
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
        printAllScopes(globalScope, 0);
        System.out.println("===========================================");
        System.out.println();
    }

    private void printAllScopes(Scope scope, int indent) {
        if (scope == null) return;

        printSingleScope(scope, indent);

        for (Scope child : scope.getChildren()) {
            printAllScopes(child, indent + 1);
        }
    }


    private void printSingleScope(Scope scope, int indent) {
        String prefix = "  ".repeat(indent);

        System.out.println(prefix + "+ Scope: " + scope.getName());

        if (scope.getSymbols().isEmpty()) {
            System.out.println(prefix + "  (no symbols)");
            System.out.println();
            return;
        }

        int nameWidth = 22;
        int kindWidth = 14;
        int posWidth  = 14;

        System.out.println(
                prefix + "  " +
                        pad("NAME", nameWidth) +
                        pad("KIND", kindWidth) +
                        pad("POSITION", posWidth)
        );

        System.out.println(
                prefix + "  " +
                        "-".repeat(nameWidth + kindWidth + posWidth)
        );

        for (Symbol s : scope.getSymbols().values()) {
            String pos = s.line + ":" + s.column;

            System.out.println(
                    prefix + "  " +
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
