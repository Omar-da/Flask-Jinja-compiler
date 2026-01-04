lexer grammar MiniFlaskLexer;

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
LPAREN     : '(';
RPAREN     : ')';
LBRACK     : '[';
RBRACK     : ']';
LBRACE     : '{';
RBRACE     : '}';
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
NEWLINE   : '\r'? '\n'+;


