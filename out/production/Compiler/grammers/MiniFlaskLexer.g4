lexer grammar MiniFlaskLexer;

tokens { INDENT, DEDENT }

// ------------------ MEMBERS ------------------
@members {
    private java.util.LinkedList<Token> pendingTokens = new java.util.LinkedList<>();
    private java.util.Stack<Integer> indents = new java.util.Stack<>();
    private int opened = 0;

    {
        // base indentation level = 0
        indents.push(0);
    }

    @Override
    public Token nextToken() {
        // emit any pending tokens first
        if (!pendingTokens.isEmpty()) {
            return pendingTokens.poll();
        }

        Token next = super.nextToken();

        if (next.getType() == EOF) {
            // emit remaining DEDENTs at EOF
            while (indents.size() > 1) {
                indents.pop();
                pendingTokens.add(createToken(DEDENT, ""));
            }
            pendingTokens.add(next);
            return pendingTokens.poll();
        }

        return next;
    }

    private Token createToken(int type, String text) {
        Token t = getTokenFactory().create(
            new org.antlr.v4.runtime.misc.Pair<>(this, getInputStream()),
            type,
            text,
            DEFAULT_TOKEN_CHANNEL,
            getCharIndex(),
            getCharIndex() + Math.max(text.length() - 1, 0),
            getLine(),
            getCharPositionInLine()
        );
        return t;
    }

    private int getIndentationCount(String spaces) {
        int count = 0;
        for (char ch : spaces.toCharArray()) {
            if (ch == '\t') count += 8 - (count % 8);
            else count++;
        }
        return count;
    }

    private void handleIndentation(String spaces) {
        int indent = getIndentationCount(spaces);
        int previous = indents.peek();

        if (indent > previous) {
            indents.push(indent);
            pendingTokens.add(createToken(INDENT, spaces));
        } else if (indent < previous) {
            while (indent < previous) {
                indents.pop();
                pendingTokens.add(createToken(DEDENT, ""));
                previous = indents.peek();
            }
            if (indent != previous) {
                throw new RuntimeException("Indentation error: unexpected indent level at line " + getLine());
            }
        }
        // else indent == previous → do nothing
    }
}

// ------------------ KEYWORDS ------------------
DEF       : 'def';
IF        : 'if';
RETURN    : 'return';
APP       : 'app';
ROUTE     : 'route';
FOR       : 'for';
IN        : 'in';
FROM      : 'from';
IMPORT    : 'import';
NONE      : 'None';
TRUE      : 'True';
FALSE     : 'False';

// ------------------ IDENTIFIERS & TYPES ------------------
STRING : '"' (~["\\\r\n] | '\\' .)* '"'
       | '\'' (~['\\\r\n] | '\\' .)* '\'';
NUMBER : [0-9]+ ('.' [0-9]+)?;
IDENT  : [a-zA-Z_][a-zA-Z0-9_-]*;

// ------------------ SYMBOLS ------------------
AT         : '@';
DOT        : '.';
LPAREN     : '(' { opened++; };
RPAREN     : ')' { opened--; };
LBRACK     : '[' { opened++; };
RBRACK     : ']' { opened--; };
LBRACE     : '{' { opened++; };
RBRACE     : '}' { opened--; };
COMMA      : ',';
COLON      : ':';
EQUALS     : '=';
PLUS       : '+';
STAR       : '*';
DOUBLESTAR : '**';
EQEQ       : '==';

// ------------------ COMMENTS & SPACES ------------------
COMMENT : '#' ~[\r\n]* -> skip;

WS : [ \t]+ -> channel(HIDDEN);

// ------------------ NEWLINE & INDENTATION ------------------
NEWLINE
    : ('\r'? '\n') [ \t]*
      {
          if (opened > 0) {
              skip();
          } else {
              String spaces = getText().replaceAll("[\r\n]+", "");
              pendingTokens.add(createToken(NEWLINE, "\n"));
              handleIndentation(spaces);
          }
      }
    ;

