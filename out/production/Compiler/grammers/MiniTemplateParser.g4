parser grammar MiniTemplateParser;
options { tokenVocab=MiniTemplateLexer; }

template : (element NEWLINE*)* EOF ;

element
    : htmlTag                           #TemplateHtmlElement
    | jinjaVar                          #TemplateJinjaVar
    | jinjaBlock                        #TemplateJinjaBlock
    | text                              #TemplateText
    ;

text
    : TEXT
    | HTML_CONTENT_TEXT
    ;

htmlTag
    : h1Tag                             #TemplateHtmlH1
    | divTag                            #TemplateHtmlDiv
    | headerTag                         #TemplateHtmlHeader
    | mainTag                           #TemplateHtmlMain
    | navTag                            #TemplateHtmlNav
    | footerTag                         #TemplateHtmlFooter
    | sectionTag                        #TemplateHtmlSection
    | pTag                              #TemplateHtmlP
    | inputTag                          #TemplateHtmlInput
    | buttonTag                         #TemplateHtmlButton
    | formTag                           #TemplateHtmlForm
    | ulTag                             #TemplateHtmlUl
    | liTag                             #TemplateHtmlLi
    | aTag                              #TemplateHtmlA
    | styleTag                          #TemplateHtmlStyle
    ;

tagWithContent
    : (attr | jinjaVar | jinjaBlock)*   #TemplateTagWithContent
    ;

h1Tag
    : h1Start tagWithContent HTML_ATTR_GT
      element*
      H1_END                            #TemplateH1Tag
    ;

h1Start
    : H1_START                          #GlobalH1Start
    | HTML_CONTENT_H1_START             #HtmlContentH1Start
    ;

divTag
    : divStart tagWithContent HTML_ATTR_GT
      element*
      DIV_END                            #TemplateDivTag
    ;

divStart
    : DIV_START                          #GlobalDivStart
    | HTML_CONTENT_DIV_START             #HtmlContentDivStart
    ;

headerTag
    : headerStart tagWithContent HTML_ATTR_GT
      element*
      HEADER_END                         #TemplateHeaderTag
    ;

headerStart
    : HEADER_START                       #GlobalHeaderStart
    | HTML_CONTENT_HEADER_START          #HtmlContentHeaderStart
    ;

mainTag
    : mainStart tagWithContent HTML_ATTR_GT
      element*
      MAIN_END                           #TemplateMainTag
    ;

mainStart
    : MAIN_START                         #GlobalMainStart
    | HTML_CONTENT_MAIN_START            #HtmlContentMainStart
    ;

footerTag
    : footerStart tagWithContent HTML_ATTR_GT
      element*
      FOOTER_END                         #TemplateFooterTag
    ;

footerStart
    : FOOTER_START                       #GlobalFooterStart
    | HTML_CONTENT_FOOTER_START          #HtmlContentFooterStart
    ;

navTag
    : navStart tagWithContent HTML_ATTR_GT
      element*
      NAV_END                            #TemplateNavTag
    ;

navStart
    : NAV_START                          #GlobalNavStart
    | HTML_CONTENT_NAV_START             #HtmlContentNavStart
    ;

sectionTag
    : sectionStart tagWithContent HTML_ATTR_GT
      element*
      SECTION_END                        #TemplateSectionTag
    ;

sectionStart
    : SECTION_START                      #GlobalSectionStart
    | HTML_CONTENT_SECTION_START         #HtmlContentSectionStart
    ;


pTag
    : pStart tagWithContent HTML_ATTR_GT
      element*
      P_END                              #TemplatePTag
    ;

pStart
    : P_START                            #GlobalPStart
    | HTML_CONTENT_P_START               #HtmlContentPStart
    ;

inputTag
    : inputStart tagWithContent HTML_ATTR_GT                           #TemplateInputTag
    ;

inputStart
    : INPUT_START                        #GlobalInputStart
    | HTML_CONTENT_INPUT_START           #HtmlContentInputStart
    ;

buttonTag
    : buttonStart tagWithContent HTML_ATTR_GT
      element*
      BUTTON_END                         #TemplateButtonTag
    ;

buttonStart
    : BUTTON_START                       #GlobalButtonStart
    | HTML_CONTENT_BUTTON_START          #HtmlContentButtonStart
    ;

formTag
    : formStart tagWithContent HTML_ATTR_GT
      element*
      FORM_END                           #TemplateFormTag
    ;

formStart
    : FORM_START                         #GlobalFormStart
    | HTML_CONTENT_FORM_START            #HtmlContentFormStart
    ;

ulTag
    : ulStart tagWithContent HTML_ATTR_GT
      element*
      UL_END                             #TemplateUlTag
    ;

