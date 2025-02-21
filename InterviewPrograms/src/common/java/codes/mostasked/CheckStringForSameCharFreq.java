package common.java.codes.mostasked;

import java.util.HashMap;
import java.util.Map;

public class CheckStringForSameCharFreq {

	public static void main(String[] args) {

		String input = "Buffaallouob";

		boolean result = checkStringForSameCharacterFreq(input);
		boolean result1 = areOccurrencesEqual(input);
		System.out.println(result);

	}

//	Check if all characters in a string have the same frequency
	/*
	 * Given a string s, return true if s is a "good" string, or false otherwise. A
	 * string s is good if all characters that appear in s have the same number of
	 * occurrences (i.e., the same frequency).
	 */

	// approach 1
	public static boolean checkStringForSameCharacterFreq(String input) {

		char[] charArray = input.toLowerCase().toCharArray();
		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
		for (char c : charArray) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
		int frequency = 0;
		for (int i : freqMap.values()) {
			if (frequency == 0) {
				frequency = i;
			} else {
				if (i != frequency) {
					return false;
				}
			}
		}

		return true;
	}

	// approach 2
	public static boolean areOccurrencesEqual(String s) {

		int[] count = new int[26]; // There are 26 lowercase English letters
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}
		int frequency = 0;
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				if (frequency == 0) {
					frequency = count[i]; // Set the first non-zero frequency found
				} else if (frequency != count[i]) {
					return false; // Return false if any frequency doesn't match the first found
				}
			}
		}
		return true;
	}
}
