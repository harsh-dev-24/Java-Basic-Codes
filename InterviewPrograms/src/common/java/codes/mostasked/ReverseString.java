package common.java.codes.mostasked;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Harsh";

		String result = stringReverse(input);
		System.out.println(result);

	}

	// Write a program to reverse a string without using an inbuilt function

	public static String stringReverse(String input) {

		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		return new String(charArray);
	}

}
