lexer grammar MiniTemplateLexer;
import CommonTokens;

// -----------------------------
// HTML TAG keywords
// -----------------------------
CSS_TAG
    : 'html' | 'body' | 'div' | 'span' | 'img' | 'a'
    | 'ul' | 'ol' | 'li' | 'p' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6'
    | 'section' | 'article' | 'header' | 'footer'
    | 'nav' | 'main' | 'button' | 'input' | 'form' | 'label'
    ;

// -----------------------------
// HTML tag delimiters
// -----------------------------
H1_TAG      : 'h1';
H1_END      : '</h1>';
UL_TAG      : 'ul';
UL_END      : '</ul>';
LI_TAG      : 'li';
LI_END      : '</li>';
A_TAG       : 'a';
A_END       : '</a>';
STYLE_START : '<style>';
STYLE_END   : '</style>';

// -----------------------------
// Jinja syntax
// -----------------------------
VAR_START   : '{{';
VAR_END     : '}}';
BLOCK_START : '{%';
BLOCK_END   : '%}';

JINJA_FOR    : 'for';
JINJA_ENDFOR : 'endfor';
JINJA_IF     : 'if';
JINJA_ENDIF  : 'endif';
IN           : 'in';
URL_FOR      : 'url_for';


// -----------------------------
// CSS identifiers
// -----------------------------
IDENT : [a-zA-Z_][a-zA-Z0-9_-]*;

// -----------------------------
// CSS Colors / Numbers / Strings
// -----------------------------
CSS_COLOR
    : '#' [0-9a-fA-F]{3,6}
    ;

CSS_UNIT
    : 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw'
    ;

STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    | '\'' (~['\\\r\n] | '\\' .)* '\''
    ;

// -----------------------------
// Template text between tags
// -----------------------------
TEXT : ~[<>{}"'()\r\n]+ ;

// -----------------------------
// Comments
// -----------------------------
COMMENT : '/*' .*? '*/' -> skip;
