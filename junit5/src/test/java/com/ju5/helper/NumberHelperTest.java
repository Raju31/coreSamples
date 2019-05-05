package com.ju5.helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class NumberHelperTest {
	@Test
	public void test() {
		
	}

	@Nested
	public final class TestPrime {
		int n;
		NumberHelper numberHelper;

		@BeforeEach
		public void setup() {
			n = 7;
			numberHelper = new NumberHelper();
		}

		@org.junit.jupiter.api.Test
		@RepeatedTest(5)
		public void testPrimePositive() {
			boolean actual = false;

			actual = numberHelper.isPrime(n);
			Assertions.assertTrue(actual);
		}
	}
	
	@Nested
	public final class TestLucky {
		@Test
		public void testIsLucky() {
			Assertions.assertTrue(true);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
