// Generated from c:/Users/corte/OneDrive/Escritorio/Analizador/Reglas.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReglasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, WS=17, 
		DIGITO=18, LETRA=19;
	public static final int
		RULE_dsl = 0, RULE_regla = 1, RULE_condicion = 2, RULE_accesoNoAutorizado = 3, 
		RULE_multiplesIntentosFallidos = 4, RULE_actividadSospechosa = 5, RULE_comando = 6, 
		RULE_accion = 7, RULE_identificador = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"dsl", "regla", "condicion", "accesoNoAutorizado", "multiplesIntentosFallidos", 
			"actividadSospechosa", "comando", "accion", "identificador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'regla'", "'{'", "'cuando'", "'entonces'", "'}'", "'intentoAccesoFueraHorario'", 
			"'intentosFallidos'", "'>'", "'accesoARecursosSensibles'", "'y'", "'noEsAdministrador'", 
			"'agregarUsuarioAListaNegra'", "'agregarIPAListaNegra'", "'activarMonitoreoDetallado'", 
			"'accion'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WS", "DIGITO", "LETRA"
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
	public String getGrammarFileName() { return "Reglas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReglasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DslContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReglasParser.EOF, 0); }
		public List<ReglaContext> regla() {
			return getRuleContexts(ReglaContext.class);
		}
		public ReglaContext regla(int i) {
			return getRuleContext(ReglaContext.class,i);
		}
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public DslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterDsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitDsl(this);
		}
	}

	public final DslContext dsl() throws RecognitionException {
		DslContext _localctx = new DslContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dsl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				regla();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				accion();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			setState(28);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReglaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitRegla(this);
		}
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			identificador();
			setState(32);
			match(T__1);
			setState(33);
			match(T__2);
			setState(34);
			condicion();
			setState(35);
			match(T__3);
			setState(36);
			comando();
			setState(37);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public AccesoNoAutorizadoContext accesoNoAutorizado() {
			return getRuleContext(AccesoNoAutorizadoContext.class,0);
		}
		public MultiplesIntentosFallidosContext multiplesIntentosFallidos() {
			return getRuleContext(MultiplesIntentosFallidosContext.class,0);
		}
		public ActividadSospechosaContext actividadSospechosa() {
			return getRuleContext(ActividadSospechosaContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicion);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				accesoNoAutorizado();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				multiplesIntentosFallidos();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				actividadSospechosa();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoNoAutorizadoContext extends ParserRuleContext {
		public AccesoNoAutorizadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoNoAutorizado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterAccesoNoAutorizado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitAccesoNoAutorizado(this);
		}
	}

	public final AccesoNoAutorizadoContext accesoNoAutorizado() throws RecognitionException {
		AccesoNoAutorizadoContext _localctx = new AccesoNoAutorizadoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_accesoNoAutorizado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplesIntentosFallidosContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(ReglasParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(ReglasParser.DIGITO, i);
		}
		public MultiplesIntentosFallidosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplesIntentosFallidos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterMultiplesIntentosFallidos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitMultiplesIntentosFallidos(this);
		}
	}

	public final MultiplesIntentosFallidosContext multiplesIntentosFallidos() throws RecognitionException {
		MultiplesIntentosFallidosContext _localctx = new MultiplesIntentosFallidosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiplesIntentosFallidos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__6);
			setState(47);
			match(T__7);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(DIGITO);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActividadSospechosaContext extends ParserRuleContext {
		public ActividadSospechosaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actividadSospechosa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterActividadSospechosa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitActividadSospechosa(this);
		}
	}

	public final ActividadSospechosaContext actividadSospechosa() throws RecognitionException {
		ActividadSospechosaContext _localctx = new ActividadSospechosaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_actividadSospechosa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__8);
			setState(54);
			match(T__9);
			setState(55);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitAccion(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_accion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__14);
			setState(60);
			match(T__15);
			setState(61);
			identificador();
			setState(62);
			match(T__15);
			setState(63);
			match(T__1);
			setState(64);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(ReglasParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(ReglasParser.LETRA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(ReglasParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(ReglasParser.DIGITO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReglasListener ) ((ReglasListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(LETRA);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGITO || _la==LETRA) {
				{
				{
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==DIGITO || _la==LETRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013J\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0004\u0000\u0019\b\u0000\u000b\u0000\f\u0000\u001a\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u00042\b\u0004\u000b\u0004\f\u0004"+
		"3\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0005\bE\b\b\n\b\f\bH\t\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000\f"+
		"\u000e\u0001\u0000\u0012\u0013F\u0000\u0013\u0001\u0000\u0000\u0000\u0002"+
		"\u001e\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006,\u0001"+
		"\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000"+
		"\f9\u0001\u0000\u0000\u0000\u000e;\u0001\u0000\u0000\u0000\u0010B\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001"+
		"\u0000\u0000\u0000\u0017\u0019\u0003\u000e\u0007\u0000\u0018\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003\u0010"+
		"\b\u0000 !\u0005\u0002\u0000\u0000!\"\u0005\u0003\u0000\u0000\"#\u0003"+
		"\u0004\u0002\u0000#$\u0005\u0004\u0000\u0000$%\u0003\f\u0006\u0000%&\u0005"+
		"\u0005\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'+\u0003\u0006\u0003"+
		"\u0000(+\u0003\b\u0004\u0000)+\u0003\n\u0005\u0000*\'\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0005\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0006\u0000\u0000-\u0007\u0001\u0000\u0000"+
		"\u0000./\u0005\u0007\u0000\u0000/1\u0005\b\u0000\u000002\u0005\u0012\u0000"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004\t\u0001\u0000\u0000\u000056\u0005"+
		"\t\u0000\u000067\u0005\n\u0000\u000078\u0005\u000b\u0000\u00008\u000b"+
		"\u0001\u0000\u0000\u00009:\u0007\u0000\u0000\u0000:\r\u0001\u0000\u0000"+
		"\u0000;<\u0005\u000f\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0003\u0010"+
		"\b\u0000>?\u0005\u0010\u0000\u0000?@\u0005\u0002\u0000\u0000@A\u0005\u0005"+
		"\u0000\u0000A\u000f\u0001\u0000\u0000\u0000BF\u0005\u0013\u0000\u0000"+
		"CE\u0007\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0011\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000\u0005\u0015\u001a*3F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}