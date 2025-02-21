package common.java.codes.mostasked;

import java.util.Arrays;

public class SortCommaSeperatedString {

	public static void main(String[] args) {

		String input = ",This, is, a, black, sheep";

		String result = sortString(input);

		System.out.println(result);

	}

	private static String sortString(String input) {

		String[] splittedString = input.trim().split(",");
		Arrays.sort(splittedString);
		return String.join("", splittedString);

	}

//	Write a program that accepts comma-separated strings, sorts the strings in ascending order, and outputs the concatenated string of sorted strings.

}
