# Analizador de Reglas de Seguridad (ANTLR4 + JavaScript)

Este proyecto implementa un **analizador léxico y sintáctico** para un mini lenguaje de definición de reglas de seguridad, utilizando **ANTLR4** con soporte para **JavaScript**.

## Características

- **Lectura de un archivo de entrada** (`entrada.txt`) con reglas definidas en lenguaje DSL.
- **Análisis léxico y sintáctico** usando una gramática escrita en `Reglas.g4`.
- **Extracción de componentes** como identificadores, condiciones y acciones.
- **Salida estructurada** del análisis (JSON).
- Manejo de errores léxicos y sintácticos.

## Estructura del lenguaje DSL

El archivo de entrada debe tener el siguiente formato:

```dsl
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

git clone https://github.com/aleeccortes/Analizador.git
cd analizador-antlr

	2. Instalar dependencias:

npm install

	3.  Ejecutar el analizador:
	
	npm start


Archivos importantes
	• Reglas.g4: Gramática del lenguaje.
	• analizador.js: Script principal que carga el archivo de entrada y aplica el visitor.
	• MyVisitor.js: Visitor personalizado que extrae la información relevante.
	• entrada.txt: Archivo de prueba con reglas DSL.

Salida esperada
El resultado se imprime por consola con el contenido analizado en formato JSON, por ejemplo:

{
  "id": "bloqueo_acceso_ilegal",
  "condicion": ["intentoAccesoFueraHorario"],
  "comando": "agregarUsuarioAListaNegra"
}

ArchivoDeTexto

VÁLIDOS
regla bloquear_acceso {
  si intentoAccesoFueraHorario entonces agregarUsuarioAListaNegra;
}

regla alerta_intento_multiple {
  si masDeTresIntentosFallidos entonces enviarNotificacion;
}

NO VÁLIDOS

regla bloquear-acceso {
  si intentoAccesoFueraHorario entonces agregarUsuarioAListaNegra
}


regla {
  si entonces ;
}
![image](https://github.com/user-attachments/assets/7af2c1bc-cd8d-49e8-96db-fe2bab5e4866)

