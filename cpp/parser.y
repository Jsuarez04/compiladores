%{
#include <stdio.h>
void yyerror(const char *s);
int yylex(void);
%}

%token AUTO ALLOW_HOTPLUG IFACE FAMILY METHOD ADDRESS NETMASK GATEWAY ID IP

%%
archivo:
    declaraciones
    ;

declaraciones:
    declaracion
    | declaraciones declaracion
    ;

declaracion:
    AUTO ID
    | ALLOW_HOTPLUG ID
    | IFACE ID FAMILY METHOD opciones
    ;

opciones:
    /* Vacio */
    | opciones opcion
    ;

opcion:
    ADDRESS IP
    | NETMASK IP
    | GATEWAY IP
    ;
%%

void yyerror(const char *s) {
    fprintf(stderr, "Error sintactico: %s\n", s);
}

int main(void) {
    yyparse();
    return 0;
}