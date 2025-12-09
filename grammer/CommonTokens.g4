lexer grammar CommonTokens;

// -----------------------------
// Shared Punctuation / Operators
// -----------------------------
AT          : '@';
DOT         : '.';
LPAREN      : '(';
RPAREN      : ')';
LBRACK      : '[';
RBRACK      : ']';
LBRACE      : '{';
RBRACE      : '}';
SEMI        : ';';
COLON       : ':';
DOUBLE_COLON: '::';
COMMA       : ',';
DOUBLE_QUOTE: '"';
SINGLE_QUOTE: '\'';
EQUALS      : '=';
PLUS        : '+';
MINUS       : '-';
STAR        : '*';
DOUBLESTAR  : '**';
SLASH       : '/';
PERCENT     : '%';
LT          : '<';
GT          : '>';
LE          : '<=';
GE          : '>=';
EQEQ        : '==';
NOTEQ       : '!=';
DOLLAR      : '$';
HASH        : '#';
GEN_SIB     : '~';
SLASH_GT    : '/>';

// -----------------------------
// Shared literals
// -----------------------------
NUMBER    : [0-9]+ ('.' [0-9]+)?;

// -----------------------------
// Generic identifier
// -----------------------------
IDENT     : [a-zA-Z_][a-zA-Z0-9_-]*;

// -----------------------------
// Whitespace
// -----------------------------
WS : [ \t\r\n]+ -> skip;
