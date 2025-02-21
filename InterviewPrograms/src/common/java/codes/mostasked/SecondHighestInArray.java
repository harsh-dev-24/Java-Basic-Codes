package common.java.codes.mostasked;

public class SecondHighestInArray {

	public static void main(String[] args) {

		int[] input = { 4, 9, 9, 5, -3, -54 };
		int rslt = secondHighestNum(input);

		System.out.println(rslt);

	}

//	Write a Java Program to find the second-highest number in an array.

	public static int secondHighestNum(int[] nums) {

		if (nums.length < 2) {
			throw new RuntimeException("Array does not contain two elements!!");
		}

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : nums) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest && i != highest) {
				secondHighest = i;
			}
		}
		if (secondHighest == Integer.MIN_VALUE) {
			throw new RuntimeException("No second highest found!!");
		}
		return secondHighest;

	}

}
