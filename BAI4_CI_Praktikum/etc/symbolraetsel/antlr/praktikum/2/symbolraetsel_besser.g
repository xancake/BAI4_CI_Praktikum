grammar symbolraetsel_besser;

options { 
	output=AST; 
	ASTLabelType=CommonTree;
}
tokens {
	VALUE;
}

riddle 	:	a1=value a1h=OP a2=value EQ a3=value
		a1v=OP a2v=OP a3v=OP
		b1=value b1h=OP b2=value EQ b3=value
		EQ EQ EQ
		c1=value c1h=OP c2=value EQ c3=value
		->
		^(EQ ^($a1h $a1 $a2) $a3)
		^(EQ ^($b1h $b1 $b2) $b3)
		^(EQ ^($c1h $c1 $c2) $c3)
		^(EQ ^($a1v $a1 $b1) $c1)
		^(EQ ^($a2v $a2 $b2) $c2)
		^(EQ ^($a3v $a3 $b3) $c3)
	;

value	:	VALUELETTER+ -> ^(VALUE VALUELETTER+);

VALUELETTER	:	('A'..'Z');
OP		:	('+'|'-');
EQ		:	'=';

WS  :   ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};