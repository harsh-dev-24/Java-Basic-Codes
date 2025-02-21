package common.java.codes.mostasked;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String input = " Leading and Trailing ";
		removeWhitespacesFromString(input);

	}

//	Write a Java Program to remove all white spaces from a string without using replace().

	public static void removeWhitespacesFromString(String input) {

		StringBuilder result = new StringBuilder();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (c != ' ') {
				result.append(c);
			}
		}
		System.out.println(result);

	}

}
