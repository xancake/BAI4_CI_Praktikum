grammar symbolraetsel;

start	:	aufgabe
	        OPERATOR OPERATOR OPERATOR
	        aufgabe
	        OP_EQUALS OP_EQUALS OP_EQUALS
	        aufgabe;
aufgabe	:	string OPERATOR string OP_EQUALS string;
string	:	LETTER+;

LETTER		:	'A'..'Z';
OPERATOR	:	'+' | '-';
OP_EQUALS	:	'=';
WS		:	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
