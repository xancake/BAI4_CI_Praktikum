grammar symbolraetsel;

options {
	output=AST;
	ASTLabelType=CommonTree;
}
tokens {
	STRING;
}

start	:	a1=aufgabe
		op1=OPERATOR op2=OPERATOR op3=OPERATOR
		a2=aufgabe
		OP_EQUALS OP_EQUALS OP_EQUALS
		a3=aufgabe
		->
		^(OP_EQUALS ^($op1 ^(STRING $a1.s1) ^(STRING $a2.s1)) ^(STRING $a3.s2))
		//^(OP_EQUALS ^($op1 $a1.strings.get(1) $a2.strings.get(1) $a3.strings.get(1))
		//^(OP_EQUALS ^($op1 $a1.strings.get(2) $a2.strings.get(2) $a3.strings.get(2))
	        ;
	        
aufgabe returns [String s1, String s2, String s3] :
	ss1=string {$s1 = $ss1.text;} OPERATOR ss2=string {$s2 = $ss2.text;} OP_EQUALS ss3=string {$s3 = $ss3.text;}
	->	^(OP_EQUALS ^(OPERATOR ^(STRING $ss1) ^(STRING $ss2)) ^(STRING $ss3))
	;

string	:	LETTER+;

LETTER		:	'A'..'Z';
OPERATOR	:	'+' | '-';
OP_EQUALS	:	'=';
WS		:	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
