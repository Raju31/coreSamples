package com.ju5.helper;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class WordProcessorTest {
	protected WordProcessor wordProcessor;

	@BeforeEach
	public void setup() {
		wordProcessor = new WordProcessor();
	}

	public static Stream<Object[]> charCountSource() {
		Object[][] source = new Object[][] { { "apple", 'p', 2 }, { "ball", 'l', 2 } };
		return Stream.of(source);
	}

	@ParameterizedTest
	@MethodSource("charCountSource")
	public void testCharCount(String word, char c, int en) {
		int an = 0;
		an = wordProcessor.charCount(word, c);
		Assertions.assertEquals(en, an);
	}

}











