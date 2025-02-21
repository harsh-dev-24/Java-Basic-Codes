package common.java.codes.mostasked;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChars {

	public static void main(String[] args) {

		String input = "swiss";

		findDupCharsInString(input);

	}

//	Write a Java Program to find the duplicate characters in a string
	public static void findDupCharsInString(String input) {

		char[] chars = input.toLowerCase().toCharArray();
		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
		for (char c : chars) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		for (char c : freqMap.keySet()) {
			if (freqMap.get(c) > 1) {
				System.out.println("character " + c + " appears " + freqMap.get(c) + " times");
			}
		}

	}

}
