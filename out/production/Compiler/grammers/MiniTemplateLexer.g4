lexer grammar MiniTemplateLexer;

H1_START     : '<h1' -> pushMode(HTML_ATTR);
NAV_START    : '<nav' -> pushMode(HTML_ATTR);
FOOTER_START : '<footer' -> pushMode(HTML_ATTR);
MAIN_START   : '<main' -> pushMode(HTML_ATTR);
SECTION_START: '<section' -> pushMode(HTML_ATTR);
HEADER_START : '<header' -> pushMode(HTML_ATTR);
P_START      : '<p' -> pushMode(HTML_ATTR);
DIV_START    : '<div' -> pushMode(HTML_ATTR);
INPUT_START  : '<input' -> pushMode(HTML_ATTR);
BUTTON_START : '<button' -> pushMode(HTML_ATTR);
FORM_START   : '<form' -> pushMode(HTML_ATTR);
UL_START     : '<ul' -> pushMode(HTML_ATTR);
LI_START     : '<li' -> pushMode(HTML_ATTR);
A_START      : '<a' -> pushMode(HTML_ATTR);
STYLE_START  : '<style>' -> pushMode(CSS);

VAR_START   : '{{' -> pushMode(JINJA);
BLOCK_START : '{%' -> pushMode(JINJA);

