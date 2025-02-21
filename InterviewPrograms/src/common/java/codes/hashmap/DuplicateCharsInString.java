package common.java.codes.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInString {

	public static void main(String[] args) {

		String input = "programming";

		findDuplicateCharsInString(input);

	}

	public static void findDuplicateCharsInString(String input) {

		Map<Character, Integer> freqMap = new HashMap<>();

		char[] lettersArray = input.toCharArray();

		for (char c : lettersArray) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

//		System.out.println(freqMap);
		for (char c : freqMap.keySet()) {
			if (freqMap.get(c) > 1) {
				System.out.println("Character '" + c + "' appears " + freqMap.get(c) + " times");
			}
		}

	}

}
/*
 * Problem Description:
 * 
 * Write a program to find all duplicate characters in a given string and their
 * counts.
 * 
 * Example Input: "programming"
 * 
 * Example Output:
 * 
 * Character 'r' appears 2 times Character 'g' appears 2 times Character 'm'
 * appears 2 times
 * 
 * What You Need to Do:
 * 
 * Count how many times each character appears in the string. Identify
 * characters that appear more than once. Print those characters with their
 * counts.
 */