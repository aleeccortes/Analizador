grammar Reglas;

dsl: regla+ accion+ EOF;

regla: 'regla' identificador '{' 'cuando' condicion 'entonces' comando '}';

condicion
    : accesoNoAutorizado
    | multiplesIntentosFallidos
    | actividadSospechosa
    ;

accesoNoAutorizado: 'intentoAccesoFueraHorario';

multiplesIntentosFallidos: 'intentosFallidos' '>' DIGITO+;

actividadSospechosa: 'accesoARecursosSensibles' 'y' 'noEsAdministrador';

comando
    : 'agregarUsuarioAListaNegra'
    | 'agregarIPAListaNegra'
    | 'activarMonitoreoDetallado'
    ;

accion: 'accion' '\'' identificador '\'' '{' '}';

identificador: LETRA (LETRA | DIGITO)*;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

WS: [ \t\r\n]+ -> skip;
