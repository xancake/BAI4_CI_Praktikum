grammar minip;

// TODO: Vergleich und Arithmetischer Ausdruck sind nicht LL(*)-Unterscheidbar
//       Dementsprechend können derzeit keine Vergleiche in Zuweisungen verwendet werden
//vergleich	:	BOOLEAN | (arith_ausdruck T_OP_VERGLEICH arith_ausdruck);

options {
	output=AST;
	ASTLabelType=CommonTree;
}
tokens {
	VARDEF;
}

start		:	T_PROGRAM^ deklarationen T_BEGIN! anweisungen T_END!;
deklarationen	:	deklaration*;
deklaration	:	datentyp ID (T_COMMA ID)* T_SEMICOLON -> ^(VARDEF datentyp ID)*;
datentyp	:	T_TYPE_INTEGER | T_TYPE_REAL | T_TYPE_STRING | T_TYPE_BOOLEAN;
anweisungen	:	(anweisung  | kontrollstruktur)*;
anweisung	:	(wertzuweisung | anw_read | anw_print) T_SEMICOLON!;

wertzuweisung	:	ID T_OP_ZUWEISUNG^ (STRING | vergleich | arith_ausdruck);
anw_read	:	T_READ^ T_KLAMMER_AUF! ID T_KLAMMER_ZU!;
anw_print	:	T_PRINTLN^ T_KLAMMER_AUF! (ID | STRING) T_KLAMMER_ZU!;

kontrollstruktur:	anw_if | anw_while;
anw_if		:	T_IF^ vergleich anw_if_then anw_if_else? T_FI!;
anw_if_then	:	T_THEN^ anweisungen;
anw_if_else	:	T_ELSE^ anweisungen;
anw_while	:	T_WHILE^ vergleich T_DO! anweisungen T_OD!;

vergleich	:	BOOLEAN | (arith_wert T_OP_VERGLEICH^ arith_wert);
arith_ausdruck	:	arith_term (T_OP_AUSDRUCK^ arith_term)*;
arith_term	:	arith_faktor (T_OP_TERM^ arith_faktor)*;
arith_faktor	:	T_OP_AUSDRUCK^? (arith_wert | (T_KLAMMER_AUF! arith_ausdruck T_KLAMMER_ZU!));
arith_wert	:	ID | INT | REAL;


T_PROGRAM	:	'program';
T_BEGIN		:	'begin';
T_END		:	'end';
T_READ		:	'read';
T_PRINTLN	:	'println';
T_TYPE_INTEGER	:	'integer';
T_TYPE_REAL	:	'real';
T_TYPE_STRING	:	'string';
T_TYPE_BOOLEAN	:	'boolean';
T_IF		:	'if';
T_THEN		:	'then';
T_ELSE		:	'else';
T_FI		:	'fi';
T_WHILE		:	'while';
T_DO		:	'do';
T_OD		:	'od';

T_COMMA		:	',';
T_SEMICOLON	:	';';
T_KLAMMER_AUF	:	'(';
T_KLAMMER_ZU	:	')';
T_OP_ZUWEISUNG	:	':=';
T_OP_AUSDRUCK	:	'+' | '-';
T_OP_TERM		:	'*' | '/';
T_OP_VERGLEICH	:	'=' | '<>' | '<=' | '>=' | '<' | '>';

BOOLEAN	:	'true' | 'false';
ID	:	LETTER (LETTER|DIGIT|'_')*;
INT	:	DIGIT+;
REAL	:	DIGIT+ '.' DIGIT+;
STRING	:	'\'' .* '\'';

COMMENT	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	|	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
WS	:	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};


fragment	LETTER	:	'A'..'Z' | 'a'..'z';
fragment	DIGIT	:	'0'..'9';