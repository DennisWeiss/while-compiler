// Generated from WHILE.g4 by ANTLR 4.7.2
package com.weissdennis.whilecompiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WHILEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WHILEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCommand}
	 * labeled alternative in {@link WHILEParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCommand(WHILEParser.SingleCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleCommands}
	 * labeled alternative in {@link WHILEParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleCommands(WHILEParser.MultipleCommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(WHILEParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(WHILEParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(WHILEParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link WHILEParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(WHILEParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link WHILEParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(WHILEParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiDigitNumber}
	 * labeled alternative in {@link WHILEParser#naturalNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDigitNumber(WHILEParser.MultiDigitNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDigitNumber}
	 * labeled alternative in {@link WHILEParser#naturalNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDigitNumber(WHILEParser.SingleDigitNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiDigitNumberWithLeadingZeros}
	 * labeled alternative in {@link WHILEParser#naturalNumberWithLeadingZeros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDigitNumberWithLeadingZeros(WHILEParser.MultiDigitNumberWithLeadingZerosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDigitNumberWithLeadingZeros}
	 * labeled alternative in {@link WHILEParser#naturalNumberWithLeadingZeros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDigitNumberWithLeadingZeros(WHILEParser.SingleDigitNumberWithLeadingZerosContext ctx);
	/**
	 * Visit a parse tree produced by {@link WHILEParser#digitWithoutZero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitWithoutZero(WHILEParser.DigitWithoutZeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitWithoutZeroLabel}
	 * labeled alternative in {@link WHILEParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitWithoutZeroLabel(WHILEParser.DigitWithoutZeroLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zero}
	 * labeled alternative in {@link WHILEParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZero(WHILEParser.ZeroContext ctx);
}