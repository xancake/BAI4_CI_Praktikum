grammar Symbolraetsel;

options {
	output=AST; 
	ASTLabelType=CommonTree;
}
tokens {
	VALUE;
}

@header {package org.haw.cip.praktikum3.symbolraetsel;}
@lexer::header {package org.haw.cip.praktikum3.symbolraetsel;}

riddle 	:	a1=value a1h=op a2=value EQ a3=value
		a1v=op a2v=op a3v=op
		b1=value b1h=op b2=value EQ b3=value
		EQ EQ EQ
		c1=value c1h=op c2=value EQ c3=value
		->
		^(EQ ^($a1h $a1 $a2) $a3)
		^(EQ ^($b1h $b1 $b2) $b3)
		^(EQ ^($c1h $c1 $c2) $c3)
		^(EQ ^($a1v $a1 $b1) $c1)
		^(EQ ^($a2v $a2 $b2) $c2)
		^(EQ ^($a3v $a3 $b3) $c3)
	;

value	:	SYMBOL+ -> ^(VALUE SYMBOL+);
op	:	ADD | SUB;

SYMBOL	:	('A'..'Z');
ADD		:	'+';
SUB		:	'-';
EQ		:	'=';

WS  :   ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};