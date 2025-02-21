package common.java.codes.patterns;

public class BasicPatterns {

	public static void main(String[] args) {

		int input = 5;
//		pattern1(input);
//		pattern2(input);
//		pattern3(input);
//		pattern4(input);
//		pattern5(input);
		pattern6(input);

	}

//	Patterns are very important to learn the loops in depth
//	Patterns related problems are not asked in any interview

//	We need to use nested loops for completing patterns

//	1. Outer Loop -> rows
//	2. Inner Loop -> columns
//	3. Whatever we print, print them inside inner for loop
//	4. Observe symmetry in case of some patterns (Optional)

	/*	
		****
		****
		****
		****
	*/
	public static void pattern1(int num) {

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	/*
	 * 
	 * * * *
	 */

	public static void pattern2(int num) {

		for (int i = 0; i < num; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

//	1
//	1 2 
//	1 2 3 

	public static void pattern3(int num) {

		for (int i = 0; i < num; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println("");
		}
	}

//	1
//	2 2 
//	3 3 3

	public static void pattern4(int num) {

		for (int i = 0; i < num; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println("");
		}
	}

//	* * *
//	* *
//	*

	public static void pattern5(int num) {

//		approach 1
		/*
		 * for(int i = num; i > 0; i--) {
		 * 
		 * for(int j = i; j > 0; j--) { System.out.print("* ");
		 * 
		 * } System.out.println(); }
		 */

//		approach 2
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	1 2 3
//	1 2
//	1

	public static void pattern6(int num) {

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	


}
