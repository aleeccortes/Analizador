

regla nombre_regla {
  cuando intentoAccesoFueraHorario
  entonces agregarUsuarioAListaNegra
}
accion 'agregarUsuarioAListaNegra' { }


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



Salida esperada
El resultado se imprime por consola con el contenido analizado en formato JSON, por ejemplo:

{
  "id": "bloqueo_acceso_ilegal",
  "condicion": ["intentoAccesoFueraHorario"],
  "comando": "agregarUsuarioAListaNegra"
}



regla {
  si entonces ;
}
![image](https://github.com/user-attachments/assets/7af2c1bc-cd8d-49e8-96db-fe2bab5e4866)

