package org.haw.cip.praktikum4.symbolraetsel;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

public class Number {
	private char[] _digits;
	private int _maxSize;

	public Number(List<Tree> tokens) {
		_digits = new char[tokens.size()];
		for (int i = 0; i < tokens.size(); i++) {
			Tree tree = tokens.get(i);
			char c = tree.getText().charAt(0);
			_digits[i] = c;
		}
	}
	
	public List<Character> getCharacters() {
		List<Character> number = new ArrayList<Character>();
		for (int i = _maxSize - _digits.length; i > 0; i--) {
			number.add(null);
		}
		for (int i = 0; i < _digits.length; i++) {
			number.add(_digits[i]);
		}
		return number;
	}

	public int getSize() {
		return _digits.length;
	}
	
	public int getMaxSize() {
		return _maxSize;
	}
	
	public void setMaxSize(int maxSize) {
		_maxSize = maxSize;
	}
}
