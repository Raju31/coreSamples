package com.ju5.helper;

public class Calculator {
	public int add(int a, int b) {
		if (a == 0 && b == 0) {
			throw new IllegalArgumentException("invalid arguments");
		}
		return a + b;
	}
}
