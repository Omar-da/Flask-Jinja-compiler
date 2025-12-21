lexer grammar MiniFlaskLexer;

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

STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    | '\'' (~['\\\r\n] | '\\' .)* '\''
    ;
NUMBER    : [0-9]+ ('.' [0-9]+)?;
IDENT     : [a-zA-Z_][a-zA-Z0-9_-]*;

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

COMMENT   : '#' ~[\r\n]* -> skip;
WS        : [ \t]+ -> skip;
NEWLINE   : '\r'? '\n'+;
