package common.java.codes.mostasked;

public class FindPalindrome {

	public static void main(String[] args) {

		String input = "Madam";

		System.out.println(checkPalindrome2(input));

	}

//	Write a Java Program to find whether a string or number is palindrome or not.

	public static boolean checkPalindrome(String input) {

		StringBuilder s = new StringBuilder(input.toLowerCase());
		if (input.toLowerCase().equals(s.reverse().toString())) {
			return true;
		}
		return false;
	}

	public static boolean checkPalindrome2(String input) {

		String lowerCase = input.toLowerCase();
		int left = 0;
		int right = lowerCase.length() - 1;
		while (left < right) {
			if (lowerCase.charAt(left) != lowerCase.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
