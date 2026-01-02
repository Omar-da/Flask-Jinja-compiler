// Generated from C:/Users/Dell/IdeaProjects/Compiler/src/grammers/MiniTemplateParser.g4 by ANTLR 4.13.1
package gen.grammers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniTemplateParser}.
 */
public interface MiniTemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniTemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(MiniTemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniTemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(MiniTemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlElement}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlElement(MiniTemplateParser.TemplateHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlElement}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlElement(MiniTemplateParser.TemplateHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaVar(MiniTemplateParser.TemplateJinjaVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaVar(MiniTemplateParser.TemplateJinjaVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaBlock}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaBlock(MiniTemplateParser.TemplateJinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaBlock}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaBlock(MiniTemplateParser.TemplateJinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateText}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTemplateText(MiniTemplateParser.TemplateTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateText}
	 * labeled alternative in {@link MiniTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTemplateText(MiniTemplateParser.TemplateTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(MiniTemplateParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(MiniTemplateParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlH1}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlH1(MiniTemplateParser.TemplateHtmlH1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlH1}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlH1(MiniTemplateParser.TemplateHtmlH1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlDiv}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlDiv(MiniTemplateParser.TemplateHtmlDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlDiv}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlDiv(MiniTemplateParser.TemplateHtmlDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlHeader}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlHeader(MiniTemplateParser.TemplateHtmlHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlHeader}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlHeader(MiniTemplateParser.TemplateHtmlHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlMain}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlMain(MiniTemplateParser.TemplateHtmlMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlMain}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlMain(MiniTemplateParser.TemplateHtmlMainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlNav}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlNav(MiniTemplateParser.TemplateHtmlNavContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlNav}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlNav(MiniTemplateParser.TemplateHtmlNavContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlFooter}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlFooter(MiniTemplateParser.TemplateHtmlFooterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlFooter}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlFooter(MiniTemplateParser.TemplateHtmlFooterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlSection}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlSection(MiniTemplateParser.TemplateHtmlSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlSection}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlSection(MiniTemplateParser.TemplateHtmlSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlP}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlP(MiniTemplateParser.TemplateHtmlPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlP}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlP(MiniTemplateParser.TemplateHtmlPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlInput}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlInput(MiniTemplateParser.TemplateHtmlInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlInput}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlInput(MiniTemplateParser.TemplateHtmlInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlButton}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlButton(MiniTemplateParser.TemplateHtmlButtonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlButton}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlButton(MiniTemplateParser.TemplateHtmlButtonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlForm}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlForm(MiniTemplateParser.TemplateHtmlFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlForm}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlForm(MiniTemplateParser.TemplateHtmlFormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlUl}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlUl(MiniTemplateParser.TemplateHtmlUlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlUl}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlUl(MiniTemplateParser.TemplateHtmlUlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlLi}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlLi(MiniTemplateParser.TemplateHtmlLiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlLi}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlLi(MiniTemplateParser.TemplateHtmlLiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlA}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlA(MiniTemplateParser.TemplateHtmlAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlA}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlA(MiniTemplateParser.TemplateHtmlAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHtmlStyle}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHtmlStyle(MiniTemplateParser.TemplateHtmlStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHtmlStyle}
	 * labeled alternative in {@link MiniTemplateParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHtmlStyle(MiniTemplateParser.TemplateHtmlStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateTagWithContent}
	 * labeled alternative in {@link MiniTemplateParser#tagWithContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateTagWithContent(MiniTemplateParser.TemplateTagWithContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateTagWithContent}
	 * labeled alternative in {@link MiniTemplateParser#tagWithContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateTagWithContent(MiniTemplateParser.TemplateTagWithContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateH1Tag}
	 * labeled alternative in {@link MiniTemplateParser#h1Tag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateH1Tag(MiniTemplateParser.TemplateH1TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateH1Tag}
	 * labeled alternative in {@link MiniTemplateParser#h1Tag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateH1Tag(MiniTemplateParser.TemplateH1TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalH1Start}
	 * labeled alternative in {@link MiniTemplateParser#h1Start}.
	 * @param ctx the parse tree
	 */
	void enterGlobalH1Start(MiniTemplateParser.GlobalH1StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalH1Start}
	 * labeled alternative in {@link MiniTemplateParser#h1Start}.
	 * @param ctx the parse tree
	 */
	void exitGlobalH1Start(MiniTemplateParser.GlobalH1StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentH1Start}
	 * labeled alternative in {@link MiniTemplateParser#h1Start}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentH1Start(MiniTemplateParser.HtmlContentH1StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentH1Start}
	 * labeled alternative in {@link MiniTemplateParser#h1Start}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentH1Start(MiniTemplateParser.HtmlContentH1StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateDivTag}
	 * labeled alternative in {@link MiniTemplateParser#divTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDivTag(MiniTemplateParser.TemplateDivTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateDivTag}
	 * labeled alternative in {@link MiniTemplateParser#divTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDivTag(MiniTemplateParser.TemplateDivTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalDivStart}
	 * labeled alternative in {@link MiniTemplateParser#divStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDivStart(MiniTemplateParser.GlobalDivStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalDivStart}
	 * labeled alternative in {@link MiniTemplateParser#divStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDivStart(MiniTemplateParser.GlobalDivStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentDivStart}
	 * labeled alternative in {@link MiniTemplateParser#divStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentDivStart(MiniTemplateParser.HtmlContentDivStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentDivStart}
	 * labeled alternative in {@link MiniTemplateParser#divStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentDivStart(MiniTemplateParser.HtmlContentDivStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateHeaderTag}
	 * labeled alternative in {@link MiniTemplateParser#headerTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateHeaderTag(MiniTemplateParser.TemplateHeaderTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateHeaderTag}
	 * labeled alternative in {@link MiniTemplateParser#headerTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateHeaderTag(MiniTemplateParser.TemplateHeaderTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalHeaderStart}
	 * labeled alternative in {@link MiniTemplateParser#headerStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalHeaderStart(MiniTemplateParser.GlobalHeaderStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalHeaderStart}
	 * labeled alternative in {@link MiniTemplateParser#headerStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalHeaderStart(MiniTemplateParser.GlobalHeaderStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentHeaderStart}
	 * labeled alternative in {@link MiniTemplateParser#headerStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentHeaderStart(MiniTemplateParser.HtmlContentHeaderStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentHeaderStart}
	 * labeled alternative in {@link MiniTemplateParser#headerStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentHeaderStart(MiniTemplateParser.HtmlContentHeaderStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateMainTag}
	 * labeled alternative in {@link MiniTemplateParser#mainTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateMainTag(MiniTemplateParser.TemplateMainTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateMainTag}
	 * labeled alternative in {@link MiniTemplateParser#mainTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateMainTag(MiniTemplateParser.TemplateMainTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalMainStart}
	 * labeled alternative in {@link MiniTemplateParser#mainStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalMainStart(MiniTemplateParser.GlobalMainStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalMainStart}
	 * labeled alternative in {@link MiniTemplateParser#mainStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalMainStart(MiniTemplateParser.GlobalMainStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentMainStart}
	 * labeled alternative in {@link MiniTemplateParser#mainStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentMainStart(MiniTemplateParser.HtmlContentMainStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentMainStart}
	 * labeled alternative in {@link MiniTemplateParser#mainStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentMainStart(MiniTemplateParser.HtmlContentMainStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateFooterTag}
	 * labeled alternative in {@link MiniTemplateParser#footerTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateFooterTag(MiniTemplateParser.TemplateFooterTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateFooterTag}
	 * labeled alternative in {@link MiniTemplateParser#footerTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateFooterTag(MiniTemplateParser.TemplateFooterTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalFooterStart}
	 * labeled alternative in {@link MiniTemplateParser#footerStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFooterStart(MiniTemplateParser.GlobalFooterStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalFooterStart}
	 * labeled alternative in {@link MiniTemplateParser#footerStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFooterStart(MiniTemplateParser.GlobalFooterStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentFooterStart}
	 * labeled alternative in {@link MiniTemplateParser#footerStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentFooterStart(MiniTemplateParser.HtmlContentFooterStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentFooterStart}
	 * labeled alternative in {@link MiniTemplateParser#footerStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentFooterStart(MiniTemplateParser.HtmlContentFooterStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateNavTag}
	 * labeled alternative in {@link MiniTemplateParser#navTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateNavTag(MiniTemplateParser.TemplateNavTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateNavTag}
	 * labeled alternative in {@link MiniTemplateParser#navTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateNavTag(MiniTemplateParser.TemplateNavTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalNavStart}
	 * labeled alternative in {@link MiniTemplateParser#navStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalNavStart(MiniTemplateParser.GlobalNavStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalNavStart}
	 * labeled alternative in {@link MiniTemplateParser#navStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalNavStart(MiniTemplateParser.GlobalNavStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentNavStart}
	 * labeled alternative in {@link MiniTemplateParser#navStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentNavStart(MiniTemplateParser.HtmlContentNavStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentNavStart}
	 * labeled alternative in {@link MiniTemplateParser#navStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentNavStart(MiniTemplateParser.HtmlContentNavStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateSectionTag}
	 * labeled alternative in {@link MiniTemplateParser#sectionTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateSectionTag(MiniTemplateParser.TemplateSectionTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateSectionTag}
	 * labeled alternative in {@link MiniTemplateParser#sectionTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateSectionTag(MiniTemplateParser.TemplateSectionTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalSectionStart}
	 * labeled alternative in {@link MiniTemplateParser#sectionStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalSectionStart(MiniTemplateParser.GlobalSectionStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalSectionStart}
	 * labeled alternative in {@link MiniTemplateParser#sectionStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalSectionStart(MiniTemplateParser.GlobalSectionStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentSectionStart}
	 * labeled alternative in {@link MiniTemplateParser#sectionStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentSectionStart(MiniTemplateParser.HtmlContentSectionStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentSectionStart}
	 * labeled alternative in {@link MiniTemplateParser#sectionStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentSectionStart(MiniTemplateParser.HtmlContentSectionStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplatePTag}
	 * labeled alternative in {@link MiniTemplateParser#pTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplatePTag(MiniTemplateParser.TemplatePTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplatePTag}
	 * labeled alternative in {@link MiniTemplateParser#pTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplatePTag(MiniTemplateParser.TemplatePTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalPStart}
	 * labeled alternative in {@link MiniTemplateParser#pStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalPStart(MiniTemplateParser.GlobalPStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalPStart}
	 * labeled alternative in {@link MiniTemplateParser#pStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalPStart(MiniTemplateParser.GlobalPStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentPStart}
	 * labeled alternative in {@link MiniTemplateParser#pStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentPStart(MiniTemplateParser.HtmlContentPStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentPStart}
	 * labeled alternative in {@link MiniTemplateParser#pStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentPStart(MiniTemplateParser.HtmlContentPStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateInputTag}
	 * labeled alternative in {@link MiniTemplateParser#inputTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateInputTag(MiniTemplateParser.TemplateInputTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateInputTag}
	 * labeled alternative in {@link MiniTemplateParser#inputTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateInputTag(MiniTemplateParser.TemplateInputTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalInputStart}
	 * labeled alternative in {@link MiniTemplateParser#inputStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalInputStart(MiniTemplateParser.GlobalInputStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalInputStart}
	 * labeled alternative in {@link MiniTemplateParser#inputStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalInputStart(MiniTemplateParser.GlobalInputStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentInputStart}
	 * labeled alternative in {@link MiniTemplateParser#inputStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentInputStart(MiniTemplateParser.HtmlContentInputStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentInputStart}
	 * labeled alternative in {@link MiniTemplateParser#inputStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentInputStart(MiniTemplateParser.HtmlContentInputStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateButtonTag}
	 * labeled alternative in {@link MiniTemplateParser#buttonTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateButtonTag(MiniTemplateParser.TemplateButtonTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateButtonTag}
	 * labeled alternative in {@link MiniTemplateParser#buttonTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateButtonTag(MiniTemplateParser.TemplateButtonTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalButtonStart}
	 * labeled alternative in {@link MiniTemplateParser#buttonStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalButtonStart(MiniTemplateParser.GlobalButtonStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalButtonStart}
	 * labeled alternative in {@link MiniTemplateParser#buttonStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalButtonStart(MiniTemplateParser.GlobalButtonStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentButtonStart}
	 * labeled alternative in {@link MiniTemplateParser#buttonStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentButtonStart(MiniTemplateParser.HtmlContentButtonStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentButtonStart}
	 * labeled alternative in {@link MiniTemplateParser#buttonStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentButtonStart(MiniTemplateParser.HtmlContentButtonStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateFormTag}
	 * labeled alternative in {@link MiniTemplateParser#formTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateFormTag(MiniTemplateParser.TemplateFormTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateFormTag}
	 * labeled alternative in {@link MiniTemplateParser#formTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateFormTag(MiniTemplateParser.TemplateFormTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalFormStart}
	 * labeled alternative in {@link MiniTemplateParser#formStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFormStart(MiniTemplateParser.GlobalFormStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalFormStart}
	 * labeled alternative in {@link MiniTemplateParser#formStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFormStart(MiniTemplateParser.GlobalFormStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentFormStart}
	 * labeled alternative in {@link MiniTemplateParser#formStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentFormStart(MiniTemplateParser.HtmlContentFormStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentFormStart}
	 * labeled alternative in {@link MiniTemplateParser#formStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentFormStart(MiniTemplateParser.HtmlContentFormStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUlTag}
	 * labeled alternative in {@link MiniTemplateParser#ulTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUlTag(MiniTemplateParser.TemplateUlTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUlTag}
	 * labeled alternative in {@link MiniTemplateParser#ulTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUlTag(MiniTemplateParser.TemplateUlTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalUlStart}
	 * labeled alternative in {@link MiniTemplateParser#ulStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalUlStart(MiniTemplateParser.GlobalUlStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalUlStart}
	 * labeled alternative in {@link MiniTemplateParser#ulStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalUlStart(MiniTemplateParser.GlobalUlStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentUlStart}
	 * labeled alternative in {@link MiniTemplateParser#ulStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentUlStart(MiniTemplateParser.HtmlContentUlStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentUlStart}
	 * labeled alternative in {@link MiniTemplateParser#ulStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentUlStart(MiniTemplateParser.HtmlContentUlStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateLiTag}
	 * labeled alternative in {@link MiniTemplateParser#liTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiTag(MiniTemplateParser.TemplateLiTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateLiTag}
	 * labeled alternative in {@link MiniTemplateParser#liTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiTag(MiniTemplateParser.TemplateLiTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalLiStart}
	 * labeled alternative in {@link MiniTemplateParser#liStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalLiStart(MiniTemplateParser.GlobalLiStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalLiStart}
	 * labeled alternative in {@link MiniTemplateParser#liStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalLiStart(MiniTemplateParser.GlobalLiStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentLiStart}
	 * labeled alternative in {@link MiniTemplateParser#liStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentLiStart(MiniTemplateParser.HtmlContentLiStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentLiStart}
	 * labeled alternative in {@link MiniTemplateParser#liStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentLiStart(MiniTemplateParser.HtmlContentLiStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateATag}
	 * labeled alternative in {@link MiniTemplateParser#aTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateATag(MiniTemplateParser.TemplateATagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateATag}
	 * labeled alternative in {@link MiniTemplateParser#aTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateATag(MiniTemplateParser.TemplateATagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalAStart}
	 * labeled alternative in {@link MiniTemplateParser#aStart}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAStart(MiniTemplateParser.GlobalAStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalAStart}
	 * labeled alternative in {@link MiniTemplateParser#aStart}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAStart(MiniTemplateParser.GlobalAStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentAStart}
	 * labeled alternative in {@link MiniTemplateParser#aStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentAStart(MiniTemplateParser.HtmlContentAStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentAStart}
	 * labeled alternative in {@link MiniTemplateParser#aStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentAStart(MiniTemplateParser.HtmlContentAStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateAttr}
	 * labeled alternative in {@link MiniTemplateParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterTemplateAttr(MiniTemplateParser.TemplateAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateAttr}
	 * labeled alternative in {@link MiniTemplateParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitTemplateAttr(MiniTemplateParser.TemplateAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateQuotedDouble}
	 * labeled alternative in {@link MiniTemplateParser#quotedValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateQuotedDouble(MiniTemplateParser.TemplateQuotedDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateQuotedDouble}
	 * labeled alternative in {@link MiniTemplateParser#quotedValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateQuotedDouble(MiniTemplateParser.TemplateQuotedDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateQuotedSingle}
	 * labeled alternative in {@link MiniTemplateParser#quotedValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateQuotedSingle(MiniTemplateParser.TemplateQuotedSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateQuotedSingle}
	 * labeled alternative in {@link MiniTemplateParser#quotedValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateQuotedSingle(MiniTemplateParser.TemplateQuotedSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateQuotedText}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 */
	void enterTemplateQuotedText(MiniTemplateParser.TemplateQuotedTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateQuotedText}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 */
	void exitTemplateQuotedText(MiniTemplateParser.TemplateQuotedTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateQuotedJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 */
	void enterTemplateQuotedJinjaVar(MiniTemplateParser.TemplateQuotedJinjaVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateQuotedJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 */
	void exitTemplateQuotedJinjaVar(MiniTemplateParser.TemplateQuotedJinjaVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateQuotedJinjaBlock}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 */
	void enterTemplateQuotedJinjaBlock(MiniTemplateParser.TemplateQuotedJinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateQuotedJinjaBlock}
	 * labeled alternative in {@link MiniTemplateParser#quotedItem}.
	 * @param ctx the parse tree
	 */
	void exitTemplateQuotedJinjaBlock(MiniTemplateParser.TemplateQuotedJinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStyleTag}
	 * labeled alternative in {@link MiniTemplateParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStyleTag(MiniTemplateParser.TemplateStyleTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStyleTag}
	 * labeled alternative in {@link MiniTemplateParser#styleTag}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStyleTag(MiniTemplateParser.TemplateStyleTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssRules}
	 * labeled alternative in {@link MiniTemplateParser#cssRules}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssRules(MiniTemplateParser.TemplateCssRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssRules}
	 * labeled alternative in {@link MiniTemplateParser#cssRules}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssRules(MiniTemplateParser.TemplateCssRulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssRule}
	 * labeled alternative in {@link MiniTemplateParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssRule(MiniTemplateParser.TemplateCssRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssRule}
	 * labeled alternative in {@link MiniTemplateParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssRule(MiniTemplateParser.TemplateCssRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssDeclarationList}
	 * labeled alternative in {@link MiniTemplateParser#cssDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssDeclarationList(MiniTemplateParser.TemplateCssDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssDeclarationList}
	 * labeled alternative in {@link MiniTemplateParser#cssDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssDeclarationList(MiniTemplateParser.TemplateCssDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssDeclaration}
	 * labeled alternative in {@link MiniTemplateParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssDeclaration(MiniTemplateParser.TemplateCssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssDeclaration}
	 * labeled alternative in {@link MiniTemplateParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssDeclaration(MiniTemplateParser.TemplateCssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssProperty}
	 * labeled alternative in {@link MiniTemplateParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssProperty(MiniTemplateParser.TemplateCssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssProperty}
	 * labeled alternative in {@link MiniTemplateParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssProperty(MiniTemplateParser.TemplateCssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssNumber}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssNumber(MiniTemplateParser.TemplateCssNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssNumber}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssNumber(MiniTemplateParser.TemplateCssNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssFunction}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssFunction(MiniTemplateParser.TemplateCssFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssFunction}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssFunction(MiniTemplateParser.TemplateCssFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssIdent}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssIdent(MiniTemplateParser.TemplateCssIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssIdent}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssIdent(MiniTemplateParser.TemplateCssIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssString}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssString(MiniTemplateParser.TemplateCssStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssString}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssString(MiniTemplateParser.TemplateCssStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssColor}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssColor(MiniTemplateParser.TemplateCssColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssColor}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssColor(MiniTemplateParser.TemplateCssColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssJinjaVar(MiniTemplateParser.TemplateCssJinjaVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssJinjaVar}
	 * labeled alternative in {@link MiniTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssJinjaVar(MiniTemplateParser.TemplateCssJinjaVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniTemplateParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssFunction(MiniTemplateParser.CssFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniTemplateParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssFunction(MiniTemplateParser.CssFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssSelectorList}
	 * labeled alternative in {@link MiniTemplateParser#cssSelectorList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssSelectorList(MiniTemplateParser.TemplateCssSelectorListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssSelectorList}
	 * labeled alternative in {@link MiniTemplateParser#cssSelectorList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssSelectorList(MiniTemplateParser.TemplateCssSelectorListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCssSelector}
	 * labeled alternative in {@link MiniTemplateParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCssSelector(MiniTemplateParser.TemplateCssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCssSelector}
	 * labeled alternative in {@link MiniTemplateParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCssSelector(MiniTemplateParser.TemplateCssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateSelectorUnit}
	 * labeled alternative in {@link MiniTemplateParser#selectorUnit}.
	 * @param ctx the parse tree
	 */
	void enterTemplateSelectorUnit(MiniTemplateParser.TemplateSelectorUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateSelectorUnit}
	 * labeled alternative in {@link MiniTemplateParser#selectorUnit}.
	 * @param ctx the parse tree
	 */
	void exitTemplateSelectorUnit(MiniTemplateParser.TemplateSelectorUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateBaseSelectorTag}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBaseSelectorTag(MiniTemplateParser.TemplateBaseSelectorTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateBaseSelectorTag}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBaseSelectorTag(MiniTemplateParser.TemplateBaseSelectorTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateBaseSelectorIdent}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBaseSelectorIdent(MiniTemplateParser.TemplateBaseSelectorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateBaseSelectorIdent}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBaseSelectorIdent(MiniTemplateParser.TemplateBaseSelectorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateBaseSelectorStar}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBaseSelectorStar(MiniTemplateParser.TemplateBaseSelectorStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateBaseSelectorStar}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBaseSelectorStar(MiniTemplateParser.TemplateBaseSelectorStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateBaseSelectorClass}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBaseSelectorClass(MiniTemplateParser.TemplateBaseSelectorClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateBaseSelectorClass}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBaseSelectorClass(MiniTemplateParser.TemplateBaseSelectorClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateBaseSelectorId}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBaseSelectorId(MiniTemplateParser.TemplateBaseSelectorIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateBaseSelectorId}
	 * labeled alternative in {@link MiniTemplateParser#baseSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBaseSelectorId(MiniTemplateParser.TemplateBaseSelectorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateClassPart}
	 * labeled alternative in {@link MiniTemplateParser#classPart}.
	 * @param ctx the parse tree
	 */
	void enterTemplateClassPart(MiniTemplateParser.TemplateClassPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateClassPart}
	 * labeled alternative in {@link MiniTemplateParser#classPart}.
	 * @param ctx the parse tree
	 */
	void exitTemplateClassPart(MiniTemplateParser.TemplateClassPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateIdPart}
	 * labeled alternative in {@link MiniTemplateParser#idPart}.
	 * @param ctx the parse tree
	 */
	void enterTemplateIdPart(MiniTemplateParser.TemplateIdPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateIdPart}
	 * labeled alternative in {@link MiniTemplateParser#idPart}.
	 * @param ctx the parse tree
	 */
	void exitTemplateIdPart(MiniTemplateParser.TemplateIdPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCombinatorGt}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCombinatorGt(MiniTemplateParser.TemplateCombinatorGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCombinatorGt}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCombinatorGt(MiniTemplateParser.TemplateCombinatorGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCombinatorPlus}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCombinatorPlus(MiniTemplateParser.TemplateCombinatorPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCombinatorPlus}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCombinatorPlus(MiniTemplateParser.TemplateCombinatorPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCombinatorGenSib}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCombinatorGenSib(MiniTemplateParser.TemplateCombinatorGenSibContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCombinatorGenSib}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCombinatorGenSib(MiniTemplateParser.TemplateCombinatorGenSibContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateCombinatorNone}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterTemplateCombinatorNone(MiniTemplateParser.TemplateCombinatorNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateCombinatorNone}
	 * labeled alternative in {@link MiniTemplateParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitTemplateCombinatorNone(MiniTemplateParser.TemplateCombinatorNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoClassNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassNode(MiniTemplateParser.PseudoClassNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoClassNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassNode(MiniTemplateParser.PseudoClassNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoArgsNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoArgs}.
	 * @param ctx the parse tree
	 */
	void enterPseudoArgsNode(MiniTemplateParser.PseudoArgsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoArgsNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoArgs}.
	 * @param ctx the parse tree
	 */
	void exitPseudoArgsNode(MiniTemplateParser.PseudoArgsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PseudoExprNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExpr}.
	 * @param ctx the parse tree
	 */
	void enterPseudoExprNode(MiniTemplateParser.PseudoExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PseudoExprNode}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExpr}.
	 * @param ctx the parse tree
	 */
	void exitPseudoExprNode(MiniTemplateParser.PseudoExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomIdent(MiniTemplateParser.AtomIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomIdent(MiniTemplateParser.AtomIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(MiniTemplateParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(MiniTemplateParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomString(MiniTemplateParser.AtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomString(MiniTemplateParser.AtomStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomDotIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomDotIdent(MiniTemplateParser.AtomDotIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomDotIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomDotIdent(MiniTemplateParser.AtomDotIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomColonIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomColonIdent(MiniTemplateParser.AtomColonIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomColonIdent}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomColonIdent(MiniTemplateParser.AtomColonIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomParenExpr}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomParenExpr(MiniTemplateParser.AtomParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomParenExpr}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomParenExpr(MiniTemplateParser.AtomParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomComma}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomComma(MiniTemplateParser.AtomCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomComma}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomComma(MiniTemplateParser.AtomCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomPlus}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomPlus(MiniTemplateParser.AtomPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomPlus}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomPlus(MiniTemplateParser.AtomPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomMinus}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomMinus(MiniTemplateParser.AtomMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomMinus}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomMinus(MiniTemplateParser.AtomMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomStar}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomStar(MiniTemplateParser.AtomStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomStar}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomStar(MiniTemplateParser.AtomStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomGt}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomGt(MiniTemplateParser.AtomGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomGt}
	 * labeled alternative in {@link MiniTemplateParser#pseudoExprAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomGt(MiniTemplateParser.AtomGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplatePseudoElementExpr}
	 * labeled alternative in {@link MiniTemplateParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplatePseudoElementExpr(MiniTemplateParser.TemplatePseudoElementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplatePseudoElementExpr}
	 * labeled alternative in {@link MiniTemplateParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplatePseudoElementExpr(MiniTemplateParser.TemplatePseudoElementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaVarExpr}
	 * labeled alternative in {@link MiniTemplateParser#jinjaVar}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaVarExpr(MiniTemplateParser.TemplateJinjaVarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaVarExpr}
	 * labeled alternative in {@link MiniTemplateParser#jinjaVar}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaVarExpr(MiniTemplateParser.TemplateJinjaVarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVarStart(MiniTemplateParser.JinjaVarStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVarStart(MiniTemplateParser.JinjaVarStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaHtmlVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaHtmlVarStart(MiniTemplateParser.JinjaHtmlVarStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaHtmlVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaHtmlVarStart(MiniTemplateParser.JinjaHtmlVarStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaHtmlAttrVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaHtmlAttrVarStart(MiniTemplateParser.JinjaHtmlAttrVarStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaHtmlAttrVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaHtmlAttrVarStart(MiniTemplateParser.JinjaHtmlAttrVarStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaHtmlAttrValueVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaHtmlAttrValueVarStart(MiniTemplateParser.JinjaHtmlAttrValueVarStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaHtmlAttrValueVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaHtmlAttrValueVarStart(MiniTemplateParser.JinjaHtmlAttrValueVarStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCssValueVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCssValueVarStart(MiniTemplateParser.JinjaCssValueVarStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCssValueVarStart}
	 * labeled alternative in {@link MiniTemplateParser#varStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCssValueVarStart(MiniTemplateParser.JinjaCssValueVarStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaForBlock}
	 * labeled alternative in {@link MiniTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaForBlock(MiniTemplateParser.TemplateJinjaForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaForBlock}
	 * labeled alternative in {@link MiniTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaForBlock(MiniTemplateParser.TemplateJinjaForBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaIfBlock}
	 * labeled alternative in {@link MiniTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaIfBlock(MiniTemplateParser.TemplateJinjaIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaIfBlock}
	 * labeled alternative in {@link MiniTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaIfBlock(MiniTemplateParser.TemplateJinjaIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaFor}
	 * labeled alternative in {@link MiniTemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaFor(MiniTemplateParser.TemplateJinjaForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaFor}
	 * labeled alternative in {@link MiniTemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaFor(MiniTemplateParser.TemplateJinjaForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaIf}
	 * labeled alternative in {@link MiniTemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaIf(MiniTemplateParser.TemplateJinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaIf}
	 * labeled alternative in {@link MiniTemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaIf(MiniTemplateParser.TemplateJinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockStart(MiniTemplateParser.JinjaBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockStart(MiniTemplateParser.JinjaBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaHtmlBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaHtmlBlockStart(MiniTemplateParser.JinjaHtmlBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaHtmlBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaHtmlBlockStart(MiniTemplateParser.JinjaHtmlBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaHtmlAttrBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaHtmlAttrBlockStart(MiniTemplateParser.JinjaHtmlAttrBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaHtmlAttrBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaHtmlAttrBlockStart(MiniTemplateParser.JinjaHtmlAttrBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaHtmlAttrValueBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void enterJinjaHtmlAttrValueBlockStart(MiniTemplateParser.JinjaHtmlAttrValueBlockStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaHtmlAttrValueBlockStart}
	 * labeled alternative in {@link MiniTemplateParser#blockStart}.
	 * @param ctx the parse tree
	 */
	void exitJinjaHtmlAttrValueBlockStart(MiniTemplateParser.JinjaHtmlAttrValueBlockStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskEqualityExpr}
	 * labeled alternative in {@link MiniTemplateParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFlaskEqualityExpr(MiniTemplateParser.FlaskEqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskEqualityExpr}
	 * labeled alternative in {@link MiniTemplateParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFlaskEqualityExpr(MiniTemplateParser.FlaskEqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAdditiveExpr}
	 * labeled alternative in {@link MiniTemplateParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAdditiveExpr(MiniTemplateParser.FlaskAdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAdditiveExpr}
	 * labeled alternative in {@link MiniTemplateParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAdditiveExpr(MiniTemplateParser.FlaskAdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskPrimaryExpr}
	 * labeled alternative in {@link MiniTemplateParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFlaskPrimaryExpr(MiniTemplateParser.FlaskPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskPrimaryExpr}
	 * labeled alternative in {@link MiniTemplateParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFlaskPrimaryExpr(MiniTemplateParser.FlaskPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAttrAccess}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAttrAccess(MiniTemplateParser.FlaskAttrAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAttrAccess}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAttrAccess(MiniTemplateParser.FlaskAttrAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskIndexing}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterFlaskIndexing(MiniTemplateParser.FlaskIndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskIndexing}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitFlaskIndexing(MiniTemplateParser.FlaskIndexingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskCallSuffix}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterFlaskCallSuffix(MiniTemplateParser.FlaskCallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskCallSuffix}
	 * labeled alternative in {@link MiniTemplateParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitFlaskCallSuffix(MiniTemplateParser.FlaskCallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskArgsList}
	 * labeled alternative in {@link MiniTemplateParser#routeArgKws}.
	 * @param ctx the parse tree
	 */
	void enterFlaskArgsList(MiniTemplateParser.FlaskArgsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskArgsList}
	 * labeled alternative in {@link MiniTemplateParser#routeArgKws}.
	 * @param ctx the parse tree
	 */
	void exitFlaskArgsList(MiniTemplateParser.FlaskArgsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskKwArg}
	 * labeled alternative in {@link MiniTemplateParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterFlaskKwArg(MiniTemplateParser.FlaskKwArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskKwArg}
	 * labeled alternative in {@link MiniTemplateParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitFlaskKwArg(MiniTemplateParser.FlaskKwArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskPosArg}
	 * labeled alternative in {@link MiniTemplateParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterFlaskPosArg(MiniTemplateParser.FlaskPosArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskPosArg}
	 * labeled alternative in {@link MiniTemplateParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitFlaskPosArg(MiniTemplateParser.FlaskPosArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomName}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomName(MiniTemplateParser.FlaskAtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomName}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomName(MiniTemplateParser.FlaskAtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomString}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomString(MiniTemplateParser.FlaskAtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomString}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomString(MiniTemplateParser.FlaskAtomStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomNumber}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomNumber(MiniTemplateParser.FlaskAtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomNumber}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomNumber(MiniTemplateParser.FlaskAtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlskAtomApp}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlskAtomApp(MiniTemplateParser.FlskAtomAppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlskAtomApp}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlskAtomApp(MiniTemplateParser.FlskAtomAppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomNone}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomNone(MiniTemplateParser.FlaskAtomNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomNone}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomNone(MiniTemplateParser.FlaskAtomNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomTrue}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomTrue(MiniTemplateParser.FlaskAtomTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomTrue}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomTrue(MiniTemplateParser.FlaskAtomTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomFalse}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomFalse(MiniTemplateParser.FlaskAtomFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomFalse}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomFalse(MiniTemplateParser.FlaskAtomFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomList}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomList(MiniTemplateParser.FlaskAtomListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomList}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomList(MiniTemplateParser.FlaskAtomListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomDict}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomDict(MiniTemplateParser.FlaskAtomDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomDict}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomDict(MiniTemplateParser.FlaskAtomDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomGenExpr}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomGenExpr(MiniTemplateParser.FlaskAtomGenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomGenExpr}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomGenExpr(MiniTemplateParser.FlaskAtomGenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskAtomParen}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFlaskAtomParen(MiniTemplateParser.FlaskAtomParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskAtomParen}
	 * labeled alternative in {@link MiniTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFlaskAtomParen(MiniTemplateParser.FlaskAtomParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskListLiteral}
	 * labeled alternative in {@link MiniTemplateParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFlaskListLiteral(MiniTemplateParser.FlaskListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskListLiteral}
	 * labeled alternative in {@link MiniTemplateParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFlaskListLiteral(MiniTemplateParser.FlaskListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskDictLiteral}
	 * labeled alternative in {@link MiniTemplateParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFlaskDictLiteral(MiniTemplateParser.FlaskDictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskDictLiteral}
	 * labeled alternative in {@link MiniTemplateParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFlaskDictLiteral(MiniTemplateParser.FlaskDictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskDictPair}
	 * labeled alternative in {@link MiniTemplateParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterFlaskDictPair(MiniTemplateParser.FlaskDictPairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskDictPair}
	 * labeled alternative in {@link MiniTemplateParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitFlaskDictPair(MiniTemplateParser.FlaskDictPairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskGeneratorExpr}
	 * labeled alternative in {@link MiniTemplateParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void enterFlaskGeneratorExpr(MiniTemplateParser.FlaskGeneratorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskGeneratorExpr}
	 * labeled alternative in {@link MiniTemplateParser#genExpr}.
	 * @param ctx the parse tree
	 */
	void exitFlaskGeneratorExpr(MiniTemplateParser.FlaskGeneratorExprContext ctx);
}