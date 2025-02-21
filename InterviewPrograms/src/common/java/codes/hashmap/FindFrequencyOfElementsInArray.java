package common.java.codes.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElementsInArray {

	public static void main(String[] args) {

		int[] inputArr = { 1, 2, 2, 6, 6, 6, 4 };

		System.out.println(findElementWithHighestFrequency(inputArr));

	}

	public static Integer findElementWithHighestFrequency(int[] input) {

		Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>();

		for (Integer element : input) {
			if (!elementMap.containsKey(element)) {
				elementMap.put(element, 1);
			} else {
				elementMap.put(element, elementMap.get(element) + 1);
			}
		}

		Integer highestFrequencyElement = 0;
		int highestCount = 0;
		for (Integer e : elementMap.keySet()) {
			if (elementMap.get(e) > highestCount) {
				highestCount = elementMap.get(e);
				highestFrequencyElement = e;
			}
		}
		return highestFrequencyElement;
	}

}

/*
 * Problem 1: Find the element with Highest Frequency in an Array
 * 
 * Given an array of integers, count the frequency of each element and display
 * the result using a HashMap. Example:
 * 
 * Input: arr = [1, 2, 2, 3, 3, 3, 4]
 * 
 * Output: 1: 1 2: 2 3: 3 4: 1
 * 
 * Actual O/P : 3
 */