COMMENT : '<!--' .*? '-->' -> skip;
NEWLINE : '\r'? '\n'+ -> skip ;
TEXT    : ~[{}%<>"]+;
WS : [ \t]+ -> skip ;



mode HTML_CONTENT;

HTML_CONTENT_H1_START     : '<h1' -> pushMode(HTML_ATTR);
HTML_CONTENT_HEADER_START : '<header' -> pushMode(HTML_ATTR);
HTML_CONTENT_MAIN_START   : '<main' -> pushMode(HTML_ATTR);
HTML_CONTENT_FOOTER_START : '<footer' -> pushMode(HTML_ATTR);
HTML_CONTENT_SECTION_START: '<section' -> pushMode(HTML_ATTR);
HTML_CONTENT_NAV_START    : '<nav' -> pushMode(HTML_ATTR);
HTML_CONTENT_P_START      : '<p' -> pushMode(HTML_ATTR);
HTML_CONTENT_DIV_START    : '<div' -> pushMode(HTML_ATTR);
HTML_CONTENT_INPUT_START  : '<input' -> pushMode(HTML_ATTR);
HTML_CONTENT_BUTTON_START : '<button' -> pushMode(HTML_ATTR);
HTML_CONTENT_FORM_START   : '<form' -> pushMode(HTML_ATTR);
HTML_CONTENT_UL_START     : '<ul' -> pushMode(HTML_ATTR);
HTML_CONTENT_LI_START     : '<li' -> pushMode(HTML_ATTR);
HTML_CONTENT_A_START      : '<a' -> pushMode(HTML_ATTR);

HTML_CONTENT_VAR_START   : '{{' -> pushMode(JINJA);
HTML_CONTENT_BLOCK_START : '{%' -> pushMode(JINJA);

HTML_CONTENT_COMMENT : '<!--' .*? '-->' -> skip;
HTML_CONTENT_TEXT    : (~[{}%<>])+;
HTML_CONTENT_NEWLINE : '\r'? '\n'+ -> skip;
HTML_CONTENT_WS : [ \t]+ -> skip ;

H1_END      : '</h1>' -> popMode;
HEADER_END  : '</header>' -> popMode;
MAIN_END    : '</main>' -> popMode;
FOOTER_END  : '</footer>' -> popMode;
NAV_END     : '</nav>' -> popMode;
SECTION_END : '</section>' -> popMode;
P_END       : '</p>' -> popMode;
DIV_END     : '</div>' -> popMode;
BUTTON_END  : '</button>' -> popMode;
FORM_END    : '</form>' -> popMode;
UL_END      : '</ul>' -> popMode;
LI_END      : '</li>' -> popMode;
A_END       : '</a>' -> popMode;



mode HTML_ATTR;

HTML_ATTR_EQUALS      : '=';
HTML_ATTR_SINGLE_QUOTE: '\'' -> pushMode(HTML_ATTR_VALUE);
HTML_ATTR_DOUBLE_QUOTE: '"' -> pushMode(HTML_ATTR_VALUE);
HTML_ATTR_VAR_START   : '{{' ->pushMode(JINJA);
HTML_ATTR_BLOCK_START : '{%' ->pushMode(JINJA);

HTML_ATTR_IDENT       : [a-zA-Z_-][a-zA-Z0-9_-]*;
HTML_ATTR_WS          : [ \t\r\n]+ -> skip;
HTML_ATTR_GT          : '>' -> popMode, pushMode(HTML_CONTENT);



mode HTML_ATTR_VALUE;

HTML_ATTR_VALUE_COMMENT : '<!--' .*? '-->' -> skip;
HTML_ATTR_VALUE_TEXT: ~[{}%<>"]+;
HTML_ATTR_VALUE_VAR_START   : '{{' ->pushMode(JINJA);
HTML_ATTR_VALUE_BLOCK_START : '{%' ->pushMode(JINJA);
HTML_ATTR_VALUE_DOUBLE_QUOTE: '"' -> popMode;



mode CSS;

CSS_IDENT   : [a-zA-Z_-][a-zA-Z0-9_-]*;
CSS_TAG
    : 'html' | 'body' | 'div' | 'span' | 'img' | 'a'
    | 'ul' | 'ol' | 'li' | 'p' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6'
    | 'section' | 'article' | 'header' | 'footer'
    | 'nav' | 'main' | 'button' | 'input' | 'form' | 'label'
    ;

CSS_STAR                : '*';
CSS_HASH                : '#';
CSS_GT                  : '>';
CSS_PLUS                : '+';
CSS_GEN_SIB             : '~';
CSS_LPAREN              : '(';
CSS_RPAREN              : ')';
CSS_PSEUDO_COLON        : ':';
CSS_PSEUDO_DOUBLE_COLON : '::';
CSS_COMMA               : ',';
CSS_DOT                 : '.';
CSS_LBRACE              : '{' -> pushMode(CSS_RULE);

CSS_COMMENT : '/*' .*? '*/' -> skip;
CSS_NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;
CSS_NEWLINE : '\r'? '\n'+ -> skip;
CSS_WS      : [ \t\r\n]+ -> skip;
CSS_STYLE_END   : '</style>' -> popMode;



mode CSS_RULE;

CSS_RULE_COLON   : ':' -> pushMode(CSS_VALUE);
CSS_RULE_COMMENT : '/*' .*? '*/' -> skip;
CSS_RULE_IDENT   : [a-zA-Z_-][a-zA-Z0-9_-]*;
CSS_RULE_WS      : [ \t\r\n]+ -> skip;
CSS_RULE_RBRACE  : '}' -> popMode;



mode CSS_VALUE;

CSS_VALUE_VAR_START   : '{{' ->pushMode(JINJA);
CSS_VALUE_LPAREN : '(';
CSS_VALUE_RPAREN : ')';
CSS_VALUE_MINUS  : '-';
CSS_VAR_PREFIX   : '--' ;
CSS_VALUE_PLUS   : '+';
CSS_VALUE_COMMA  : ',';

CSS_VALUE_COMMENT     : '/*' .*? '*/' -> skip;
CSS_VALUE_STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    | '\'' (~['\\\r\n] | '\\' .)* '\''
    ;

CSS_VALUE_NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

CSS_VALUE_COLOR
    : '#' HEX HEX HEX
    | '#' HEX HEX HEX HEX
    | '#' HEX HEX HEX HEX HEX HEX
    | '#' HEX HEX HEX HEX HEX HEX HEX HEX
    ;

fragment HEX
    : [0-9a-fA-F]
    ;

CSS_VALUE_UNIT
    : 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw' | 'deg'
    ;

CSS_VALUE_IDENT
    : [a-zA-Z_][a-zA-Z0-9_-]*
    ;

CSS_VALUE_END
    : ';' -> popMode
    ;

CSS_VALUE_WS : [ \t\r\n]+ -> skip;


mode JINJA;

JINJA_NONE        : 'None';
JINJA_TRUE        : 'True';
JINJA_FALSE       : 'False';
JINJA_APP         : 'app';
JINJA_IF          : 'if';
JINJA_ELIF        : 'elif';
JINJA_ELSE        : 'else';
JINJA_ENDIF       : 'endif';
JINJA_FOR         : 'for';
JINJA_ENDFOR       : 'endfor';
JINJA_IN          : 'in';

JINJA_EQEQ        : '==';
JINJA_PLUS        : '+';
JINJA_DOT         : '.';
JINJA_LBRACK      : '[';
JINJA_RBRACK      : ']';
JINJA_LPAREN      : '(';
JINJA_RPAREN      : ')';
JINJA_LBRACE      : '{';
JINJA_RBRACE      : '}';
JINJA_COMMA       : ',';
JINJA_EQUALS      : '=';
JINJA_COLON       : ':';

JINJA_COMMENT     : '/*' .*? '*/' -> skip;
JINJA_STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    | '\'' (~['\\\r\n] | '\\' .)* '\''
    ;
JINJA_NUMBER  : [0-9]+ ('.' [0-9]+)?;
JINJA_IDENT   : [a-zA-Z_-][a-zA-Z0-9_-]*;
JINJA_WS      : [ \t]+ -> skip ;
JINJA_NEWLINE : '\r'? '\n'+ ;

JINJA_BLOCK_END   : '%}' ->popMode;
JINJA_VAR_END     : '}}' ->popMode;
