parser grammar MiniFlaskParser;
options { tokenVocab = MiniFlaskLexer; }

// -----------------------------
// Entry Rule
// -----------------------------
file
    : statement+ EOF
    ;

// -----------------------------
// Statements
// -----------------------------
statement
    : importStmt         #FlaskImportStmt
    | routeDef           #FlaskRouteDefStmt
    | funcDef            #FlaskFuncDefStmt
    | assign             #FlaskAssignStmt
    | ifStmt             #FlaskIfStmt
    | returnStmt         #FlaskReturnStmt
    | exprStmt           #FlaskExprStmt
    ;

// -----------------------------
// Imports
// -----------------------------
importStmt
    : IMPORT importNames NEWLINE                #FlaskImportNamesStmt
    | FROM NAME IMPORT importNames NEWLINE      #FlaskFromImportStmt
    ;

importNames
    : NAME (COMMA NAME)*                        #FlaskImportNameList
    ;

// -----------------------------
// Route Definition
// -----------------------------
routeDef
    : AT APP DOT ROUTE LPAREN routeArgs? RPAREN funcDef  #FlaskRouteDefinition
    ;

routeArgs
    : routeArg (COMMA routeArg)*                 #FlaskRouteArgsList
    ;

routeArg
    : STRING                                     #FlaskRouteArgString
    | NAME EQUALS expr                           #FlaskRouteArgKw
    ;

// -----------------------------
// Function Definition
// -----------------------------
funcDef
    : DEF NAME LPAREN params? RPAREN COLON NEWLINE
      INDENT statement* DEDENT                    #FlaskFunctionDef
    ;

// -----------------------------
// Function Parameters
// -----------------------------
params
    : param (COMMA param)*                       #FlaskParamsList
    ;

param
    : simpleParam                                #FlaskParamSimple
    | defaultParam                               #FlaskParamDefault
    | typeAnnotatedParam                         #FlaskParamType
    | typeAnnotatedDefaultParam                  #FlaskParamTypeDefault
    | starParam                                  #FlaskParamStar
    | doubleStarParam                            #FlaskParamDoubleStar
    ;

simpleParam                : NAME                             #FlaskSimpleParam ;
defaultParam               : NAME EQUALS expr                  #FlaskDefaultParam ;
typeAnnotatedParam         : NAME COLON typeExpr               #FlaskTypeAnnotatedParam ;
typeAnnotatedDefaultParam  : NAME COLON typeExpr EQUALS expr   #FlaskTypeAnnotatedDefaultParam ;
starParam                  : STAR NAME                         #FlaskStarParam ;
doubleStarParam            : DOUBLESTAR NAME                   #FlaskDoubleStarParam ;

typeExpr
    : NAME (DOT NAME)*                            #FlaskTypeExpr
    ;

// -----------------------------
// Assignment
// -----------------------------
assign
    : NAME EQUALS expr NEWLINE                     #FlaskAssignment
    ;

// -----------------------------
// If Statement
// -----------------------------
ifStmt
    : IF expr COLON NEWLINE
      INDENT statement+ DEDENT                     #FlaskIfStatement
    ;

// -----------------------------
// Return Statement
// -----------------------------
returnStmt
    : RETURN expr NEWLINE                          #FlaskReturnStatement
    ;

// -----------------------------
// Expression Statement
// -----------------------------
exprStmt
    : expr NEWLINE                                 #FlaskExpressionStatement
    ;

// -----------------------------
// Expressions
// -----------------------------
expr
    : additive (EQEQ additive)?                    #FlaskEqualityExpr
    ;

additive
    : primary (PLUS primary)*                      #FlaskAdditiveExpr
    ;

primary
    : atom suffix*                                 #FlaskPrimaryExpr
    ;

suffix
    : DOT NAME                                     #FlaskAttrAccess
    | LBRACK expr RBRACK                           #FlaskIndexing
    | LPAREN args? RPAREN                          #FlaskCallSuffix
    ;

// args and arg
args
    : arg (COMMA arg)*                             #FlaskArgsList
    ;

arg
    : NAME EQUALS expr                             #FlaskKwArg
    | expr                                         #FlaskPosArg
    ;

// -----------------------------
// Atoms
// -----------------------------
atom
    : NAME                                         #FlaskAtomName
    | STRING                                       #FlaskAtomString
    | NUMBER                                       #FlaskAtomNumber
    | NONE                                         #FlaskAtomNone
    | TRUE                                         #FlaskAtomTrue
    | FALSE                                        #FlaskAtomFalse
    | listLiteral                                  #FlaskAtomList
    | dictLiteral                                  #FlaskAtomDict
    | genExpr                                      #FlaskAtomGenExpr
    | LPAREN expr RPAREN                           #FlaskAtomParen
    ;

// -----------------------------
// Lists and dicts
// -----------------------------
listLiteral
    : LBRACK (expr (COMMA expr)*)? RBRACK          #FlaskListLiteral
    ;

dictLiteral
    : LBRACE (pair (COMMA pair)*)? RBRACE          #FlaskDictLiteral
    ;

pair
    : (STRING | NAME) COLON expr                   #FlaskDictPair
    ;

// -----------------------------
// Generator Expression
// -----------------------------
genExpr
    : LPAREN NAME FOR NAME IN expr (IF expr)? RPAREN #FlaskGeneratorExpr
    ;
