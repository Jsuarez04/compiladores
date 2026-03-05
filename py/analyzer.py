import ply.lex as lex
import ply.yacc as yacc
import sys

# --- LEXER ---
tokens = (
    'AUTO', 'ALLOW_HOTPLUG', 'IFACE', 'FAMILY', 'METHOD',
    'ADDRESS', 'NETMASK', 'GATEWAY', 'ID', 'IP'
)

t_AUTO = r'auto'
t_ALLOW_HOTPLUG = r'allow-hotplug'
t_IFACE = r'iface'
t_FAMILY = r'inet|inet6'
t_METHOD = r'static|dhcp|loopback'
t_ADDRESS = r'address'
t_NETMASK = r'netmask'
t_GATEWAY = r'gateway'

def t_IP(t):
    r'\d{1,3}(\.\d{1,3}){3}'
    return t

def t_ID(t):
    r'[a-zA-Z0-9_]+'
    # Evitar que las palabras reservadas se confundan con IDs
    if t.value in ['auto', 'allow-hotplug', 'iface', 'inet', 'inet6', 'static', 'dhcp', 'loopback', 'address', 'netmask', 'gateway']:
        t.type = t.value.upper().replace('-', '_')
    return t

t_ignore = ' \t\n'

def t_ignore_COMMENT(t):
    r'\#.*'
    pass

def t_error(t):
    print(f"Error léxico: {t.value[0]}")
    t.lexer.skip(1)

lexer = lex.lex()

# --- PARSER ---
def p_archivo(p):
    '''archivo : declaraciones'''
    pass

def p_declaraciones(p):
    '''declaraciones : declaracion
                     | declaraciones declaracion'''
    pass

def p_declaracion_auto(p):
    '''declaracion : AUTO ID
                   | ALLOW_HOTPLUG ID'''
    pass

def p_declaracion_iface(p):
    '''declaracion : IFACE ID FAMILY METHOD opciones'''
    pass

def p_opciones(p):
    '''opciones : 
                | opciones opcion'''
    pass

def p_opcion(p):
    '''opcion : ADDRESS IP
              | NETMASK IP
              | GATEWAY IP'''
    pass

def p_error(p):
    if p:
        print(f"Error sintáctico cerca de '{p.value}'")
    else:
        print("Error sintáctico al final del archivo")

parser = yacc.yacc()

if __name__ == '__main__':
    import sys
    if len(sys.argv) > 1:
        with open(sys.argv[1], 'r') as f:
            data = f.read()
        parser.parse(data)
        print(f"Análisis completado en Python para {sys.argv[1]}")
    else:
        print("Por favor, indica el archivo. Ej: python analizador.py prueba.txt")