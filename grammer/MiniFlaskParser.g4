parser grammar MiniFlaskParser;
options { tokenVocab=MiniFlaskLexer; }

// -----------------------------
// Entry Rule
// -----------------------------
file : statement+ EOF ;

// -----------------------------
// Statements
// -----------------------------
statement
    : importStmt
    | routeDef
    | funcDef
    | assign
    | ifStmt
    | returnStmt
    | exprStmt
    ;

// -----------------------------
// Imports
// -----------------------------
importStmt
    : IMPORT importNames NEWLINE
    | FROM NAME IMPORT importNames NEWLINE
    ;

importNames
    : NAME (COMMA NAME)*
    ;

// -----------------------------
// Route Definition
// -----------------------------
routeDef
    : AT APP DOT ROUTE LPAREN routeArgs? RPAREN funcDef
    ;

routeArgs
    : routeArg (COMMA routeArg)*
    ;

routeArg
    : STRING
    | NAME EQUALS expr
    ;

// -----------------------------
// Function Definition
// -----------------------------
funcDef
    : DEF NAME LPAREN params? RPAREN COLON NEWLINE
      INDENT statement* DEDENT
    ;

// -----------------------------
// Function Parameters
// -----------------------------
params
    : param (COMMA param)*
    ;

param
    : simpleParam
    | defaultParam
    | typeAnnotatedParam
    | typeAnnotatedDefaultParam
    | starParam
    | doubleStarParam
    ;

simpleParam                : NAME ;
defaultParam               : NAME EQUALS expr ;
typeAnnotatedParam         : NAME COLON typeExpr ;
typeAnnotatedDefaultParam  : NAME COLON typeExpr EQUALS expr ;
starParam                  : STAR NAME ;
doubleStarParam            : DOUBLESTAR NAME ;

typeExpr : NAME (DOT NAME)* ;

// -----------------------------
// Assignment
// -----------------------------
assign : NAME EQUALS expr NEWLINE ;

// -----------------------------
// If Statement
// -----------------------------
ifStmt : IF expr COLON NEWLINE INDENT statement+ DEDENT ;

// -----------------------------
// Return Statement
// -----------------------------
returnStmt : RETURN expr NEWLINE ;

// -----------------------------
// Expression Statement
// -----------------------------
exprStmt : expr NEWLINE ;

// -----------------------------
// Expressions
// -----------------------------
expr     : additive (EQEQ additive)? ;
additive : primary (PLUS primary)* ;
primary  : atom suffix* ;
suffix   : DOT NAME | LBRACK expr RBRACK | LPAREN args? RPAREN ;
args     : arg (COMMA arg)* ;
arg      : NAME EQUALS expr | expr ;

// -----------------------------
// Atoms
// -----------------------------
atom
    : NAME
    | STRING
    | NUMBER
    | NONE
    | TRUE
    | FALSE
    | listLiteral
    | dictLiteral
    | genExpr
    | LPAREN expr RPAREN
    ;

// Lists
listLiteral : LBRACK (expr (COMMA expr)*)? RBRACK ;

// Dictionaries
dictLiteral : LBRACE (pair (COMMA pair)*)? RBRACE ;
pair         : (STRING | NAME) COLON expr ;

// Generator Expression
genExpr : LPAREN NAME FOR NAME IN expr (IF expr)? RPAREN ;
