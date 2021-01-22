package com.probtwo.complementary;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class that calculates the number of k-complementary pairs in an array.
 * 
 * @author petel
 *
 */

public class ComplementaryPairs {

	/**
	 * Function that calculates the number of k-complementary pairs
	 * 
	 * @param inputArray - array used as input
	 * @param k          - the value the pairs must add up to.
	 * @return
	 */

	public static int numComplementaryPairs(int[] inputArray, int k) {
		int pairs = 0;
		Map<Integer, Integer> numMap = new HashMap<>();
		if (inputArray.length <= 1) {
			pairs = 0;
		} else {
			for (int elem : inputArray) {
				numMap.merge(elem, 1, Integer::sum);
			}
			Set<Integer> uniqueNums = numMap.keySet();
			pairs = uniqueNums.stream().filter((element) -> {
				int comp = k - element;
				return element != comp || numMap.getOrDefault(element, 0) > 1;
			}).mapToInt((element) -> {
				int comp = k - element;
				return  numMap.getOrDefault(comp, 0) * numMap.getOrDefault(element, 0);
			}).sum();

		}

		return pairs;
	}
}
