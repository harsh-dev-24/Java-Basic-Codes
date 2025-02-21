package common.java.codes.mostasked;

public class SwapTwoNumbersWithoutThird {

	public static void main(String[] args) {

		swapNumber(3, 8);
	}

//	Write a Java Program to swap two numbers without using the third variable.

	public static void swapNumber(int a, int b) {

		a = a + b; // a = 5, b = 3 || new a = 8
		b = a - b; // b = 8-3 = 5 || new b = 5
		a = a - b; // a = 8-5 = 3 || new a = 3

		System.out.println("a :: " + a);
		System.out.println("b :: " + b);

	}

}
