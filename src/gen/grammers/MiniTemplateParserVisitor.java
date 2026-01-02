// Generated from C:/Users/Dell/IdeaProjects/Compiler/src/grammers/MiniTemplateParser.g4 by ANTLR 4.13.1
package gen.grammers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniTemplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniTemplateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(MiniTemplateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlElement}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlElement(MiniTemplateParser.TemplateHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaVar(MiniTemplateParser.TemplateJinjaVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaBlock}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaBlock(MiniTemplateParser.TemplateJinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateText}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateText(MiniTemplateParser.TemplateTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniTemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(MiniTemplateParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlH1}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlH1(MiniTemplateParser.TemplateHtmlH1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlDiv}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlDiv(MiniTemplateParser.TemplateHtmlDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlHeader}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlHeader(MiniTemplateParser.TemplateHtmlHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlMain}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlMain(MiniTemplateParser.TemplateHtmlMainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlNav}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlNav(MiniTemplateParser.TemplateHtmlNavContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlFooter}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlFooter(MiniTemplateParser.TemplateHtmlFooterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlSection}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlSection(MiniTemplateParser.TemplateHtmlSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlP}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlP(MiniTemplateParser.TemplateHtmlPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlInput}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlInput(MiniTemplateParser.TemplateHtmlInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlButton}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlButton(MiniTemplateParser.TemplateHtmlButtonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlForm}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlForm(MiniTemplateParser.TemplateHtmlFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlUl}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlUl(MiniTemplateParser.TemplateHtmlUlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlLi}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlLi(MiniTemplateParser.TemplateHtmlLiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlA}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlA(MiniTemplateParser.TemplateHtmlAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHtmlStyle}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHtmlStyle(MiniTemplateParser.TemplateHtmlStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateTagWithContent}
	 * labeled alternative in {@link MiniTemplateParser#tagWithContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateTagWithContent(MiniTemplateParser.TemplateTagWithContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateH1Tag}
	 * labeled alternative in {@link MiniTemplateParser#h1Tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateH1Tag(MiniTemplateParser.TemplateH1TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalH1Start}
	 * labeled alternative in {@link MiniTemplateParser#h1Start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalH1Start(MiniTemplateParser.GlobalH1StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentH1Start}
	 * labeled alternative in {@link MiniTemplateParser#h1Start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentH1Start(MiniTemplateParser.HtmlContentH1StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateDivTag}
	 * labeled alternative in {@link MiniTemplateParser#divTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDivTag(MiniTemplateParser.TemplateDivTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalDivStart}
	 * labeled alternative in {@link MiniTemplateParser#divStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDivStart(MiniTemplateParser.GlobalDivStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentDivStart}
	 * labeled alternative in {@link MiniTemplateParser#divStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentDivStart(MiniTemplateParser.HtmlContentDivStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateHeaderTag}
	 * labeled alternative in {@link MiniTemplateParser#headerTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateHeaderTag(MiniTemplateParser.TemplateHeaderTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalHeaderStart}
	 * labeled alternative in {@link MiniTemplateParser#headerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalHeaderStart(MiniTemplateParser.GlobalHeaderStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentHeaderStart}
	 * labeled alternative in {@link MiniTemplateParser#headerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentHeaderStart(MiniTemplateParser.HtmlContentHeaderStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateMainTag}
	 * labeled alternative in {@link MiniTemplateParser#mainTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateMainTag(MiniTemplateParser.TemplateMainTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalMainStart}
	 * labeled alternative in {@link MiniTemplateParser#mainStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalMainStart(MiniTemplateParser.GlobalMainStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentMainStart}
	 * labeled alternative in {@link MiniTemplateParser#mainStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentMainStart(MiniTemplateParser.HtmlContentMainStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateFooterTag}
	 * labeled alternative in {@link MiniTemplateParser#footerTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateFooterTag(MiniTemplateParser.TemplateFooterTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalFooterStart}
	 * labeled alternative in {@link MiniTemplateParser#footerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFooterStart(MiniTemplateParser.GlobalFooterStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentFooterStart}
	 * labeled alternative in {@link MiniTemplateParser#footerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentFooterStart(MiniTemplateParser.HtmlContentFooterStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateNavTag}
	 * labeled alternative in {@link MiniTemplateParser#navTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateNavTag(MiniTemplateParser.TemplateNavTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalNavStart}
	 * labeled alternative in {@link MiniTemplateParser#navStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalNavStart(MiniTemplateParser.GlobalNavStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentNavStart}
	 * labeled alternative in {@link MiniTemplateParser#navStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentNavStart(MiniTemplateParser.HtmlContentNavStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateSectionTag}
	 * labeled alternative in {@link MiniTemplateParser#sectionTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateSectionTag(MiniTemplateParser.TemplateSectionTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalSectionStart}
	 * labeled alternative in {@link MiniTemplateParser#sectionStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalSectionStart(MiniTemplateParser.GlobalSectionStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentSectionStart}
	 * labeled alternative in {@link MiniTemplateParser#sectionStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentSectionStart(MiniTemplateParser.HtmlContentSectionStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplatePTag}
	 * labeled alternative in {@link MiniTemplateParser#pTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatePTag(MiniTemplateParser.TemplatePTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalPStart}
	 * labeled alternative in {@link MiniTemplateParser#pStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalPStart(MiniTemplateParser.GlobalPStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentPStart}
	 * labeled alternative in {@link MiniTemplateParser#pStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentPStart(MiniTemplateParser.HtmlContentPStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateInputTag}
	 * labeled alternative in {@link MiniTemplateParser#inputTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateInputTag(MiniTemplateParser.TemplateInputTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalInputStart}
	 * labeled alternative in {@link MiniTemplateParser#inputStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalInputStart(MiniTemplateParser.GlobalInputStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentInputStart}
	 * labeled alternative in {@link MiniTemplateParser#inputStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentInputStart(MiniTemplateParser.HtmlContentInputStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateButtonTag}
	 * labeled alternative in {@link MiniTemplateParser#buttonTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateButtonTag(MiniTemplateParser.TemplateButtonTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalButtonStart}
	 * labeled alternative in {@link MiniTemplateParser#buttonStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalButtonStart(MiniTemplateParser.GlobalButtonStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentButtonStart}
	 * labeled alternative in {@link MiniTemplateParser#buttonStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentButtonStart(MiniTemplateParser.HtmlContentButtonStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateFormTag}
	 * labeled alternative in {@link MiniTemplateParser#formTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateFormTag(MiniTemplateParser.TemplateFormTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalFormStart}
	 * labeled alternative in {@link MiniTemplateParser#formStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalFormStart(MiniTemplateParser.GlobalFormStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentFormStart}
	 * labeled alternative in {@link MiniTemplateParser#formStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentFormStart(MiniTemplateParser.HtmlContentFormStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUlTag}
	 * labeled alternative in {@link MiniTemplateParser#ulTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUlTag(MiniTemplateParser.TemplateUlTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalUlStart}
	 * labeled alternative in {@link MiniTemplateParser#ulStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalUlStart(MiniTemplateParser.GlobalUlStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentUlStart}
	 * labeled alternative in {@link MiniTemplateParser#ulStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentUlStart(MiniTemplateParser.HtmlContentUlStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateLiTag}
	 * labeled alternative in {@link MiniTemplateParser#liTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiTag(MiniTemplateParser.TemplateLiTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalLiStart}
	 * labeled alternative in {@link MiniTemplateParser#liStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalLiStart(MiniTemplateParser.GlobalLiStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentLiStart}
	 * labeled alternative in {@link MiniTemplateParser#liStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentLiStart(MiniTemplateParser.HtmlContentLiStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateATag}
	 * labeled alternative in {@link MiniTemplateParser#aTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateATag(MiniTemplateParser.TemplateATagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalAStart}
	 * labeled alternative in {@link MiniTemplateParser#aStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAStart(MiniTemplateParser.GlobalAStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentAStart}
	 * labeled alternative in {@link MiniTemplateParser#aStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentAStart(MiniTemplateParser.HtmlContentAStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateAttr}
	 * labeled alternative in {@link MiniTemplateParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateAttr(MiniTemplateParser.TemplateAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateQuotedDouble}
	 * labeled alternative in {@link MiniTemplateParser#quotedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateQuotedDouble(MiniTemplateParser.TemplateQuotedDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateQuotedSingle}
	 * labeled alternative in {@link MiniTemplateParser#quotedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateQuotedSingle(MiniTemplateParser.TemplateQuotedSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateQuotedText}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateQuotedText(MiniTemplateParser.TemplateQuotedTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateQuotedJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateQuotedJinjaVar(MiniTemplateParser.TemplateQuotedJinjaVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateQuotedJinjaBlock}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateQuotedJinjaBlock(MiniTemplateParser.TemplateQuotedJinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStyleTag}
	 * labeled alternative in {@link MiniTemplateParser#styleTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStyleTag(MiniTemplateParser.TemplateStyleTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssRules}
	 * labeled alternative in {@link MiniTemplateParser#cssRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssRules(MiniTemplateParser.TemplateCssRulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssRule}
	 * labeled alternative in {@link MiniTemplateParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssRule(MiniTemplateParser.TemplateCssRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssDeclarationList}
	 * labeled alternative in {@link MiniTemplateParser#cssDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssDeclarationList(MiniTemplateParser.TemplateCssDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssDeclaration}
	 * labeled alternative in {@link MiniTemplateParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssDeclaration(MiniTemplateParser.TemplateCssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssProperty}
	 * labeled alternative in {@link MiniTemplateParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssProperty(MiniTemplateParser.TemplateCssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssNumber}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssNumber(MiniTemplateParser.TemplateCssNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssFunction}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssFunction(MiniTemplateParser.TemplateCssFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssIdent}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssIdent(MiniTemplateParser.TemplateCssIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssString}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssString(MiniTemplateParser.TemplateCssStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssColor}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssColor(MiniTemplateParser.TemplateCssColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssJinjaVar(MiniTemplateParser.TemplateCssJinjaVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniTemplateParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunction(MiniTemplateParser.CssFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssSelectorList}
	 * labeled alternative in {@link MiniTemplateParser#cssSelectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssSelectorList(MiniTemplateParser.TemplateCssSelectorListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCssSelector}
	 * labeled alternative in {@link MiniTemplateParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCssSelector(MiniTemplateParser.TemplateCssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateSelectorUnit}
	 * labeled alternative in {@link MiniTemplateParser#selectorUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateSelectorUnit(MiniTemplateParser.TemplateSelectorUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateBaseSelectorTag}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBaseSelectorTag(MiniTemplateParser.TemplateBaseSelectorTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateBaseSelectorIdent}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBaseSelectorIdent(MiniTemplateParser.TemplateBaseSelectorIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateBaseSelectorStar}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBaseSelectorStar(MiniTemplateParser.TemplateBaseSelectorStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateBaseSelectorClass}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBaseSelectorClass(MiniTemplateParser.TemplateBaseSelectorClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateBaseSelectorId}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBaseSelectorId(MiniTemplateParser.TemplateBaseSelectorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateClassPart}
	 * labeled alternative in {@link MiniTemplateParser#classPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateClassPart(MiniTemplateParser.TemplateClassPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateIdPart}
	 * labeled alternative in {@link MiniTemplateParser#idPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateIdPart(MiniTemplateParser.TemplateIdPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCombinatorGt}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCombinatorGt(MiniTemplateParser.TemplateCombinatorGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCombinatorPlus}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCombinatorPlus(MiniTemplateParser.TemplateCombinatorPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCombinatorGenSib}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCombinatorGenSib(MiniTemplateParser.TemplateCombinatorGenSibContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateCombinatorNone}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateCombinatorNone(MiniTemplateParser.TemplateCombinatorNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoClassNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassNode(MiniTemplateParser.PseudoClassNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoArgsNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoArgsNode(MiniTemplateParser.PseudoArgsNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PseudoExprNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoExprNode(MiniTemplateParser.PseudoExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIdent(MiniTemplateParser.AtomIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(MiniTemplateParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(MiniTemplateParser.AtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomDotIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomDotIdent(MiniTemplateParser.AtomDotIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomColonIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomColonIdent(MiniTemplateParser.AtomColonIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomParenExpr}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomParenExpr(MiniTemplateParser.AtomParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomComma}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomComma(MiniTemplateParser.AtomCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomPlus}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPlus(MiniTemplateParser.AtomPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomMinus}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomMinus(MiniTemplateParser.AtomMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomStar}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomStar(MiniTemplateParser.AtomStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomGt}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomGt(MiniTemplateParser.AtomGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplatePseudoElementExpr}
	 * labeled alternative in {@link MiniTemplateParser#pseudoElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatePseudoElementExpr(MiniTemplateParser.TemplatePseudoElementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaVarExpr}
	 * labeled alternative in {@link MiniTemplateParser#jinjaVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaVarExpr(MiniTemplateParser.TemplateJinjaVarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVarStart(MiniTemplateParser.JinjaVarStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaHtmlVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaHtmlVarStart(MiniTemplateParser.JinjaHtmlVarStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaHtmlAttrVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaHtmlAttrVarStart(MiniTemplateParser.JinjaHtmlAttrVarStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaHtmlAttrValueVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaHtmlAttrValueVarStart(MiniTemplateParser.JinjaHtmlAttrValueVarStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCssValueVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCssValueVarStart(MiniTemplateParser.JinjaCssValueVarStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaForBlock}
	 * labeled alternative in {@link MiniTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaForBlock(MiniTemplateParser.TemplateJinjaForBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaIfBlock}
	 * labeled alternative in {@link MiniTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaIfBlock(MiniTemplateParser.TemplateJinjaIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaFor}
	 * labeled alternative in {@link MiniTemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaFor(MiniTemplateParser.TemplateJinjaForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaIf}
	 * labeled alternative in {@link MiniTemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaIf(MiniTemplateParser.TemplateJinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockStart(MiniTemplateParser.JinjaBlockStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaHtmlBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaHtmlBlockStart(MiniTemplateParser.JinjaHtmlBlockStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaHtmlAttrBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaHtmlAttrBlockStart(MiniTemplateParser.JinjaHtmlAttrBlockStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaHtmlAttrValueBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaHtmlAttrValueBlockStart(MiniTemplateParser.JinjaHtmlAttrValueBlockStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskEqualityExpr}
	 * labeled alternative in {@link MiniTemplateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskEqualityExpr(MiniTemplateParser.FlaskEqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAdditiveExpr}
	 * labeled alternative in {@link MiniTemplateParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAdditiveExpr(MiniTemplateParser.FlaskAdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskPrimaryExpr}
	 * labeled alternative in {@link MiniTemplateParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskPrimaryExpr(MiniTemplateParser.FlaskPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAttrAccess}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAttrAccess(MiniTemplateParser.FlaskAttrAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskIndexing}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskIndexing(MiniTemplateParser.FlaskIndexingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskCallSuffix}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskCallSuffix(MiniTemplateParser.FlaskCallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskArgsList}
	 * labeled alternative in {@link MiniTemplateParser#routeArgKws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskArgsList(MiniTemplateParser.FlaskArgsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskKwArg}
	 * labeled alternative in {@link MiniTemplateParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskKwArg(MiniTemplateParser.FlaskKwArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskPosArg}
	 * labeled alternative in {@link MiniTemplateParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskPosArg(MiniTemplateParser.FlaskPosArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomName}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomName(MiniTemplateParser.FlaskAtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomString}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomString(MiniTemplateParser.FlaskAtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomNumber}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomNumber(MiniTemplateParser.FlaskAtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlskAtomApp}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlskAtomApp(MiniTemplateParser.FlskAtomAppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomNone}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomNone(MiniTemplateParser.FlaskAtomNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomTrue}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomTrue(MiniTemplateParser.FlaskAtomTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomFalse}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomFalse(MiniTemplateParser.FlaskAtomFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomList}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomList(MiniTemplateParser.FlaskAtomListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomDict}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomDict(MiniTemplateParser.FlaskAtomDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomGenExpr}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomGenExpr(MiniTemplateParser.FlaskAtomGenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskAtomParen}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskAtomParen(MiniTemplateParser.FlaskAtomParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskListLiteral}
	 * labeled alternative in {@link MiniTemplateParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskListLiteral(MiniTemplateParser.FlaskListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskDictLiteral}
	 * labeled alternative in {@link MiniTemplateParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskDictLiteral(MiniTemplateParser.FlaskDictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskDictPair}
	 * labeled alternative in {@link MiniTemplateParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskDictPair(MiniTemplateParser.FlaskDictPairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskGeneratorExpr}
	 * labeled alternative in {@link MiniTemplateParser#genExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskGeneratorExpr(MiniTemplateParser.FlaskGeneratorExprContext ctx);
}