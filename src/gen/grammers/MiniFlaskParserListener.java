// Generated from C:/Users/Dell/IdeaProjects/Compiler/src/grammers/MiniFlaskParser.g4 by ANTLR 4.13.1
package gen.grammers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniFlaskParser}.
 */
public interface MiniFlaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniFlaskParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MiniFlaskParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniFlaskParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MiniFlaskParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskImportStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlaskImportStmt(MiniFlaskParser.FlaskImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskImportStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlaskImportStmt(MiniFlaskParser.FlaskImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskRouteDefStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlaskRouteDefStmt(MiniFlaskParser.FlaskRouteDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskRouteDefStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlaskRouteDefStmt(MiniFlaskParser.FlaskRouteDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskFuncDefStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlaskFuncDefStmt(MiniFlaskParser.FlaskFuncDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskFuncDefStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlaskFuncDefStmt(MiniFlaskParser.FlaskFuncDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAssignStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAssignStmt(MiniFlaskParser.FlaskAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAssignStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAssignStmt(MiniFlaskParser.FlaskAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskIfStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlaskIfStmt(MiniFlaskParser.FlaskIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskIfStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlaskIfStmt(MiniFlaskParser.FlaskIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskReturnStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlaskReturnStmt(MiniFlaskParser.FlaskReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskReturnStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlaskReturnStmt(MiniFlaskParser.FlaskReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskExprStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFlaskExprStmt(MiniFlaskParser.FlaskExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskExprStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFlaskExprStmt(MiniFlaskParser.FlaskExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskImportNamesStmt}
	 * labeled alternative in {@link MiniFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterFlaskImportNamesStmt(MiniFlaskParser.FlaskImportNamesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskImportNamesStmt}
	 * labeled alternative in {@link MiniFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitFlaskImportNamesStmt(MiniFlaskParser.FlaskImportNamesStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskFromImportStmt}
	 * labeled alternative in {@link MiniFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterFlaskFromImportStmt(MiniFlaskParser.FlaskFromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskFromImportStmt}
	 * labeled alternative in {@link MiniFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitFlaskFromImportStmt(MiniFlaskParser.FlaskFromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskImportNameList}
	 * labeled alternative in {@link MiniFlaskParser#importNames}.
	 * @param ctx the parse tree
	 */
	void enterFlaskImportNameList(MiniFlaskParser.FlaskImportNameListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskImportNameList}
	 * labeled alternative in {@link MiniFlaskParser#importNames}.
	 * @param ctx the parse tree
	 */
	void exitFlaskImportNameList(MiniFlaskParser.FlaskImportNameListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskRouteDefinition}
	 * labeled alternative in {@link MiniFlaskParser#routeDef}.
	 * @param ctx the parse tree
	 */
	void enterFlaskRouteDefinition(MiniFlaskParser.FlaskRouteDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskRouteDefinition}
	 * labeled alternative in {@link MiniFlaskParser#routeDef}.
	 * @param ctx the parse tree
	 */
	void exitFlaskRouteDefinition(MiniFlaskParser.FlaskRouteDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskRouteArgsList}
	 * labeled alternative in {@link MiniFlaskParser#routeArgs}.
	 * @param ctx the parse tree
	 */
	void enterFlaskRouteArgsList(MiniFlaskParser.FlaskRouteArgsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskRouteArgsList}
	 * labeled alternative in {@link MiniFlaskParser#routeArgs}.
	 * @param ctx the parse tree
	 */
	void exitFlaskRouteArgsList(MiniFlaskParser.FlaskRouteArgsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskRouteArgString}
	 * labeled alternative in {@link MiniFlaskParser#routeArg}.
	 * @param ctx the parse tree
	 */
	void enterFlaskRouteArgString(MiniFlaskParser.FlaskRouteArgStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskRouteArgString}
	 * labeled alternative in {@link MiniFlaskParser#routeArg}.
	 * @param ctx the parse tree
	 */
	void exitFlaskRouteArgString(MiniFlaskParser.FlaskRouteArgStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskRouteArgKw}
	 * labeled alternative in {@link MiniFlaskParser#routeArg}.
	 * @param ctx the parse tree
	 */
	void enterFlaskRouteArgKw(MiniFlaskParser.FlaskRouteArgKwContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskRouteArgKw}
	 * labeled alternative in {@link MiniFlaskParser#routeArg}.
	 * @param ctx the parse tree
	 */
	void exitFlaskRouteArgKw(MiniFlaskParser.FlaskRouteArgKwContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskFunctionDef}
	 * labeled alternative in {@link MiniFlaskParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFlaskFunctionDef(MiniFlaskParser.FlaskFunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskFunctionDef}
	 * labeled alternative in {@link MiniFlaskParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFlaskFunctionDef(MiniFlaskParser.FlaskFunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskParamsList}
	 * labeled alternative in {@link MiniFlaskParser#params}.
	 * @param ctx the parse tree
	 */
	void enterFlaskParamsList(MiniFlaskParser.FlaskParamsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskParamsList}
	 * labeled alternative in {@link MiniFlaskParser#params}.
	 * @param ctx the parse tree
	 */
	void exitFlaskParamsList(MiniFlaskParser.FlaskParamsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskParamSimple}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFlaskParamSimple(MiniFlaskParser.FlaskParamSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskParamSimple}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFlaskParamSimple(MiniFlaskParser.FlaskParamSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskParamDefault}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFlaskParamDefault(MiniFlaskParser.FlaskParamDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskParamDefault}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFlaskParamDefault(MiniFlaskParser.FlaskParamDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskParamType}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFlaskParamType(MiniFlaskParser.FlaskParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskParamType}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFlaskParamType(MiniFlaskParser.FlaskParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskParamTypeDefault}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFlaskParamTypeDefault(MiniFlaskParser.FlaskParamTypeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskParamTypeDefault}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFlaskParamTypeDefault(MiniFlaskParser.FlaskParamTypeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskParamStar}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFlaskParamStar(MiniFlaskParser.FlaskParamStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskParamStar}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFlaskParamStar(MiniFlaskParser.FlaskParamStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskParamDoubleStar}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFlaskParamDoubleStar(MiniFlaskParser.FlaskParamDoubleStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskParamDoubleStar}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFlaskParamDoubleStar(MiniFlaskParser.FlaskParamDoubleStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskSimpleParam}
	 * labeled alternative in {@link MiniFlaskParser#simpleParam}.
	 * @param ctx the parse tree
	 */
	void enterFlaskSimpleParam(MiniFlaskParser.FlaskSimpleParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskSimpleParam}
	 * labeled alternative in {@link MiniFlaskParser#simpleParam}.
	 * @param ctx the parse tree
	 */
	void exitFlaskSimpleParam(MiniFlaskParser.FlaskSimpleParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskDefaultParam}
	 * labeled alternative in {@link MiniFlaskParser#defaultParam}.
	 * @param ctx the parse tree
	 */
	void enterFlaskDefaultParam(MiniFlaskParser.FlaskDefaultParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskDefaultParam}
	 * labeled alternative in {@link MiniFlaskParser#defaultParam}.
	 * @param ctx the parse tree
	 */
	void exitFlaskDefaultParam(MiniFlaskParser.FlaskDefaultParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskTypeAnnotatedParam}
	 * labeled alternative in {@link MiniFlaskParser#typeAnnotatedParam}.
	 * @param ctx the parse tree
	 */
	void enterFlaskTypeAnnotatedParam(MiniFlaskParser.FlaskTypeAnnotatedParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskTypeAnnotatedParam}
	 * labeled alternative in {@link MiniFlaskParser#typeAnnotatedParam}.
	 * @param ctx the parse tree
	 */
	void exitFlaskTypeAnnotatedParam(MiniFlaskParser.FlaskTypeAnnotatedParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskTypeAnnotatedDefaultParam}
	 * labeled alternative in {@link MiniFlaskParser#typeAnnotatedDefaultParam}.
	 * @param ctx the parse tree
	 */
	void enterFlaskTypeAnnotatedDefaultParam(MiniFlaskParser.FlaskTypeAnnotatedDefaultParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskTypeAnnotatedDefaultParam}
	 * labeled alternative in {@link MiniFlaskParser#typeAnnotatedDefaultParam}.
	 * @param ctx the parse tree
	 */
	void exitFlaskTypeAnnotatedDefaultParam(MiniFlaskParser.FlaskTypeAnnotatedDefaultParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskStarParam}
	 * labeled alternative in {@link MiniFlaskParser#starParam}.
	 * @param ctx the parse tree
	 */
	void enterFlaskStarParam(MiniFlaskParser.FlaskStarParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskStarParam}
	 * labeled alternative in {@link MiniFlaskParser#starParam}.
	 * @param ctx the parse tree
	 */
	void exitFlaskStarParam(MiniFlaskParser.FlaskStarParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskDoubleStarParam}
	 * labeled alternative in {@link MiniFlaskParser#doubleStarParam}.
	 * @param ctx the parse tree
	 */
	void enterFlaskDoubleStarParam(MiniFlaskParser.FlaskDoubleStarParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskDoubleStarParam}
	 * labeled alternative in {@link MiniFlaskParser#doubleStarParam}.
	 * @param ctx the parse tree
	 */
	void exitFlaskDoubleStarParam(MiniFlaskParser.FlaskDoubleStarParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskTypeExpr}
	 * labeled alternative in {@link MiniFlaskParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterFlaskTypeExpr(MiniFlaskParser.FlaskTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskTypeExpr}
	 * labeled alternative in {@link MiniFlaskParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitFlaskTypeExpr(MiniFlaskParser.FlaskTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAssignment}
	 * labeled alternative in {@link MiniFlaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAssignment(MiniFlaskParser.FlaskAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAssignment}
	 * labeled alternative in {@link MiniFlaskParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAssignment(MiniFlaskParser.FlaskAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskIfStatement}
	 * labeled alternative in {@link MiniFlaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterFlaskIfStatement(MiniFlaskParser.FlaskIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskIfStatement}
	 * labeled alternative in {@link MiniFlaskParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitFlaskIfStatement(MiniFlaskParser.FlaskIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskReturnStatement}
	 * labeled alternative in {@link MiniFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterFlaskReturnStatement(MiniFlaskParser.FlaskReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskReturnStatement}
	 * labeled alternative in {@link MiniFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitFlaskReturnStatement(MiniFlaskParser.FlaskReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskExpressionStatement}
	 * labeled alternative in {@link MiniFlaskParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterFlaskExpressionStatement(MiniFlaskParser.FlaskExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskExpressionStatement}
	 * labeled alternative in {@link MiniFlaskParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitFlaskExpressionStatement(MiniFlaskParser.FlaskExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskEqualityExpr}
	 * labeled alternative in {@link MiniFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFlaskEqualityExpr(MiniFlaskParser.FlaskEqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskEqualityExpr}
	 * labeled alternative in {@link MiniFlaskParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFlaskEqualityExpr(MiniFlaskParser.FlaskEqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAdditiveExpr}
	 * labeled alternative in {@link MiniFlaskParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAdditiveExpr(MiniFlaskParser.FlaskAdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAdditiveExpr}
	 * labeled alternative in {@link MiniFlaskParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAdditiveExpr(MiniFlaskParser.FlaskAdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskPrimaryExpr}
	 * labeled alternative in {@link MiniFlaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFlaskPrimaryExpr(MiniFlaskParser.FlaskPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskPrimaryExpr}
	 * labeled alternative in {@link MiniFlaskParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFlaskPrimaryExpr(MiniFlaskParser.FlaskPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAttrAccess}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAttrAccess(MiniFlaskParser.FlaskAttrAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAttrAccess}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAttrAccess(MiniFlaskParser.FlaskAttrAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskIndexing}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterFlaskIndexing(MiniFlaskParser.FlaskIndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskIndexing}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitFlaskIndexing(MiniFlaskParser.FlaskIndexingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskCallSuffix}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterFlaskCallSuffix(MiniFlaskParser.FlaskCallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskCallSuffix}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitFlaskCallSuffix(MiniFlaskParser.FlaskCallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskGenExpr}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterFlaskGenExpr(MiniFlaskParser.FlaskGenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskGenExpr}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitFlaskGenExpr(MiniFlaskParser.FlaskGenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskArgsList}
	 * labeled alternative in {@link MiniFlaskParser#routeArgKws}.
	 * @param ctx the parse tree
	 */
	void enterFlaskArgsList(MiniFlaskParser.FlaskArgsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskArgsList}
	 * labeled alternative in {@link MiniFlaskParser#routeArgKws}.
	 * @param ctx the parse tree
	 */
	void exitFlaskArgsList(MiniFlaskParser.FlaskArgsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskKwArg}
	 * labeled alternative in {@link MiniFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterFlaskKwArg(MiniFlaskParser.FlaskKwArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskKwArg}
	 * labeled alternative in {@link MiniFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitFlaskKwArg(MiniFlaskParser.FlaskKwArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskPosArg}
	 * labeled alternative in {@link MiniFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterFlaskPosArg(MiniFlaskParser.FlaskPosArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskPosArg}
	 * labeled alternative in {@link MiniFlaskParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitFlaskPosArg(MiniFlaskParser.FlaskPosArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomName}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomName(MiniFlaskParser.FlaskAtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomName}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomName(MiniFlaskParser.FlaskAtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomString}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomString(MiniFlaskParser.FlaskAtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomString}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomString(MiniFlaskParser.FlaskAtomStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomNumber}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomNumber(MiniFlaskParser.FlaskAtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomNumber}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomNumber(MiniFlaskParser.FlaskAtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlskAtomApp}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlskAtomApp(MiniFlaskParser.FlskAtomAppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlskAtomApp}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlskAtomApp(MiniFlaskParser.FlskAtomAppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomNone}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomNone(MiniFlaskParser.FlaskAtomNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomNone}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomNone(MiniFlaskParser.FlaskAtomNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomTrue}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomTrue(MiniFlaskParser.FlaskAtomTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomTrue}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomTrue(MiniFlaskParser.FlaskAtomTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomFalse}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomFalse(MiniFlaskParser.FlaskAtomFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomFalse}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomFalse(MiniFlaskParser.FlaskAtomFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomList}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomList(MiniFlaskParser.FlaskAtomListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomList}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomList(MiniFlaskParser.FlaskAtomListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomDict}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomDict(MiniFlaskParser.FlaskAtomDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomDict}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomDict(MiniFlaskParser.FlaskAtomDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomGenExpr}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomGenExpr(MiniFlaskParser.FlaskAtomGenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomGenExpr}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomGenExpr(MiniFlaskParser.FlaskAtomGenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomParen}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomParen(MiniFlaskParser.FlaskAtomParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomParen}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomParen(MiniFlaskParser.FlaskAtomParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskListLiteral}
	 * labeled alternative in {@link MiniFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFlaskListLiteral(MiniFlaskParser.FlaskListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskListLiteral}
	 * labeled alternative in {@link MiniFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFlaskListLiteral(MiniFlaskParser.FlaskListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskDictLiteral}
	 * labeled alternative in {@link MiniFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFlaskDictLiteral(MiniFlaskParser.FlaskDictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskDictLiteral}
	 * labeled alternative in {@link MiniFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFlaskDictLiteral(MiniFlaskParser.FlaskDictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskDictPair}
	 * labeled alternative in {@link MiniFlaskParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterFlaskDictPair(MiniFlaskParser.FlaskDictPairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskDictPair}
	 * labeled alternative in {@link MiniFlaskParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitFlaskDictPair(MiniFlaskParser.FlaskDictPairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskGeneratorExpr}
	 * labeled alternative in {@link MiniFlaskParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void enterFlaskGeneratorExpr(MiniFlaskParser.FlaskGeneratorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskGeneratorExpr}
	 * labeled alternative in {@link MiniFlaskParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void exitFlaskGeneratorExpr(MiniFlaskParser.FlaskGeneratorExprContext ctx);
}