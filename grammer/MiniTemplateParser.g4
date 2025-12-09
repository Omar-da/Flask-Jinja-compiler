parser grammar MiniTemplateParser;
options { tokenVocab=MiniTemplateLexer; }

import MiniFlaskParser;

// ---------- root ----------
template : element* EOF ;

// ---------- elements ----------
element
    : htmlTag
    | jinjaVar
    | jinjaBlock
    | TEXT
    ;

// ---------- html tags ----------
htmlTag
    : h1Tag
    | ulTag
    | liTag
    | aTag
    | styleTag
    ;

tagWithContent
    : (attr | jinjaVar | jinjaBlock)*   // attributes or Jinja inside opening tag
    ;

h1Tag
    : LT H1_TAG tagWithContent GT
      element*          // nested content
      H1_END
    ;

ulTag
    : LT UL_TAG tagWithContent GT
      element*
      UL_END
    ;

liTag
    : LT LI_TAG tagWithContent GT
      element*
      LI_END
    ;

aTag
    : LT A_TAG tagWithContent GT
      element*
      A_END
    ;

// ---------- attributes ----------
attr
    : IDENT EQUALS quotedValue ;   // accept any key

quotedValue
    : DOUBLE_QUOTE quotedItem* DOUBLE_QUOTE
    | SINGLE_QUOTE quotedItem* SINGLE_QUOTE
    ;
quotedItem
    : TEXT
    | jinjaVar
    | jinjaBlock
    ;

// ---------- style / css ----------
styleTag : STYLE_START cssRules STYLE_END ;
cssRules : cssRule* ;
cssRule  : cssSelectorList cssDeclarationList ;
cssDeclarationList : LBRACE cssDeclaration* RBRACE ;
cssDeclaration : cssProperty COLON cssValue SEMI ;
cssProperty
    : IDENT
    ;
cssValue
    : STRING
    | NUMBER (CSS_UNIT)?         // 20px, 1.5em
    | CSS_COLOR
    | IDENT                       // keywords like 'auto', 'none'
    | jinjaVar
    | jinjaBlock
    | IDENT LPAREN (TEXT | NUMBER | jinjaVar)* RPAREN
    ;


// ---------- selectors ----------
cssSelectorList : cssSelector (COMMA cssSelector)* ;
cssSelector : selectorUnit (combinator selectorUnit)* ;
selectorUnit
    : baseSelectorPart (classPart | idPart | pseudoClass | pseudoElement)*
    ;
baseSelectorPart : CSS_TAG | IDENT | STAR | classPart | idPart ;
classPart        : DOT IDENT ;
idPart           : HASH IDENT ;
combinator       : GT | PLUS | GEN_SIB | ;

// pseudo-class / pseudo-element
pseudoClass
    : COLON IDENT (LPAREN (TEXT | NUMBER | jinjaVar | jinjaBlock)* RPAREN)?  // e.g., :not(.class)
    ;

pseudoElement
    : DOUBLE_COLON IDENT;


// ---------- jinja ----------
jinjaVar   : VAR_START flaskExpr VAR_END ;
jinjaBlock : jinjaFor | jinjaIf ;

jinjaFor
    : BLOCK_START JINJA_FOR IDENT IN flaskExpr BLOCK_END
      element*
      BLOCK_START JINJA_ENDFOR BLOCK_END
    ;
jinjaIf
    : BLOCK_START JINJA_IF flaskExpr BLOCK_END
      element*
      BLOCK_START JINJA_ENDIF BLOCK_END
    ;

// ---------- flask expr delegation ----------
flaskExpr : expr ; // uses MiniFlaskParser.expr
