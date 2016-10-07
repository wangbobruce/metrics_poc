grammar AthenaQuery;

/*
java -jar C:\work\study\metrics_poc\lib\antlr-4.5.1-complete.jar C:\work\study\metrics_poc\src\com\bwang\metrics\modal\AthenaQuery.g4 -o C:\work\study\metrics_poc\src\com\bwang\metrics\gen -visitor -no-listener
*/

@header {
package com.bwang.metrics.gen;
}

expr :
      MINUS expr   #unaryExpr
    | '(' parent=expr ')'  #parentEpr
    | left=expr op=K_AND right=expr    #binaryExp
    | left=expr op=K_OR right=expr     #binaryExp
    | left=expr op=K_UNLESS right=expr #binaryExp
    | left=expr op=('*'|'/') right=expr  #binaryExp
    | left=expr op=('-'|'+') right=expr  #binaryExp
    | aggregator=(K_SUM|K_AVG|K_COUNT|K_MIN|K_MAX|K_STDDEV|K_STDVAR) aggregatorParam? expr  #aggregateExp
    | aggregator=(K_SUM|K_AVG|K_COUNT|K_MIN|K_MAX|K_STDDEV|K_STDVAR) expr aggregatorParam?  #aggregateExp
    | aggregator=( K_TOPK|K_BOTTOMK|K_COUNT_VALUES) '(' INT ','  expr ')'   #aggregateExp
    | call    #functionExpr
    | vectorSelector  #vectorSelectorExpr
    | matrixSelector  #matrixSelectorExpr
    | numberLiteral   #numberExpr
    | quoted_string   #stringExpr
    ;

call : 
      callName=IDENTIFIER LPAREN argslist? RPAREN
    ;

argslist : 
      expr (',' expr)*
    ;

numberLiteral:
      INT
    | DOUBLE
    ;

identifierList :
      IDENTIFIER (',' IDENTIFIER)*
     ;

aggregatorParam : 
     (K_BY | K_WITHOUT ) '(' identifierList ')' K_KEEP_COMMON ?
     ;

      

vectorSelector :
       '('  IDENTIFIER labelMatcherList?')' offsetExpr?
     |  IDENTIFIER labelMatcherList? offsetExpr?
     ;

 

matrixSelector : 
     '('  IDENTIFIER labelMatcherList?')' rangeExpr offsetExpr?
     |  IDENTIFIER labelMatcherList? rangeExpr offsetExpr?
     ;

labelMatcherList :
      '{' labelMatcher?  '}'
    | '{' labelMatcher (',' labelMatcher)*  '}'
    ;

labelMatcher :  
        IDENTIFIER match_op=('=='|'!=') numberLiteral
     |  IDENTIFIER match_op=('=='|'!='|'=~'|'!~') quoted_string
    ;

offsetExpr : 
     K_OFFSET  numberLiteral TIME_UNIT          
     ;

rangeExpr  :  
     '[' numberLiteral TIME_UNIT ']'
    | K_BETWEEN  from_time K_AND to_time
    ;         

 

from_time : 
      quoted_string
    | numberLiteral TIME_UNIT
    ;

      

to_time :
     quoted_string
    | numberLiteral TIME_UNIT
    ;

TIME_UNIT:
     D
    | H
    | M
    | S
    ;

quoted_string :
      QUOTED1_STRING
    | QUOTED2_STRING
    ;

QUOTED2_STRING : '\"' (~'\"')* '\"';
QUOTED1_STRING : '\'' (~'\'')* '\'';

fragment Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
fragment HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;       

/*               
stringLiteral:
    '\'' ( ESC | ~('\\'|'\'') )* '\''
    ;
*/
 

ESC :
    '\\' ('t'|'n'|'r'|'\''|'\\')
    ;

K_AND            : A N D;
K_OR             : O R;
K_UNLESS         : U N L E S S ;
K_BY             : B Y;
K_WITHOUT        : W I T H O U T;
K_KEEP_COMMON    : K E E P '_' C O M M O N;
K_OFFSET         : O F F S E T;
K_BETWEEN        : B E T W E E N;
K_SUM            : S U M;
K_AVG            : A V G;
K_COUNT          : C O U N T;
K_MIN            : M I N;
K_MAX            : M A X;
K_STDDEV         : S T D D E V;
K_STDVAR         : S T D V A R;
K_TOPK           : T O P K;
K_BOTTOMK        : B O T T O M K;
K_COUNT_VALUES   : C O U N T '_' V A L U E S;

NULL: 'null';
TRUE: 'true';
FALSE: 'false';
INT: DIGIT+;
DOUBLE: 
      INT ('d'|'f')
    | INT '.' INT ('d'|'f')?;

BANG: '!';
AND: 'and';
EQUALS: '=';
OR: 'or';
PLUS: '+';
MINUS: '-';
SLASH: '/';
STAR: '*';
LANGLE: '<';
RANGLE: '>';
DOLLAR: '$';
ASK: '?';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
DOT: '.';

IDENTIFIER: (ALPHA|DOLLAR) (ALPHANUMERIC)*;

WS: [ \r\t\u000c\n]+ -> skip;

DIGIT: '0'..'9';

fragment UPPERC: [A-Z];
fragment LOWERC: [a-z];
fragment UNDERS: '_';
fragment ALPHA: (UPPERC|LOWERC|UNDERS);
fragment ALPHANUMERIC: (UPPERC|LOWERC|UNDERS|DIGIT);
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
