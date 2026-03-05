grammar Interfaces;

// Parser Rules
archivo: declaracion+ EOF;

declaracion
    : 'auto' ID
    | 'allow-hotplug' ID
    | 'iface' ID familia metodo opcion*
    ;

familia: 'inet' | 'inet6';
metodo: 'static' | 'dhcp' | 'loopback';

opcion
    : 'address' IP
    | 'netmask' IP
    | 'gateway' IP
    ;

// Lexer Rules
ID: [a-zA-Z0-9_]+;
IP: [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
