// Generated from c:/Users/corte/OneDrive/Escritorio/Analizador/Reglas.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import ReglasListener from './ReglasListener.js';
import ReglasVisitor from './ReglasVisitor.js';

const serializedATN = [4,1,19,74,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,1,0,4,0,20,8,0,11,0,12,0,21,1,0,4,0,25,8,
0,11,0,12,0,26,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,3,
2,43,8,2,1,3,1,3,1,4,1,4,1,4,4,4,50,8,4,11,4,12,4,51,1,5,1,5,1,5,1,5,1,6,
1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,5,8,69,8,8,10,8,12,8,72,9,8,1,8,
0,0,9,0,2,4,6,8,10,12,14,16,0,2,1,0,12,14,1,0,18,19,70,0,19,1,0,0,0,2,30,
1,0,0,0,4,42,1,0,0,0,6,44,1,0,0,0,8,46,1,0,0,0,10,53,1,0,0,0,12,57,1,0,0,
0,14,59,1,0,0,0,16,66,1,0,0,0,18,20,3,2,1,0,19,18,1,0,0,0,20,21,1,0,0,0,
21,19,1,0,0,0,21,22,1,0,0,0,22,24,1,0,0,0,23,25,3,14,7,0,24,23,1,0,0,0,25,
26,1,0,0,0,26,24,1,0,0,0,26,27,1,0,0,0,27,28,1,0,0,0,28,29,5,0,0,1,29,1,
1,0,0,0,30,31,5,1,0,0,31,32,3,16,8,0,32,33,5,2,0,0,33,34,5,3,0,0,34,35,3,
4,2,0,35,36,5,4,0,0,36,37,3,12,6,0,37,38,5,5,0,0,38,3,1,0,0,0,39,43,3,6,
3,0,40,43,3,8,4,0,41,43,3,10,5,0,42,39,1,0,0,0,42,40,1,0,0,0,42,41,1,0,0,
0,43,5,1,0,0,0,44,45,5,6,0,0,45,7,1,0,0,0,46,47,5,7,0,0,47,49,5,8,0,0,48,
50,5,18,0,0,49,48,1,0,0,0,50,51,1,0,0,0,51,49,1,0,0,0,51,52,1,0,0,0,52,9,
1,0,0,0,53,54,5,9,0,0,54,55,5,10,0,0,55,56,5,11,0,0,56,11,1,0,0,0,57,58,
7,0,0,0,58,13,1,0,0,0,59,60,5,15,0,0,60,61,5,16,0,0,61,62,3,16,8,0,62,63,
5,16,0,0,63,64,5,2,0,0,64,65,5,5,0,0,65,15,1,0,0,0,66,70,5,19,0,0,67,69,
7,1,0,0,68,67,1,0,0,0,69,72,1,0,0,0,70,68,1,0,0,0,70,71,1,0,0,0,71,17,1,
0,0,0,72,70,1,0,0,0,5,21,26,42,51,70];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class ReglasParser extends antlr4.Parser {

    static grammarFileName = "Reglas.g4";
    static literalNames = [ null, "'regla'", "'{'", "'cuando'", "'entonces'", 
                            "'}'", "'intentoAccesoFueraHorario'", "'intentosFallidos'", 
                            "'>'", "'accesoARecursosSensibles'", "'y'", 
                            "'noEsAdministrador'", "'agregarUsuarioAListaNegra'", 
                            "'agregarIPAListaNegra'", "'activarMonitoreoDetallado'", 
                            "'accion'", "'''" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, null, null, 
                             null, "WS", "DIGITO", "LETRA" ];
    static ruleNames = [ "dsl", "regla", "condicion", "accesoNoAutorizado", 
                         "multiplesIntentosFallidos", "actividadSospechosa", 
                         "comando", "accion", "identificador" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = ReglasParser.ruleNames;
        this.literalNames = ReglasParser.literalNames;
        this.symbolicNames = ReglasParser.symbolicNames;
    }



	dsl() {
	    let localctx = new DslContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, ReglasParser.RULE_dsl);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 18;
	            this.regla();
	            this.state = 21; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	        this.state = 24; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 23;
	            this.accion();
	            this.state = 26; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===15);
	        this.state = 28;
	        this.match(ReglasParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	regla() {
	    let localctx = new ReglaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, ReglasParser.RULE_regla);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 30;
	        this.match(ReglasParser.T__0);
	        this.state = 31;
	        this.identificador();
	        this.state = 32;
	        this.match(ReglasParser.T__1);
	        this.state = 33;
	        this.match(ReglasParser.T__2);
	        this.state = 34;
	        this.condicion();
	        this.state = 35;
	        this.match(ReglasParser.T__3);
	        this.state = 36;
	        this.comando();
	        this.state = 37;
	        this.match(ReglasParser.T__4);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, ReglasParser.RULE_condicion);
	    try {
	        this.state = 42;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 6:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 39;
	            this.accesoNoAutorizado();
	            break;
	        case 7:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 40;
	            this.multiplesIntentosFallidos();
	            break;
	        case 9:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 41;
	            this.actividadSospechosa();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	accesoNoAutorizado() {
	    let localctx = new AccesoNoAutorizadoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, ReglasParser.RULE_accesoNoAutorizado);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 44;
	        this.match(ReglasParser.T__5);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	multiplesIntentosFallidos() {
	    let localctx = new MultiplesIntentosFallidosContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, ReglasParser.RULE_multiplesIntentosFallidos);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 46;
	        this.match(ReglasParser.T__6);
	        this.state = 47;
	        this.match(ReglasParser.T__7);
	        this.state = 49; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 48;
	            this.match(ReglasParser.DIGITO);
	            this.state = 51; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===18);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	actividadSospechosa() {
	    let localctx = new ActividadSospechosaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, ReglasParser.RULE_actividadSospechosa);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 53;
	        this.match(ReglasParser.T__8);
	        this.state = 54;
	        this.match(ReglasParser.T__9);
	        this.state = 55;
	        this.match(ReglasParser.T__10);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	comando() {
	    let localctx = new ComandoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, ReglasParser.RULE_comando);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 57;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 28672) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	accion() {
	    let localctx = new AccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, ReglasParser.RULE_accion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 59;
	        this.match(ReglasParser.T__14);
	        this.state = 60;
	        this.match(ReglasParser.T__15);
	        this.state = 61;
	        this.identificador();
	        this.state = 62;
	        this.match(ReglasParser.T__15);
	        this.state = 63;
	        this.match(ReglasParser.T__1);
	        this.state = 64;
	        this.match(ReglasParser.T__4);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	identificador() {
	    let localctx = new IdentificadorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, ReglasParser.RULE_identificador);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 66;
	        this.match(ReglasParser.LETRA);
	        this.state = 70;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===18 || _la===19) {
	            this.state = 67;
	            _la = this._input.LA(1);
	            if(!(_la===18 || _la===19)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 72;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

ReglasParser.EOF = antlr4.Token.EOF;
ReglasParser.T__0 = 1;
ReglasParser.T__1 = 2;
ReglasParser.T__2 = 3;
ReglasParser.T__3 = 4;
ReglasParser.T__4 = 5;
ReglasParser.T__5 = 6;
ReglasParser.T__6 = 7;
ReglasParser.T__7 = 8;
ReglasParser.T__8 = 9;
ReglasParser.T__9 = 10;
ReglasParser.T__10 = 11;
ReglasParser.T__11 = 12;
ReglasParser.T__12 = 13;
ReglasParser.T__13 = 14;
ReglasParser.T__14 = 15;
ReglasParser.T__15 = 16;
ReglasParser.WS = 17;
ReglasParser.DIGITO = 18;
ReglasParser.LETRA = 19;

ReglasParser.RULE_dsl = 0;
ReglasParser.RULE_regla = 1;
ReglasParser.RULE_condicion = 2;
ReglasParser.RULE_accesoNoAutorizado = 3;
ReglasParser.RULE_multiplesIntentosFallidos = 4;
ReglasParser.RULE_actividadSospechosa = 5;
ReglasParser.RULE_comando = 6;
ReglasParser.RULE_accion = 7;
ReglasParser.RULE_identificador = 8;

class DslContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_dsl;
    }

	EOF() {
	    return this.getToken(ReglasParser.EOF, 0);
	};

	regla = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ReglaContext);
	    } else {
	        return this.getTypedRuleContext(ReglaContext,i);
	    }
	};

	accion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AccionContext);
	    } else {
	        return this.getTypedRuleContext(AccionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterDsl(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitDsl(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitDsl(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ReglaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_regla;
    }

	identificador() {
	    return this.getTypedRuleContext(IdentificadorContext,0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	comando() {
	    return this.getTypedRuleContext(ComandoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterRegla(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitRegla(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitRegla(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_condicion;
    }

	accesoNoAutorizado() {
	    return this.getTypedRuleContext(AccesoNoAutorizadoContext,0);
	};

	multiplesIntentosFallidos() {
	    return this.getTypedRuleContext(MultiplesIntentosFallidosContext,0);
	};

	actividadSospechosa() {
	    return this.getTypedRuleContext(ActividadSospechosaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterCondicion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitCondicion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitCondicion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AccesoNoAutorizadoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_accesoNoAutorizado;
    }


	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterAccesoNoAutorizado(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitAccesoNoAutorizado(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitAccesoNoAutorizado(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class MultiplesIntentosFallidosContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_multiplesIntentosFallidos;
    }

	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ReglasParser.DIGITO);
	    } else {
	        return this.getToken(ReglasParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterMultiplesIntentosFallidos(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitMultiplesIntentosFallidos(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitMultiplesIntentosFallidos(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ActividadSospechosaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_actividadSospechosa;
    }


	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterActividadSospechosa(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitActividadSospechosa(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitActividadSospechosa(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ComandoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_comando;
    }


	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterComando(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitComando(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitComando(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_accion;
    }

	identificador() {
	    return this.getTypedRuleContext(IdentificadorContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterAccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitAccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitAccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class IdentificadorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ReglasParser.RULE_identificador;
    }

	LETRA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ReglasParser.LETRA);
	    } else {
	        return this.getToken(ReglasParser.LETRA, i);
	    }
	};


	DIGITO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(ReglasParser.DIGITO);
	    } else {
	        return this.getToken(ReglasParser.DIGITO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.enterIdentificador(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ReglasListener ) {
	        listener.exitIdentificador(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof ReglasVisitor ) {
	        return visitor.visitIdentificador(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




ReglasParser.DslContext = DslContext; 
ReglasParser.ReglaContext = ReglaContext; 
ReglasParser.CondicionContext = CondicionContext; 
ReglasParser.AccesoNoAutorizadoContext = AccesoNoAutorizadoContext; 
ReglasParser.MultiplesIntentosFallidosContext = MultiplesIntentosFallidosContext; 
ReglasParser.ActividadSospechosaContext = ActividadSospechosaContext; 
ReglasParser.ComandoContext = ComandoContext; 
ReglasParser.AccionContext = AccionContext; 
ReglasParser.IdentificadorContext = IdentificadorContext; 
