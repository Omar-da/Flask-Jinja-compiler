parser grammar MiniFlaskParser;
options { tokenVocab = MiniFlaskLexer; }

file
    : (statement NEWLINE)* EOF
    ;

statement
    : importStmt                                  #FlaskImportStmt
    | routeDef                                    #FlaskRouteDefStmt
    | funcDef                                     #FlaskFuncDefStmt
    | assign                                      #FlaskAssignStmt
    | ifStmt                                      #FlaskIfStmt
    | returnStmt                                  #FlaskReturnStmt
    | exprStmt                                    #FlaskExprStmt
    ;

importStmt
    : IMPORT importNames                          #FlaskImportNamesStmt
    | FROM IDENT IMPORT importNames               #FlaskFromImportStmt
    ;

importNames
    : IDENT (COMMA IDENT)*                        #FlaskImportNameList
    ;

routeDef
    : AT APP DOT ROUTE LPAREN routeArgs? RPAREN
        NEWLINE funcDef                           #FlaskRouteDefinition
    ;

routeArgs
    : routeArg (COMMA routeArg)*                  #FlaskRouteArgsList
    ;

routeArg
    : STRING                                      #FlaskRouteArgString
    | IDENT EQUALS expr                           #FlaskRouteArgKw
    ;

funcDef
    : DEF IDENT LPAREN params? RPAREN COLON
        NEWLINE statement*                        #FlaskFunctionDef
    ;

params
    : param (COMMA param)*                        #FlaskParamsList
    ;

param
    : simpleParam                                 #FlaskParamSimple
    | defaultParam                                #FlaskParamDefault
    | typeAnnotatedParam                          #FlaskParamType
    | typeAnnotatedDefaultParam                   #FlaskParamTypeDefault
    | starParam                                   #FlaskParamStar
    | doubleStarParam                             #FlaskParamDoubleStar
    ;

simpleParam                : IDENT                              #FlaskSimpleParam ;
defaultParam               : IDENT EQUALS expr                  #FlaskDefaultParam ;
typeAnnotatedParam         : IDENT COLON typeExpr               #FlaskTypeAnnotatedParam ;
typeAnnotatedDefaultParam  : IDENT COLON typeExpr EQUALS expr   #FlaskTypeAnnotatedDefaultParam ;
starParam                  : STAR IDENT                         #FlaskStarParam ;
doubleStarParam            : DOUBLESTAR IDENT                   #FlaskDoubleStarParam ;

typeExpr
    : IDENT (DOT IDENT)*                        #FlaskTypeExpr
    ;

assign
    : (IDENT | APP) EQUALS expr                 #FlaskAssignment
    ;

ifStmt
    : IF expr COLON NEWLINE statement+          #FlaskIfStatement
    ;

returnStmt
    : RETURN expr                               #FlaskReturnStatement
    ;

exprStmt
    : expr                                      #FlaskExpressionStatement
    ;

expr
    : additive (EQEQ additive)?                 #FlaskEqualityExpr
    ;

additive
    : primary (PLUS primary)*                   #FlaskAdditiveExpr
    ;

primary
    : atom suffix*                              #FlaskPrimaryExpr
    ;

suffix
    : DOT IDENT                                 #FlaskAttrAccess
    | LBRACK expr RBRACK                        #FlaskIndexing
    | LPAREN NEWLINE* routeArgKws? NEWLINE* RPAREN     #FlaskCallSuffix
    | genExpr                                   #FlaskGenExpr
    ;

routeArgKws
    : arg (NEWLINE* COMMA NEWLINE* arg)*        #FlaskArgsList
    ;

arg
    : IDENT EQUALS expr                         #FlaskKwArg
    | expr                                      #FlaskPosArg
    ;

atom
    : IDENT                                     #FlaskAtomName
    | STRING                                    #FlaskAtomString
    | NUMBER                                    #FlaskAtomNumber
    | APP                                       #FlskAtomApp
    | NONE                                      #FlaskAtomNone
    | TRUE                                      #FlaskAtomTrue
    | FALSE                                     #FlaskAtomFalse
    | listLiteral                               #FlaskAtomList
    | dictLiteral                               #FlaskAtomDict
    | genExpr                                   #FlaskAtomGenExpr
    | LPAREN expr RPAREN                        #FlaskAtomParen
    ;

listLiteral
    : LBRACK NEWLINE*
      (expr (NEWLINE* COMMA NEWLINE* expr)* NEWLINE* COMMA?)?
      NEWLINE* RBRACK                           #FlaskListLiteral
    ;

dictLiteral
    : LBRACE NEWLINE* (pair (NEWLINE* COMMA NEWLINE* pair)* NEWLINE* COMMA?)? NEWLINE* RBRACE       #FlaskDictLiteral
    ;

pair
    : (STRING | IDENT) COLON expr               #FlaskDictPair
    ;

genExpr
    : LPAREN expr FOR IDENT IN expr (IF expr)? RPAREN              #FlaskGeneratorExpr
    ;