ulStart
    : UL_START                           #GlobalUlStart
    | HTML_CONTENT_UL_START              #HtmlContentUlStart
    ;

liTag
    : liStart tagWithContent HTML_ATTR_GT
      element*
      LI_END                             #TemplateLiTag
    ;

liStart
    : LI_START                           #GlobalLiStart
    | HTML_CONTENT_LI_START              #HtmlContentLiStart
    ;

aTag
    : aStart tagWithContent HTML_ATTR_GT
      element*
      A_END
      #TemplateATag
    ;

aStart
    : A_START                            #GlobalAStart
    | HTML_CONTENT_A_START               #HtmlContentAStart
    ;

attr
    : HTML_ATTR_IDENT HTML_ATTR_EQUALS quotedValue #TemplateAttr
    ;

quotedValue
    : HTML_ATTR_DOUBLE_QUOTE quotedItem* HTML_ATTR_VALUE_DOUBLE_QUOTE          #TemplateQuotedDouble
    | HTML_ATTR_SINGLE_QUOTE quotedItem* HTML_ATTR_VALUE_DOUBLE_QUOTE          #TemplateQuotedSingle
    ;

quotedItem
    : HTML_ATTR_VALUE_TEXT                                                     #TemplateQuotedText
    | jinjaVar                                                                 #TemplateQuotedJinjaVar
    | jinjaBlock                                                               #TemplateQuotedJinjaBlock
    ;

styleTag : STYLE_START CSS_NEWLINE* cssRules CSS_NEWLINE* CSS_STYLE_END        #TemplateStyleTag ;
cssRules : (cssRule)*                                                          #TemplateCssRules ;
cssRule  : cssSelectorList cssDeclarationList (CSS_NEWLINE)*                   #TemplateCssRule ;
cssDeclarationList : CSS_LBRACE NEWLINE* cssDeclaration* NEWLINE* CSS_RULE_RBRACE                #TemplateCssDeclarationList ;
cssDeclaration : cssProperty CSS_RULE_COLON (cssValue)+ CSS_VALUE_END          #TemplateCssDeclaration ;
cssProperty : CSS_RULE_IDENT                                                   #TemplateCssProperty;
cssValue
    : CSS_VALUE_MINUS? CSS_VALUE_NUMBER CSS_VALUE_UNIT?     #TemplateCssNumber
    | cssFunction                                           #TemplateCssFunction
    | CSS_VAR_PREFIX? CSS_VALUE_IDENT                       #TemplateCssIdent
    | CSS_VALUE_STRING                                      #TemplateCssString
    | CSS_VALUE_COLOR                                       #TemplateCssColor
    | jinjaVar CSS_VALUE_UNIT?                              #TemplateCssJinjaVar
    ;

cssFunction
    : CSS_VALUE_IDENT CSS_VALUE_LPAREN
      cssValue ((CSS_VALUE_COMMA | CSS_VALUE_WS | CSS_VALUE_PLUS | CSS_VALUE_MINUS) cssValue)*
      CSS_VALUE_RPAREN
    ;


cssSelectorList : cssSelector (CSS_COMMA cssSelector)*                         #TemplateCssSelectorList ;
cssSelector : selectorUnit (combinator selectorUnit)*                          #TemplateCssSelector ;
selectorUnit
    : baseSelectorPart (classPart | idPart | pseudoClass | pseudoElement)*     #TemplateSelectorUnit
    ;
baseSelectorPart
    : CSS_TAG      #TemplateBaseSelectorTag
    | CSS_IDENT    #TemplateBaseSelectorIdent
    | CSS_STAR     #TemplateBaseSelectorStar
    | classPart    #TemplateBaseSelectorClass
    | idPart       #TemplateBaseSelectorId
    ;

classPart
    : CSS_DOT CSS_IDENT    #TemplateClassPart
    ;

idPart
    : CSS_HASH CSS_IDENT   #TemplateIdPart
    ;

combinator
    : CSS_GT           #TemplateCombinatorGt
    | CSS_PLUS         #TemplateCombinatorPlus
    | CSS_GEN_SIB      #TemplateCombinatorGenSib
    |                  #TemplateCombinatorNone
    ;

pseudoClass
    : CSS_PSEUDO_COLON CSS_IDENT pseudoArgs?        #PseudoClassNode
    ;

pseudoArgs
    : CSS_LPAREN pseudoExpr CSS_RPAREN              #PseudoArgsNode
    ;

pseudoExpr
    : pseudoExprAtom+                               #PseudoExprNode
    ;

