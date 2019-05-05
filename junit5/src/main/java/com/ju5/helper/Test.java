package com.ju5.helper;

public class Test {
	public static void main(String[] args) {
		Random random = (int n) -> {
			return 39;
		};
		System.out.println(random.nextInteger(10));
	}
}
