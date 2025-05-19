SINTAXIS Y SEMÁNTICA DE LOS LENGUAJES

Analizador con ANTLR4 Y JavaScript

Este repositorio contiene un analizador léxico,sintático y un intérprete básico para un lenguaje personalizado,generado con ANTLR4 y ejecutado con NODE.JS




Tecnologías utilizadas
	• ANTLR4
	• Node.js
	• JavaScript (ES Modules)
	• Visual Studio Code
Requisitos
	• Node.js instalado
	• ANTLR4 instalado globalmente o compiladores de ANTLR configurados


Instalación y uso
	1. Clonar el repositorio:
cd .......(la direccion de la carpeta donde va abrir el proyecto)
git clone https://github.com/aleeccortes/cortes50856.git


	
 2. Instalar dependencias:

npm install

	
 3.  Ejecutar el analizador:
	
	
 npm start


 Se pueden cambiar los archivos de entrada para probar distintas entradas para el analizador,en el archivo Analizador.js.En la línea:
 
const input = fs.readFileSync('entrada.txt', 'utf-8');

cambiar entrada.txt por alguna de las siguientes alternativas:

-entrada2.txt
-entradaIncorrecta1.txt
-entradaIncorrecta2.txt








