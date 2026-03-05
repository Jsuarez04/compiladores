import os
import time
import subprocess
import matplotlib.pyplot as plt

carpeta_pruebas = "archivos_prueba"
archivos = [os.path.join(carpeta_pruebas, f) for f in os.listdir(carpeta_pruebas) if f.endswith('.conf')]

tiempos_python = []
tiempos_java = []

print("Iniciando pruebas de rendimiento...")

for archivo in archivos:
    # 1. Medir tiempo de Python (PLY)
    inicio_py = time.time()
    # Asume que tu script se llama analizador.py y acepta el archivo por argumento
    subprocess.run(["python", "analizador.py", archivo], stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
    fin_py = time.time()
    tiempos_python.append((fin_py - inicio_py) * 1000) # Guardar en milisegundos

    # 2. Medir tiempo de Java (ANTLR4)
    # Ajusta el nombre del .jar según la versión que hayas descargado
    inicio_java = time.time()
    subprocess.run(
        ["java", "-cp", ".;antlr-4.13.2-complete.jar", "org.antlr.v4.gui.TestRig", "Interfaces", "archivo", archivo],
        stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL
    )
    fin_java = time.time()
    tiempos_java.append((fin_java - inicio_java) * 1000)

# Generar la Gráfica
plt.figure(figsize=(10, 6))
plt.plot(range(1, len(archivos) + 1), tiempos_python, label='Python (PLY)', marker='o')
plt.plot(range(1, len(archivos) + 1), tiempos_java, label='Java (ANTLR4)', marker='s')

# Aquí tu compañero te pasará sus tiempos promedio de C++ y los puedes agregar como una línea recta o simularlos si tienen los datos exactos.
# plt.axhline(y=15, color='g', linestyle='--', label='C++ (Flex/Bison) - Promedio de compañero')

plt.title('Comparación de Tiempos de Ejecución (Parsers)')
plt.xlabel('Número de Archivo de Prueba')
plt.ylabel('Tiempo de Ejecución (Milisegundos)')
plt.legend()
plt.grid(True)
plt.tight_layout()

# Guardar y mostrar gráfica
plt.savefig('grafica_rendimiento.png')
print("Pruebas finalizadas. Gráfica guardada como 'grafica_rendimiento.png'.")
plt.show()