pseudoExprAtom
    : CSS_IDENT                                     #AtomIdent
    | CSS_NUMBER                                    #AtomNumber
    | CSS_STRING                                    #AtomString
    | CSS_DOT CSS_IDENT                             #AtomDotIdent
    | CSS_PSEUDO_COLON CSS_IDENT                    #AtomColonIdent
    | CSS_LPAREN pseudoExpr CSS_RPAREN              #AtomParenExpr
    | CSS_COMMA                                     #AtomComma
    | CSS_PLUS                                      #AtomPlus
    | CSS_MINUS                                     #AtomMinus
    | CSS_STAR                                      #AtomStar
    | CSS_GT                                        #AtomGt
    ;


pseudoElement
    : CSS_PSEUDO_DOUBLE_COLON CSS_IDENT #TemplatePseudoElementExpr
    ;

jinjaVar
    : varStart expr JINJA_VAR_END       #TemplateJinjaVarExpr
    ;

varStart
    : VAR_START                     #JinjaVarStart
    | HTML_CONTENT_VAR_START        #JinjaHtmlVarStart
    | HTML_ATTR_VAR_START           #JinjaHtmlAttrVarStart
    | HTML_ATTR_VALUE_VAR_START     #JinjaHtmlAttrValueVarStart
    | CSS_VALUE_VAR_START           #JinjaCssValueVarStart
    ;

jinjaBlock
    : jinjaFor  #TemplateJinjaForBlock
    | jinjaIf   #TemplateJinjaIfBlock
    ;

jinjaFor
    : blockStart JINJA_FOR JINJA_IDENT JINJA_IN expr JINJA_BLOCK_END
      element*
      blockStart JINJA_ENDFOR JINJA_BLOCK_END
      #TemplateJinjaFor
      ;

jinjaIf
    : blockStart JINJA_IF expr JINJA_BLOCK_END
      element*
      (blockStart JINJA_ELIF expr JINJA_BLOCK_END element*)*
      (blockStart JINJA_ELSE JINJA_BLOCK_END element*)*
      blockStart JINJA_ENDIF JINJA_BLOCK_END
      #TemplateJinjaIf
      ;

blockStart
    : BLOCK_START                   #JinjaBlockStart
    | HTML_CONTENT_BLOCK_START      #JinjaHtmlBlockStart
    | HTML_ATTR_BLOCK_START         #JinjaHtmlAttrBlockStart
    | HTML_ATTR_VALUE_BLOCK_START   #JinjaHtmlAttrValueBlockStart
    ;



expr
    : additive (JINJA_EQEQ additive)?                    #FlaskEqualityExpr
    ;

additive
    : primary (JINJA_PLUS primary)*                      #FlaskAdditiveExpr
    ;

primary
    : atom suffix*                                       #FlaskPrimaryExpr
    ;

suffix
    : JINJA_DOT JINJA_IDENT                        #FlaskAttrAccess
    | JINJA_LBRACK expr JINJA_RBRACK               #FlaskIndexing
    | JINJA_LPAREN routeArgKws? JINJA_RPAREN       #FlaskCallSuffix
    ;

routeArgKws
    : arg (JINJA_COMMA arg)*                       #FlaskArgsList
    ;

arg
    : JINJA_IDENT JINJA_EQUALS expr                #FlaskKwArg
    | expr                                         #FlaskPosArg
    ;

atom
    : JINJA_IDENT                                  #FlaskAtomName
    | JINJA_STRING                                 #FlaskAtomString
    | JINJA_NUMBER                                 #FlaskAtomNumber
    | JINJA_APP                                    #FlskAtomApp
    | JINJA_NONE                                   #FlaskAtomNone
    | JINJA_TRUE                                   #FlaskAtomTrue
    | JINJA_FALSE                                  #FlaskAtomFalse
    | listLiteral                                  #FlaskAtomList
    | dictLiteral                                  #FlaskAtomDict
    | genExpr                                      #FlaskAtomGenExpr
    | JINJA_LPAREN expr JINJA_RPAREN               #FlaskAtomParen
    ;

listLiteral
    : JINJA_LBRACK (expr (JINJA_COMMA expr)*)? JINJA_RBRACK          #FlaskListLiteral
    ;

dictLiteral
    : JINJA_LBRACE (pair (JINJA_COMMA pair)*)? JINJA_RBRACE          #FlaskDictLiteral
    ;

pair
    : (JINJA_STRING | JINJA_IDENT) JINJA_COLON expr                   #FlaskDictPair
    ;

genExpr
    : JINJA_LPAREN JINJA_IDENT JINJA_FOR JINJA_IDENT JINJA_IN expr (JINJA_IF expr)? JINJA_RPAREN #FlaskGeneratorExpr
    ;