parser grammar MiniTemplateParser;
options { tokenVocab=MiniTemplateLexer; }

import MiniFlaskParser;

// ---------- root ----------
template : element* EOF ;

// ---------- elements ----------
element
    : htmlTag             #TemplateHtmlElement
    | jinjaVar            #TemplateJinjaVar
    | jinjaBlock          #TemplateJinjaBlock
    | TEXT                #TemplateText
    ;

// ---------- html tags ----------
htmlTag
    : h1Tag     #TemplateHtmlH1
    | ulTag     #TemplateHtmlUl
    | liTag     #TemplateHtmlLi
    | aTag      #TemplateHtmlA
    | styleTag  #TemplateHtmlStyle
    ;


tagWithContent
    : (attr | jinjaVar | jinjaBlock)*  #TemplateTagWithContent
    ;


h1Tag
    : LT H1_TAG tagWithContent GT
      element*          // nested content
      H1_END
      #TemplateH1Tag
    ;

ulTag
    : LT UL_TAG tagWithContent GT
      element*
      UL_END
      #TemplateUlTag
    ;

liTag
    : LT LI_TAG tagWithContent GT
      element*
      LI_END
      #TemplateLiTag
    ;

aTag
    : LT A_TAG tagWithContent GT
      element*
      A_END
      #TemplateATag
    ;

// ---------- attributes ----------
attr
    : IDENT EQUALS quotedValue #TemplateAttr
    ;

quotedValue
    : DOUBLE_QUOTE quotedItem* DOUBLE_QUOTE  #TemplateQuotedDouble
    | SINGLE_QUOTE quotedItem* SINGLE_QUOTE  #TemplateQuotedSingle
    ;

quotedItem
    : TEXT       #TemplateQuotedText
    | jinjaVar   #TemplateQuotedJinjaVar
    | jinjaBlock #TemplateQuotedJinjaBlock
    ;


// ---------- style / css ----------
styleTag : STYLE_START cssRules STYLE_END #TemplateStyleTag ;
cssRules : cssRule* #TemplateCssRules ;
cssRule  : cssSelectorList cssDeclarationList #TemplateCssRule ;
cssDeclarationList : LBRACE cssDeclaration* RBRACE #TemplateCssDeclarationList ;
cssDeclaration : cssProperty COLON cssValue SEMI #TemplateCssDeclaration ;
cssProperty
    : IDENT #TemplateCssProperty
    ;
cssValue
    : STRING                              #TemplateCssValueString
    | NUMBER (CSS_UNIT)?                   #TemplateCssValueNumber
    | CSS_COLOR                            #TemplateCssValueColor
    | IDENT                                #TemplateCssValueIdent
    | jinjaVar                             #TemplateCssValueJinjaVar
    | jinjaBlock                           #TemplateCssValueJinjaBlock
    | IDENT LPAREN (TEXT | NUMBER | jinjaVar)* RPAREN  #TemplateCssValueFunctionCall
    ;


// ---------- selectors ----------
cssSelectorList : cssSelector (COMMA cssSelector)* #TemplateCssSelectorList ;
cssSelector : selectorUnit (combinator selectorUnit)* #TemplateCssSelector ;
selectorUnit
    : baseSelectorPart (classPart | idPart | pseudoClass | pseudoElement)* #TemplateSelectorUnit
    ;
baseSelectorPart
    : CSS_TAG      #TemplateBaseSelectorTag
    | IDENT        #TemplateBaseSelectorIdent
    | STAR         #TemplateBaseSelectorStar
    | classPart    #TemplateBaseSelectorClass
    | idPart       #TemplateBaseSelectorId
    ;

classPart
    : DOT IDENT    #TemplateClassPart
    ;

idPart
    : HASH IDENT   #TemplateIdPart
    ;

combinator
    : GT           #TemplateCombinatorGt
    | PLUS         #TemplateCombinatorPlus
    | GEN_SIB      #TemplateCombinatorGenSib
    |             #TemplateCombinatorNone
    ;

// pseudo-class / pseudo-element
pseudoClass
    : COLON IDENT (LPAREN (TEXT | NUMBER | jinjaVar | jinjaBlock)* RPAREN)?
                   #TemplatePseudoClassExpr
    ;

pseudoElement
    : DOUBLE_COLON IDENT #TemplatePseudoElementExpr
    ;

// ---------- jinja ----------
jinjaVar
    : VAR_START flaskExpr VAR_END #TemplateJinjaVarExpr
    ;

jinjaBlock
    : jinjaFor  #TemplateJinjaForBlock
    | jinjaIf   #TemplateJinjaIfBlock
    ;


jinjaFor
    : BLOCK_START JINJA_FOR IDENT IN flaskExpr BLOCK_END
      element*
      BLOCK_START JINJA_ENDFOR BLOCK_END
      #TemplateJinjaFor
    ;
jinjaIf
    : BLOCK_START JINJA_IF flaskExpr BLOCK_END
      element*
      BLOCK_START JINJA_ENDIF BLOCK_END
      #TemplateJinjaIf
    ;

// ---------- flask expr delegation ----------
flaskExpr : expr #TemplateFlaskExpr ; // uses MiniFlaskParser.expr
