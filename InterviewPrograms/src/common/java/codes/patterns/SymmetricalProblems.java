package common.java.codes.patterns;

public class SymmetricalProblems {

	public static void main(String[] args) {

		int input = 3;

//		pattern1(input);
//		pattern2(input);
//		pattern3(input);
		pattern4(input);

	}

//	For symmetrical patterns, break the problem into space and stars based on rows and cols
//	  *
//	 ***
//	*****

	public static void pattern1(int num) {

		for (int i = 0; i < num; i++) {

			// space
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

//	*****
//	 ***
//	  *

	public static void pattern2(int num) {

		for (int i = 0; i < num; i++) {

			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j < (2 * num) - (2 * i + 1); j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

//	   *
//	  ***
//	 *****
//	 *****
//	  ***
//	   *

	public static void pattern3(int num) {

		pattern1(num);
		pattern2(num);

	}

//	*
//	**
//	***
//	**
//	*

	public static void pattern4(int num) {

		for (int i = 1; i <= 2 * num - 1; i++) {
			int stars = i;
			if (i > num) {
				stars = 2 * num - i;
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
