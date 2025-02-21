package common.java.codes.mostasked;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num = 17;

		findFibonacciSeries(num);

		System.out.print("Fibonacci Series By Recurrsion :: ");
		for (int i = 0; i < num; i++) {
			System.out.print(fibonacciByRecurrsion(i) + " ");
		}

	}

	// Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	// Write a Java Program for the Fibonacci series .

	// with looping approach

	public static void findFibonacciSeries(int num) {
		if (num <= 1) {
			System.out.println(num);
			return;
		}
		int first = 0;
		int second = 1;

		System.out.print("Fibonacci Series By Looping    :: " + first + " " + second);
		for (int i = 2; i < num; i++) {
			int next = first + second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}

		System.out.println("");
	}

//	with recursion approach
	public static int fibonacciByRecurrsion(int num) {
		if (num <= 1) {
			return num;
		}
		return fibonacciByRecurrsion(num - 1) + fibonacciByRecurrsion(num - 2);
	}

}
