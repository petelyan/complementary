package com.probtwo.complementary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplementaryPairsTest {
	
	
	@Test
	public void testZeroElements() {
		int[] inputArray = {};
		int target = 4;
		int expected = 0;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	
	
	@Test
	public void testOneElement() {
		int[] inputArray = {1};
		int target = 2;
		int expected = 0;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testTwoElementsTwoPairs() {
		int[] inputArray = {1,2};
		int target = 3;
		int expected = 2;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testTwoElementsNoPairs() {
		int[] inputArray = {1,4};
		int target = 3;
		int expected = 0;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testLongArrayNoRepeatsNoNegative() {
		int[] inputArray = {20,14,15,17,19,1,8,4,11};
		int target = 9;
		int expected = 2;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testLongArrayNoRepeatsNegative() {
		int[] inputArray = {20,14,15,17,19,1,8,4,-11};
		int target = 9;
		int expected = 4;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testLongArrayRepeatNoNegative() {
		int[] inputArray = {20,14,15,17,19,1,1,8,4,11};
		int target = 9;
		int expected = 4;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testLongArrayRepeatNegative() {
		int[] inputArray = {20,14,15,17,19,1,1,8,4,-11};
		int target = 9;
		int expected = 6;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testLongArrayHalfComp() {
		int[] inputArray = {20,14,15,17,19,1,8,4,11};
		int target = 8;
		int expected = 0;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}
	@Test
	public void testLongArrayRepeatHalfComp() {
		int[] inputArray = {20,14,15,17,19,1,8,4,4,11};
		int target = 8;
		int expected = 4;
		int pairs = ComplementaryPairs.numComplementaryPairs(inputArray, target);
		assertEquals(expected,pairs);
	}

}
