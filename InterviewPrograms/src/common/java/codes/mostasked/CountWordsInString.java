package common.java.codes.mostasked;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {

		String input = "This is a ship and ship is black";

		// calling function
		Map<String, Integer> result = countRepeatingWordsFromString(input);

		// Printing result on console
		result.forEach((k, v) -> {
			System.out.println(k + "::" + v);
		});

	}

	public static Map<String, Integer> countRepeatingWordsFromString(String input) {

		// creating hashmap to store result
		Map<String, Integer> result = new HashMap<>();

		// splitting the input string to form array of words
		String[] words = input.split("\\s+");

		// looping and adding words to hashmap based on repeated occurence
		for (String word : words) {
			result.put(word, result.getOrDefault(word, 0) + 1);
		}

		return result;
	}

}

//		The regex pattern \s+ is used to match one or more whitespace characters in a string.
//
//		Breakdown of \s+
//
//    		\s → Matches any whitespace character (spaces, tabs, newlines).
//   		 + → Matches one or more occurrences of the preceding character (\s).