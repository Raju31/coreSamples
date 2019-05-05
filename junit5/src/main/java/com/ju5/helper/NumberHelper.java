package com.ju5.helper;

public class NumberHelper {

	public boolean isPrime(int n) {
		boolean flag = true;

		for (int i = 2; i < (n / 2) + 1; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean isLucky(int n) {
		if (n > 0) {
			return true;
		}
		return false;
	}
}
