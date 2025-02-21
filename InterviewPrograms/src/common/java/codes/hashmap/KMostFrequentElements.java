package common.java.codes.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KMostFrequentElements {

	public static void main(String[] args) {

		int[] arrayInput = { 1, 1, 1, 2, 2, 3, 3, 3, 3 };
//		int[] arrayInput = { 4, 5, 4, 6, 7, 5, 6, 4, 6 };
		int k = 2;

		List<Integer> result = findKMostFrequentElements(arrayInput, k);

		System.out.println(result);

	}

	public static List<Integer> findKMostFrequentElements(int[] array, int k) {

		Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>();

		for (int element : array) {
			if (!elementMap.containsKey(element)) {
				elementMap.put(element, 0);
			}
			elementMap.put(element, elementMap.get(element) + 1);

		}

		List<Integer> sortedNumbers = elementMap.keySet().stream()
				.sorted((a, b) -> elementMap.get(b) - elementMap.get(a)).limit(k).collect(Collectors.toList());

		return sortedNumbers;

	}

}

/*
 * ======== Problem: ======== Find the Top K Frequent Elements
 * 
 * ========== Objective: ========== Given an array of integers, find the K most
 * frequent elements.
 * 
 * ======================== Example Input and Output ========================
 * 
 * ====== Input: ====== nums = [1, 1, 1, 2, 2, 3] K = 2
 * 
 * ======= Output: ======= [1, 2] (1 appears 3 times, and 2 appears 2 times.)
 * 
 * ====== Input: ====== nums = [4, 5, 4, 6, 7, 5, 6, 4, 6] K = 1
 * 
 * ======= Output: ======= [6] (6 appears 3 times, which is the highest
 * frequency.)
 */