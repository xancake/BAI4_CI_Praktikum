tree grammar SymbolraetselTreeWalker;

options {
	tokenVocab=Symbolraetsel;
	ASTLabelType=CommonTree;
	output=AST;
}

tokens {
	VALUE;
}

@header {package org.haw.cip.praktikum3;}

riddle	:	task task task task task task;
task	:	^(EQ ^(ADD value value) value)
	|	^(EQ ^(SUB v1=value v2= value) v3=value) -> ^(EQ ^(ADD["+"] $v3 $v2) $v1);
value	:	^(VALUE SYMBOL+);

// H:\prof\neitzke_michael\Compiler und Interpreter\Praktikum\CodeZumBuch\tour\trees