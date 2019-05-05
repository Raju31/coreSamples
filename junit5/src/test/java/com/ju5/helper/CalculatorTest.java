package com.ju5.helper;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {
	int a;
	int b;
	int expectedSum;
	Calculator calculator;

	@BeforeAll
	public void startup() {
	}

	@BeforeEach
	public void setup() {
		a = 10;
		b = 20;
		expectedSum = 30;
		calculator = new Calculator();
	}

	@Test
	@DisplayName("add with positive integers")
	@Tag("functional")
	public void testAdd() {
		int actualSum = 0;

		actualSum = calculator.add(a, b);
		Assertions.assertEquals(expectedSum, actualSum);
	}

	@Test
	@DisplayName("add with negative integers")
	@Tag("non-functional")
	public void testAddNegative() {
		int actualSum = 0;

		actualSum = calculator.add(-10, -20);
		Assertions.assertEquals(-30, actualSum);
	}

	@Test
	public void testAddForException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			calculator.add(0, 0);
		});
	}

	@Test
	public void testAddForTimeout() {
		Assertions.assertTimeout(Duration.ofMillis(1), () -> {
			calculator.add(10, 20);
		});
	}

	@AfterEach
	public void teardown() {
		calculator = null;
	}

	@AfterAll
	public void shutdown() {
	}
}
