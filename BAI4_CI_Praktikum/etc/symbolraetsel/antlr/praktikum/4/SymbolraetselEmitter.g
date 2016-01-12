tree grammar SymbolraetselEmitter;

options {
  tokenVocab   = Symbolraetsel;
  output       = template;
  ASTLabelType = CommonTree;
}

@header {package org.haw.cip.praktikum4.symbolraetsel;

import java.util.Set;
import java.util.HashSet;}

@members{
Set<Character> characters = new HashSet<>();
}

riddle	:	tasks+=task* -> sums(symbols={characters}, sums={$tasks});

task
@after {
Constraint constraint = new Constraint($n1.number, $n2.number, $n3.number);
constraint.prepare();
}	:	^(EQ ^(ADD n1=value n2=value) n3=value) -> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number});

value returns [Number number]
@after {
$number = new Number($symbols);
characters.addAll($number.getCharacters());
}	:	^(VALUE symbols+=SYMBOL+);
