# Cálculo de la distancia de edición

Este proyecto en Java calculara la distancia entre dos cadenas diferentes, tanto de numeros, caracteres, etc. Se usaran matrices para medir la diferencia entre dos sentencias distintas. 

## Estructura del Proyecto

El proyecto está organizado en dos paquetes principales:

1. **src.aplicacion:** Contiene la clase principal `Principal` que sirve como punto de entrada del programa.

2. **src.palabras:** Incluye la clase `CalculadoraDistancias` que se encarga de calcular la distancia entre las sentencias dadas en la clase principal. Hara uso de matrices para calcular la opcion mas eficaz entre eliminar, añadir o modificar cada caracter de la segunda sentencia para calcular su distancia con la primera.


## Manifest

El archivo `Manifest.txt` indica la clase principal que debe ejecutarse.

## Makefile
El archivo Makefile contiene reglas para la compilación del proyecto:

limpiar: Esta regla elimina cualquier archivo .jar y el directorio bin.

compilar: Crea el directorio bin si no existe, luego compila todos los archivos .java encontrados en el proyecto y los coloca en el directorio bin.

jar: Esta regla depende de la regla compilar. Crea un archivo .jar llamado distancia.jar utilizando los archivos compilados en el directorio bin y un archivo de manifiesto especificado por el usuario, en este caso, Manifest.txt.

## License

El archivo LICENSE contiene los términos y condiciones de la licencia del proyecto, asegurando su uso adecuado y legal.
