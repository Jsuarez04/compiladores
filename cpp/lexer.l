%{
#include "parser.tab.h"
%}

%%
"auto"                  { return AUTO; }
"allow-hotplug"         { return ALLOW_HOTPLUG; }
"iface"                 { return IFACE; }
"inet"|"inet6"          { return FAMILY; }
"static"|"dhcp"|"loopback" { return METHOD; }
"address"               { return ADDRESS; }
"netmask"               { return NETMASK; }
"gateway"               { return GATEWAY; }
[a-zA-Z0-9_]+           { return ID; }
[0-9]{1,3}(\.[0-9]{1,3}){3} { return IP; }
[ \t\n]+                { /* Ignorar espacios y saltos */ }
#.* { /* Ignorar comentarios */ }
.                       { printf("Error lexico: %s\n", yytext); }
%%
int yywrap() { return 1; }