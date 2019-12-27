// Generated from WHILE.g4 by ANTLR 4.7.2
package com.weissdennis.whilecompiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WHILEParser}.
 */
public interface WHILEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleCommand}
	 * labeled alternative in {@link WHILEParser#p}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(WHILEParser.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleCommand}
	 * labeled alternative in {@link WHILEParser#p}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(WHILEParser.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleCommands}
	 * labeled alternative in {@link WHILEParser#p}.
	 * @param ctx the parse tree
	 */
	void enterMultipleCommands(WHILEParser.MultipleCommandsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleCommands}
	 * labeled alternative in {@link WHILEParser#p}.
	 * @param ctx the parse tree
	 */
	void exitMultipleCommands(WHILEParser.MultipleCommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAddition(WHILEParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAddition(WHILEParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(WHILEParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(WHILEParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void enterLoop(WHILEParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void exitLoop(WHILEParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhile(WHILEParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhile(WHILEParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link WHILEParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(WHILEParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(WHILEParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiDigitNumber}
	 * labeled alternative in {@link WHILEParser#naturalNumber}.
	 * @param ctx the parse tree
	 */
	void enterMultiDigitNumber(WHILEParser.MultiDigitNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiDigitNumber}
	 * labeled alternative in {@link WHILEParser#naturalNumber}.
	 * @param ctx the parse tree
	 */
	void exitMultiDigitNumber(WHILEParser.MultiDigitNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDigitNumber}
	 * labeled alternative in {@link WHILEParser#naturalNumber}.
	 * @param ctx the parse tree
	 */
	void enterSingleDigitNumber(WHILEParser.SingleDigitNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDigitNumber}
	 * labeled alternative in {@link WHILEParser#naturalNumber}.
	 * @param ctx the parse tree
	 */
	void exitSingleDigitNumber(WHILEParser.SingleDigitNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiDigitNumberWithLeadingZeros}
	 * labeled alternative in {@link WHILEParser#naturalNumberWithLeadingZeros}.
	 * @param ctx the parse tree
	 */
	void enterMultiDigitNumberWithLeadingZeros(WHILEParser.MultiDigitNumberWithLeadingZerosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiDigitNumberWithLeadingZeros}
	 * labeled alternative in {@link WHILEParser#naturalNumberWithLeadingZeros}.
	 * @param ctx the parse tree
	 */
	void exitMultiDigitNumberWithLeadingZeros(WHILEParser.MultiDigitNumberWithLeadingZerosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDigitNumberWithLeadingZeros}
	 * labeled alternative in {@link WHILEParser#naturalNumberWithLeadingZeros}.
	 * @param ctx the parse tree
	 */
	void enterSingleDigitNumberWithLeadingZeros(WHILEParser.SingleDigitNumberWithLeadingZerosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDigitNumberWithLeadingZeros}
	 * labeled alternative in {@link WHILEParser#naturalNumberWithLeadingZeros}.
	 * @param ctx the parse tree
	 */
	void exitSingleDigitNumberWithLeadingZeros(WHILEParser.SingleDigitNumberWithLeadingZerosContext ctx);
	/**
	 * Enter a parse tree produced by {@link WHILEParser#digitWithoutZero}.
	 * @param ctx the parse tree
	 */
	void enterDigitWithoutZero(WHILEParser.DigitWithoutZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#digitWithoutZero}.
	 * @param ctx the parse tree
	 */
	void exitDigitWithoutZero(WHILEParser.DigitWithoutZeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitWithoutZeroLabel}
	 * labeled alternative in {@link WHILEParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigitWithoutZeroLabel(WHILEParser.DigitWithoutZeroLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitWithoutZeroLabel}
	 * labeled alternative in {@link WHILEParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigitWithoutZeroLabel(WHILEParser.DigitWithoutZeroLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zero}
	 * labeled alternative in {@link WHILEParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterZero(WHILEParser.ZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zero}
	 * labeled alternative in {@link WHILEParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitZero(WHILEParser.ZeroContext ctx);
}