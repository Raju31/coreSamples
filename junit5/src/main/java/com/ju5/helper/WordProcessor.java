package com.ju5.helper;

public class WordProcessor {

	public int charCount(String word, char c) {
		int n = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == c) {
				n++;
			}
		}

		return n;
	}

}
