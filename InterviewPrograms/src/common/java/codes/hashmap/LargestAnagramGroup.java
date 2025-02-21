package common.java.codes.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestAnagramGroup {

	public static void main(String[] args) {
		
		String input = "listen silent enlist rat tar cat act dog god";

        String[] largestAnagramGroup = findLargestGroupOfAnagrams(input);

        System.out.println("Largest group of anagrams: " + Arrays.toString(largestAnagramGroup));

		/*
		 * Problem Description: Largest Anagram Group Objective:
		 * 
		 * Given a string of words, the goal is to find the largest group of words that
		 * are anagrams of each other. Definition of Anagram:
		 * 
		 * An anagram is a word or phrase formed by rearranging the letters of another
		 * word or phrase. For example:
		 * 
		 * "listen", "silent", and "enlist" are anagrams of each other because they
		 * contain the exact same letters, just arranged differently.
		 * 
		 * Problem Input:
		 * 
		 * A single string containing words separated by spaces. Example:
		 * "listen silent enlist rat tar art cat act dog god"
		 * 
		 * Problem Output:
		 * 
		 * Return the largest group of words that are anagrams, in the form of a
		 * String[] (array of strings). For the input above, the output would be:
		 * ["listen", "silent", "enlist"].
		 * 
		 * Constraints:
		 * 
		 * Words will only contain alphabetic characters (no punctuation or special
		 * characters). Words are case-sensitive, so "Listen" and "silent" are not
		 * considered anagrams. There may be multiple groups of anagrams, but you need
		 * to return the largest group (the group with the most words).
		 * 
		 * Example 1:
		 * 
		 * Input: "listen silent enlist rat tar art cat act dog god"
		 * 
		 * Output: ["listen", "silent", "enlist"] Example 2:
		 * 
		 * Input: "abc bca cab dab bad add"
		 * 
		 * Output: ["abc", "bca", "cab"] Approach:
		 * 
		 * Group Words by Anagrams: Sort the characters of each word to form a key.
		 * Words with the same key are grouped together as anagrams.
		 * 
		 * Find the Largest Group: From all the anagram groups, find the one with the
		 * most words.
		 * 
		 * Return the Result: Convert the largest group to an array and return it.
		 * 
		 * This problem is commonly asked in coding interviews as it tests your
		 * understanding of:
		 * 
		 * HashMaps for grouping. String manipulations (sorting characters). Efficient
		 * problem-solving techniques.
		 */
	}
	
	public static String[] findLargestGroupOfAnagrams(String input) {
		
//		make the input into array of words by splitting on " " (space)
		String[] words = input.split(" ");
		
//		Creating Map to store String key and List of anagrams as values
		Map<String, List<String>> anagramGroup = new HashMap<>();
		
//		Iterating over the words array to check the anagram and put into Map
		for(String word : words) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String sortedKey = new String(charArray);
			if(!anagramGroup.containsKey(sortedKey)) {
				anagramGroup.put(sortedKey, new ArrayList<String>());
			}
			anagramGroup.get(sortedKey).add(word);
		}
		
//		Iterate over Map to find the largest array of anagram
		
		List<String> largestAnagramArray = new ArrayList<String>();
		
		for(List<String> anagramArray : anagramGroup.values()) {
//			System.out.println(anagramArray);
			if(anagramArray.size() > largestAnagramArray.size()) {
				largestAnagramArray = anagramArray;
			}
		}
//		System.out.println(largestAnagramArray.toString());
		return largestAnagramArray.toArray(new String[0]);
	}

}
