# Analizador Sintáctico: /etc/network/interfaces

Este repositorio contiene la implementación de analizadores léxicos y sintácticos (Parsers) para el archivo de configuración de red de Debian (`/etc/network/interfaces`). 

El proyecto forma parte de la evaluación de Lenguaje y Compiladores, e incluye tres implementaciones en diferentes lenguajes para realizar un experimento comparativo de tiempos de ejecución.

## Estructura del Proyecto
* `py/`: Contiene la implementación en Python usando PLY.
* `cpp/`: Contiene la implementación en C/C++ usando Flex y Bison.
* `generador.py`: Script para crear la muestra de archivos de prueba (n > 10).
* `benchmark.py`: Orquestador para medir tiempos de ejecución y graficar resultados.

## Requisitos Previos

**Para Windows (Python / Java):**
* Python 3.x
* Librerías: `pip install ply matplotlib`
* Java JDK (y el archivo `antlr-4.x.x-complete.jar` en el directorio de trabajo).

**Para Linux (C++ / Flex / Bison):**
* Paquetes básicos de compilación: `sudo apt update && sudo apt install flex bison gcc build-essential`

## Instrucciones de Uso

### 1. Generar los Archivos de Prueba
Antes de ejecutar cualquier analizador o benchmark, genera el lote de pruebas:
`python generator.py`
Esto creará una carpeta llamada `archivos_prueba` con 30 configuraciones válidas.

### 2. Ejecutar y Compilar en Linux (C++ / Flex / Bison)
Pasos exclusivos para compilar el analizador de C++:

1. Navegar a la carpeta `cpp/`:
   `cd cpp`
2. Generar el parser con Bison:
   `bison -d parser.y`
3. Generar el lexer con Flex:
   `flex lexer.l`
4. Compilar el ejecutable:
   `gcc lex.yy.c parser.tab.c -o mi_parser_c -lfl`
5. Probar con un archivo:
   `./mi_parser_c < ../archivos_prueba/interfaz_1.conf`

### 3. Ejecutar el Benchmark Completo
Una vez que las versiones estén compiladas (Java y C++), ejecuta el orquestador principal desde la raíz del proyecto para generar la gráfica comparativa:

`python benchmark.py`

*(Nota: El script generará una imagen llamada `grafica_rendimiento.png` con los resultados en milisegundos).*
