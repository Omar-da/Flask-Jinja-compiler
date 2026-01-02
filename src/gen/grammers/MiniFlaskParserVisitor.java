// Generated from C:/Users/Dell/IdeaProjects/Compiler/src/grammers/MiniFlaskParser.g4 by ANTLR 4.13.1
package gen.grammers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniFlaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniFlaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniFlaskParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(MiniFlaskParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskImportStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskImportStmt(MiniFlaskParser.FlaskImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskRouteDefStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskRouteDefStmt(MiniFlaskParser.FlaskRouteDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskFuncDefStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskFuncDefStmt(MiniFlaskParser.FlaskFuncDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAssignStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAssignStmt(MiniFlaskParser.FlaskAssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskIfStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskIfStmt(MiniFlaskParser.FlaskIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskReturnStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskReturnStmt(MiniFlaskParser.FlaskReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskExprStmt}
	 * labeled alternative in {@link MiniFlaskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskExprStmt(MiniFlaskParser.FlaskExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskImportNamesStmt}
	 * labeled alternative in {@link MiniFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskImportNamesStmt(MiniFlaskParser.FlaskImportNamesStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskFromImportStmt}
	 * labeled alternative in {@link MiniFlaskParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskFromImportStmt(MiniFlaskParser.FlaskFromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskImportNameList}
	 * labeled alternative in {@link MiniFlaskParser#importNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskImportNameList(MiniFlaskParser.FlaskImportNameListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskRouteDefinition}
	 * labeled alternative in {@link MiniFlaskParser#routeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskRouteDefinition(MiniFlaskParser.FlaskRouteDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskRouteArgsList}
	 * labeled alternative in {@link MiniFlaskParser#routeArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskRouteArgsList(MiniFlaskParser.FlaskRouteArgsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskRouteArgString}
	 * labeled alternative in {@link MiniFlaskParser#routeArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskRouteArgString(MiniFlaskParser.FlaskRouteArgStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskRouteArgKw}
	 * labeled alternative in {@link MiniFlaskParser#routeArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskRouteArgKw(MiniFlaskParser.FlaskRouteArgKwContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskFunctionDef}
	 * labeled alternative in {@link MiniFlaskParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskFunctionDef(MiniFlaskParser.FlaskFunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskParamsList}
	 * labeled alternative in {@link MiniFlaskParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskParamsList(MiniFlaskParser.FlaskParamsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskParamSimple}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskParamSimple(MiniFlaskParser.FlaskParamSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskParamDefault}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskParamDefault(MiniFlaskParser.FlaskParamDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskParamType}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskParamType(MiniFlaskParser.FlaskParamTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskParamTypeDefault}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskParamTypeDefault(MiniFlaskParser.FlaskParamTypeDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskParamStar}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskParamStar(MiniFlaskParser.FlaskParamStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskParamDoubleStar}
	 * labeled alternative in {@link MiniFlaskParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskParamDoubleStar(MiniFlaskParser.FlaskParamDoubleStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskSimpleParam}
	 * labeled alternative in {@link MiniFlaskParser#simpleParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskSimpleParam(MiniFlaskParser.FlaskSimpleParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskDefaultParam}
	 * labeled alternative in {@link MiniFlaskParser#defaultParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskDefaultParam(MiniFlaskParser.FlaskDefaultParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskTypeAnnotatedParam}
	 * labeled alternative in {@link MiniFlaskParser#typeAnnotatedParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskTypeAnnotatedParam(MiniFlaskParser.FlaskTypeAnnotatedParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskTypeAnnotatedDefaultParam}
	 * labeled alternative in {@link MiniFlaskParser#typeAnnotatedDefaultParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskTypeAnnotatedDefaultParam(MiniFlaskParser.FlaskTypeAnnotatedDefaultParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskStarParam}
	 * labeled alternative in {@link MiniFlaskParser#starParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskStarParam(MiniFlaskParser.FlaskStarParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskDoubleStarParam}
	 * labeled alternative in {@link MiniFlaskParser#doubleStarParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskDoubleStarParam(MiniFlaskParser.FlaskDoubleStarParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskTypeExpr}
	 * labeled alternative in {@link MiniFlaskParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskTypeExpr(MiniFlaskParser.FlaskTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAssignment}
	 * labeled alternative in {@link MiniFlaskParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAssignment(MiniFlaskParser.FlaskAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskIfStatement}
	 * labeled alternative in {@link MiniFlaskParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskIfStatement(MiniFlaskParser.FlaskIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskReturnStatement}
	 * labeled alternative in {@link MiniFlaskParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskReturnStatement(MiniFlaskParser.FlaskReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskExpressionStatement}
	 * labeled alternative in {@link MiniFlaskParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskExpressionStatement(MiniFlaskParser.FlaskExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskEqualityExpr}
	 * labeled alternative in {@link MiniFlaskParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskEqualityExpr(MiniFlaskParser.FlaskEqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAdditiveExpr}
	 * labeled alternative in {@link MiniFlaskParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAdditiveExpr(MiniFlaskParser.FlaskAdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskPrimaryExpr}
	 * labeled alternative in {@link MiniFlaskParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskPrimaryExpr(MiniFlaskParser.FlaskPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAttrAccess}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAttrAccess(MiniFlaskParser.FlaskAttrAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskIndexing}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskIndexing(MiniFlaskParser.FlaskIndexingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskCallSuffix}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskCallSuffix(MiniFlaskParser.FlaskCallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskGenExpr}
	 * labeled alternative in {@link MiniFlaskParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskGenExpr(MiniFlaskParser.FlaskGenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskArgsList}
	 * labeled alternative in {@link MiniFlaskParser#routeArgKws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskArgsList(MiniFlaskParser.FlaskArgsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskKwArg}
	 * labeled alternative in {@link MiniFlaskParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskKwArg(MiniFlaskParser.FlaskKwArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskPosArg}
	 * labeled alternative in {@link MiniFlaskParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskPosArg(MiniFlaskParser.FlaskPosArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomName}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomName(MiniFlaskParser.FlaskAtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomString}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomString(MiniFlaskParser.FlaskAtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomNumber}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomNumber(MiniFlaskParser.FlaskAtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlskAtomApp}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlskAtomApp(MiniFlaskParser.FlskAtomAppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomNone}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomNone(MiniFlaskParser.FlaskAtomNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomTrue}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomTrue(MiniFlaskParser.FlaskAtomTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomFalse}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomFalse(MiniFlaskParser.FlaskAtomFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomList}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomList(MiniFlaskParser.FlaskAtomListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomDict}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomDict(MiniFlaskParser.FlaskAtomDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomGenExpr}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomGenExpr(MiniFlaskParser.FlaskAtomGenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomParen}
	 * labeled alternative in {@link MiniFlaskParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomParen(MiniFlaskParser.FlaskAtomParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskListLiteral}
	 * labeled alternative in {@link MiniFlaskParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskListLiteral(MiniFlaskParser.FlaskListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskDictLiteral}
	 * labeled alternative in {@link MiniFlaskParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskDictLiteral(MiniFlaskParser.FlaskDictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskDictPair}
	 * labeled alternative in {@link MiniFlaskParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskDictPair(MiniFlaskParser.FlaskDictPairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskGeneratorExpr}
	 * labeled alternative in {@link MiniFlaskParser#genExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskGeneratorExpr(MiniFlaskParser.FlaskGeneratorExprContext ctx);
}