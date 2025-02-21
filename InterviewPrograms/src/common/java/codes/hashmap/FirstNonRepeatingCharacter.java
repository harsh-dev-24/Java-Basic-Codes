package common.java.codes.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	private static String input = "swiss";

	public static void main(String[] args) {

		
		char result = findFirstNonRepeatingCharacter(input );

		if (result != '\0') {
			System.out.println("The first non-repeating character is: " + result);
		} else {
			System.out.println("No non-repeating characters found.");
		}

	}

	public static char findFirstNonRepeatingCharacter(String input) {

		// Step 1: Create a HashMap to store character frequencies
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = input.toCharArray();

		// Step 2: Count the frequency of each character in the string
		for (char c : charArray) {
//			map.put(c, map.getOrDefault(c, 0) + 1);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		// Step 3: Find the first character with a frequency of 1
		for (char c : charArray) {
			if (map.get(c) == 1) {
				return c;// Return the first non-repeating character
			}
		}
		// Step 4: If no non-repeating character is found, return a special character
		return '\0'; // Null character to indicate no result
	}

}

//Problem:
//
//Write a program to find the first non-repeating character in a string. If all characters are repeated, return a special message.
//Example Input and Output:
//
//Input:
//"swiss"
//
//Output:
//The first non-repeating character is: w
//
//Input:
//"aabbcc"
//
//Output:
//No non-repeating characters found.