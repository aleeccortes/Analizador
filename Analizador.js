import antlr4 from 'antlr4';
import fs from 'fs';

import ReglasLexer from './generated/ReglasLexer.js';
import ReglasParser from './generated/ReglasParser.js';
import MyVisitor from './generated/MyVisitor.js';

// Leer archivo de entrada
const input = fs.readFileSync('entrada.txt', 'utf-8');

const chars = new antlr4.InputStream(input);
const lexer = new ReglasLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new ReglasParser(tokens);
parser.buildParseTrees = true;

const tree = parser.dsl();

const visitor = new MyVisitor();

try {
  const result = visitor.visit(tree);
  console.log('Resultado final:', result);
} catch (error) {
  console.error('Error:', error.message);
}
