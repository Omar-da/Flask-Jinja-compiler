lexer grammar MiniFlaskLexer;
import CommonTokens;

// -----------------------------
// Python / Flask Keywords
// -----------------------------
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

// -----------------------------
// Strings (single and double quotes)
// -----------------------------
STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    | '\'' (~['\\\r\n] | '\\' .)* '\''
    ;

// -----------------------------
// Python-style identifiers
// Overrides IDENT via parser usage
// -----------------------------
NAME      : [a-zA-Z_][a-zA-Z0-9_]*;

// -----------------------------
// Python comments and newlines
// -----------------------------
NEWLINE   : '\r'? '\n';
COMMENT   : '#' ~[\r\n]* -> skip;

// The parser will handle INDENT/DEDENT layout
INDENT    : '\t';
DEDENT    : ;
