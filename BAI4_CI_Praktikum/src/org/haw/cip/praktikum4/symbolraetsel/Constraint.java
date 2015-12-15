package org.haw.cip.praktikum4.symbolraetsel;

import java.util.Arrays;
import java.util.List;

public class Constraint {
	private List<Number> _numbers;  
	
	public Constraint(Number... numbers) {
		_numbers = Arrays.asList(numbers);
	}
	
	public void prepare() {
		int maxSize = -1;
		for (Number number : _numbers) {
			if (number.getSize() > maxSize) {
				maxSize = number.getSize();
			}
		}
		for (Number number : _numbers) {
			number.setMaxSize(maxSize);
		}
	}
}
