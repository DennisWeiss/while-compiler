// Generated from WHILE.g4 by ANTLR 4.7.2
package com.weissdennis.whilecompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WHILEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WS=21;
	public static final int
		RULE_program = 0, RULE_p = 1, RULE_command = 2, RULE_var = 3, RULE_naturalNumber = 4, 
		RULE_naturalNumberWithLeadingZeros = 5, RULE_digitWithoutZero = 6, RULE_digit = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "p", "command", "var", "naturalNumber", "naturalNumberWithLeadingZeros", 
			"digitWithoutZero", "digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'+'", "'-'", "'LOOP'", "'DO'", "'END'", "'WHILE'", 
			"'!='", "'0'", "'x_'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", 
			"'8'", "'9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WHILE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WHILEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WHILEParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			p();
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PContext extends ParserRuleContext {
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
	 
		public PContext() { }
		public void copyFrom(PContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleCommandsContext extends PContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public MultipleCommandsContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterMultipleCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitMultipleCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitMultipleCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCommandContext extends PContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleCommandContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitSingleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_p);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				command();
				}
				break;
			case 2:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				command();
				setState(21);
				match(T__0);
				setState(22);
				p();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopContext extends CommandContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public LoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends CommandContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public NaturalNumberContext naturalNumber() {
			return getRuleContext(NaturalNumberContext.class,0);
		}
		public SubtractionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends CommandContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public WhileContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends CommandContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public NaturalNumberContext naturalNumber() {
			return getRuleContext(NaturalNumberContext.class,0);
		}
		public AdditionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				var();
				setState(27);
				match(T__1);
				setState(28);
				var();
				setState(29);
				match(T__2);
				setState(30);
				naturalNumber();
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				var();
				setState(33);
				match(T__1);
				setState(34);
				var();
				setState(35);
				match(T__3);
				setState(36);
				naturalNumber();
				}
				break;
			case 3:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__4);
				setState(39);
				var();
				setState(40);
				match(T__5);
				setState(41);
				p();
				setState(42);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__7);
				setState(45);
				var();
				setState(46);
				match(T__8);
				setState(47);
				match(T__9);
				setState(48);
				match(T__5);
				setState(49);
				p();
				setState(50);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public NaturalNumberContext naturalNumber() {
			return getRuleContext(NaturalNumberContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__10);
			setState(55);
			naturalNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NaturalNumberContext extends ParserRuleContext {
		public NaturalNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalNumber; }
	 
		public NaturalNumberContext() { }
		public void copyFrom(NaturalNumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleDigitNumberContext extends NaturalNumberContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public SingleDigitNumberContext(NaturalNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterSingleDigitNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitSingleDigitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitSingleDigitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiDigitNumberContext extends NaturalNumberContext {
		public DigitWithoutZeroContext digitWithoutZero() {
			return getRuleContext(DigitWithoutZeroContext.class,0);
		}
		public NaturalNumberWithLeadingZerosContext naturalNumberWithLeadingZeros() {
			return getRuleContext(NaturalNumberWithLeadingZerosContext.class,0);
		}
		public MultiDigitNumberContext(NaturalNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterMultiDigitNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitMultiDigitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitMultiDigitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalNumberContext naturalNumber() throws RecognitionException {
		NaturalNumberContext _localctx = new NaturalNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_naturalNumber);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MultiDigitNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				digitWithoutZero();
				setState(58);
				naturalNumberWithLeadingZeros();
				}
				break;
			case 2:
				_localctx = new SingleDigitNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				digit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NaturalNumberWithLeadingZerosContext extends ParserRuleContext {
		public NaturalNumberWithLeadingZerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalNumberWithLeadingZeros; }
	 
		public NaturalNumberWithLeadingZerosContext() { }
		public void copyFrom(NaturalNumberWithLeadingZerosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiDigitNumberWithLeadingZerosContext extends NaturalNumberWithLeadingZerosContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public NaturalNumberWithLeadingZerosContext naturalNumberWithLeadingZeros() {
			return getRuleContext(NaturalNumberWithLeadingZerosContext.class,0);
		}
		public MultiDigitNumberWithLeadingZerosContext(NaturalNumberWithLeadingZerosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterMultiDigitNumberWithLeadingZeros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitMultiDigitNumberWithLeadingZeros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitMultiDigitNumberWithLeadingZeros(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleDigitNumberWithLeadingZerosContext extends NaturalNumberWithLeadingZerosContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public SingleDigitNumberWithLeadingZerosContext(NaturalNumberWithLeadingZerosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterSingleDigitNumberWithLeadingZeros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitSingleDigitNumberWithLeadingZeros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitSingleDigitNumberWithLeadingZeros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturalNumberWithLeadingZerosContext naturalNumberWithLeadingZeros() throws RecognitionException {
		NaturalNumberWithLeadingZerosContext _localctx = new NaturalNumberWithLeadingZerosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_naturalNumberWithLeadingZeros);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new MultiDigitNumberWithLeadingZerosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				digit();
				setState(64);
				naturalNumberWithLeadingZeros();
				}
				break;
			case 2:
				_localctx = new SingleDigitNumberWithLeadingZerosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				digit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitWithoutZeroContext extends ParserRuleContext {
		public DigitWithoutZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitWithoutZero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterDigitWithoutZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitDigitWithoutZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitDigitWithoutZero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitWithoutZeroContext digitWithoutZero() throws RecognitionException {
		DigitWithoutZeroContext _localctx = new DigitWithoutZeroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_digitWithoutZero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	 
		public DigitContext() { }
		public void copyFrom(DigitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZeroContext extends DigitContext {
		public ZeroContext(DigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitZero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitWithoutZeroLabelContext extends DigitContext {
		public DigitWithoutZeroContext digitWithoutZero() {
			return getRuleContext(DigitWithoutZeroContext.class,0);
		}
		public DigitWithoutZeroLabelContext(DigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterDigitWithoutZeroLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitDigitWithoutZeroLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WHILEVisitor ) return ((WHILEVisitor<? extends T>)visitor).visitDigitWithoutZeroLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_digit);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				_localctx = new DigitWithoutZeroLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				digitWithoutZero();
				}
				break;
			case T__9:
				_localctx = new ZeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\67\n\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\5\7F\n\7\3\b\3\b"+
		"\3\t\3\t\5\tL\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\16\26\2L\2\22\3"+
		"\2\2\2\4\32\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n?\3\2\2\2\fE\3\2\2\2\16G"+
		"\3\2\2\2\20K\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\33\5"+
		"\6\4\2\26\27\5\6\4\2\27\30\7\3\2\2\30\31\5\4\3\2\31\33\3\2\2\2\32\25\3"+
		"\2\2\2\32\26\3\2\2\2\33\5\3\2\2\2\34\35\5\b\5\2\35\36\7\4\2\2\36\37\5"+
		"\b\5\2\37 \7\5\2\2 !\5\n\6\2!\67\3\2\2\2\"#\5\b\5\2#$\7\4\2\2$%\5\b\5"+
		"\2%&\7\6\2\2&\'\5\n\6\2\'\67\3\2\2\2()\7\7\2\2)*\5\b\5\2*+\7\b\2\2+,\5"+
		"\4\3\2,-\7\t\2\2-\67\3\2\2\2./\7\n\2\2/\60\5\b\5\2\60\61\7\13\2\2\61\62"+
		"\7\f\2\2\62\63\7\b\2\2\63\64\5\4\3\2\64\65\7\t\2\2\65\67\3\2\2\2\66\34"+
		"\3\2\2\2\66\"\3\2\2\2\66(\3\2\2\2\66.\3\2\2\2\67\7\3\2\2\289\7\r\2\29"+
		":\5\n\6\2:\t\3\2\2\2;<\5\16\b\2<=\5\f\7\2=@\3\2\2\2>@\5\20\t\2?;\3\2\2"+
		"\2?>\3\2\2\2@\13\3\2\2\2AB\5\20\t\2BC\5\f\7\2CF\3\2\2\2DF\5\20\t\2EA\3"+
		"\2\2\2ED\3\2\2\2F\r\3\2\2\2GH\t\2\2\2H\17\3\2\2\2IL\5\16\b\2JL\7\f\2\2"+
		"KI\3\2\2\2KJ\3\2\2\2L\21\3\2\2\2\7\32\66?EK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}