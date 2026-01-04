package ast.template.symbols;

import ast.flask.symbols.Scope;
import ast.flask.symbols.Symbol;

import java.util.ArrayList;
import java.util.List;

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

        String[] vars_of_test1 = {
                "base_width",
                "title",
                "show_footer",
                "total_count",
        };

        String[] vars_of_test2 = {
                "card_width",
                "site_title",
                "show_nav",
                "navigation",
                "sections",
                "year"
        };

        String[] vars_of_test3 = {
                "container_width",
                "container_margin_top",
                "container_margin_right",
                "container_margin_bottom",
                "container_margin_left",
                "card_y_offset",
                "shadow_r",
                "shadow_g",
                "shadow_b",
                "card_gap",
                "banner_color_dark",
                "banner_color_light",
                "banner_height",
                "star_color",
                "meta_padding_horizontal",
                "meta_font_size",
                "meta_line_height",
                "footer_padding_top",
                "footer_padding_right",
                "footer_padding_bottom",
                "footer_padding_left",
                "footer_font_size",
                "footer_color",
                "highlight_color",
                "sidebar_width",
                "progress_offset"
        };

        for (String var : vars_of_test1) {
            globalTemplateScope.define(new TemplateSymbol(var, TemplateSymbolKind.VARIABLE, null, -1, -1));
        }
        for (String var : vars_of_test2) {
            globalTemplateScope.define(new TemplateSymbol(var, TemplateSymbolKind.VARIABLE, null, -1, -1));
        }
        for (String var : vars_of_test3) {
            globalTemplateScope.define(new TemplateSymbol(var, TemplateSymbolKind.VARIABLE, null, -1, -1));
        }

        this.currentTemplateScope = globalTemplateScope;
    }

    public TemplateScope getGlobalScope() {
        return globalTemplateScope;
    }

    public TemplateScope getCurrentScope() {
        return currentTemplateScope;
    }

    public void enterScope(String name) {
        TemplateScope newScope = new TemplateScope(currentTemplateScope, name);
        currentTemplateScope = newScope;
    }


    public void exitScope() {
        if (currentTemplateScope.getParent() != null) {
            currentTemplateScope = currentTemplateScope.getParent();
        }
    }

    public void define(TemplateSymbol symbol) {
        currentTemplateScope.define(symbol);
    }

    public TemplateSymbol resolve(String name) {
        return currentTemplateScope.resolve(name);
    }

    public void printTable() {
        System.out.println();
        System.out.println("========== TEMPLATE SYMBOL TABLE ==========");
        printAllScopes(globalTemplateScope, 0);
        System.out.println("===========================================");
        System.out.println();
    }

    private void printAllScopes(TemplateScope scope, int indent) {
        if (scope == null) return;

        printSingleScope(scope, indent);

        for (TemplateScope child : scope.getChildren()) {
            printAllScopes(child, indent + 1);
        }
    }


    private void printSingleScope(TemplateScope scope, int indent) {
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

        for (TemplateSymbol s : scope.getSymbols().values()) {
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
