import ReglasVisitor from './ReglasVisitor.js';

class MyVisitor extends ReglasVisitor {
  constructor() {
    super();
    this.variables = new Map(); 
  }

  visitDsl(ctx) {
    let result;
    for (let i = 0; i < ctx.regla().length; i++) {
      result = this.visit(ctx.regla(i));
    }
    return result;
  }

  visitRegla(ctx) {
    const id = ctx.identificador().getText();
    const condicion = this.visit(ctx.condicion());
    const comando = ctx.comando().getText();

    console.log(`Regla: ${id}`);
    console.log(`Condición: ${condicion}`);
    console.log(`Comando: ${comando}`);
    console.log('---------------------');

    return { id, condicion, comando };
  }

  visitAccesoNoAutorizado(ctx) {
    return 'intentoAccesoFueraHorario';
  }

  visitMultiplesIntentosFallidos(ctx) {
    return `intentosFallidos > ${ctx.DIGITO().getText()}`;
  }

  visitActividadSospechosa(ctx) {
    return 'accesoARecursosSensibles y noEsAdministrador';
  }
}

export default MyVisitor;
