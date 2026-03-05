import os
import random

# Crear carpeta si no existe
if not os.path.exists("archivos_prueba"):
    os.makedirs("archivos_prueba")

# Cantidad de archivos a generar (n = 30, cumple con 10 < n < 50)
cantidad_archivos = 30

for i in range(1, cantidad_archivos + 1):
    num_interfaces = random.randint(1, 10) # Archivos con 1 a 10 interfaces
    contenido = "auto lo\niface lo inet loopback\n\n"
    
    for j in range(num_interfaces):
        metodo = random.choice(["static", "dhcp"])
        contenido += f"auto eth{j}\n"
        contenido += f"iface eth{j} inet {metodo}\n"
        
        if metodo == "static":
            base_ip = f"192.168.{j}.{random.randint(2, 250)}"
            contenido += f"    address {base_ip}\n"
            contenido += "    netmask 255.255.255.0\n"
            contenido += f"    gateway 192.168.{j}.1\n"
        contenido += "\n"

    # Guardar archivo
    with open(f"archivos_prueba/interfaz_{i}.conf", "w") as f:
        f.write(contenido)

print(f"Se generaron {cantidad_archivos} archivos en la carpeta 'archivos_prueba'.")