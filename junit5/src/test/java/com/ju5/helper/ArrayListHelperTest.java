package com.ju5.helper;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

public class ArrayListHelperTest {
	protected List<String> il;
	protected List<String> el;
	protected ArrayListHelper<String> arrayListHelper;

	@BeforeEach
	public void setup() {
		il = Arrays.asList(new String[] { "apple", "ball", "apple", "cat", "mat", "duck", "mat" });
		el = Arrays.asList(new String[] { "apple", "ball", "cat", "mat", "duck" });
		arrayListHelper = new ArrayListHelper<>();
	}

	@org.junit.jupiter.api.Test
	public void testRemoveDuplicates(TestReporter testReporter) {
		List<String> al = null;

		al = arrayListHelper.removeDuplicates(il);
		testReporter.publishEntry("total elements in actual array : " + al.size());
		
		Assertions.assertArrayEquals(el.toArray(), al.toArray());

	}

	@AfterEach
	public void teardown() {
		arrayListHelper = null;
	}
}
