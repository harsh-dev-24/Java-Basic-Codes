package common.java.codes.hashmap;

import java.util.Arrays;

public class CheckTwoStringForAnagram {

	public static void main(String[] args) {

		String input1 = "silent";
		String input2 = "listen";

		boolean result = checkIfTwoStringAreAnagrams(input1, input2);

		if (result) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");

		}

	}

	public static boolean checkIfTwoStringAreAnagrams(String str1, String str2) {

		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		String sortedString = new String(arr1);

		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		String sortedString2 = new String(arr2);

		if (sortedString.equalsIgnoreCase(sortedString2)) {
			return true;
		}

		return false;
	}

}
