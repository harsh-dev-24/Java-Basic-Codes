package common.java.codes.patterns;

public class SymmetricalProblems {

	public static void main(String[] args) {

		int input = 4;

//		pattern1(input);
//		pattern2(input);
//		pattern3(input);
//		pattern4(input);
//		pattern5(input);
//		pattern6(input);
//		pattern7(input);
//		pattern8(input);
//		pattern9(input);
//		pattern10(input);
//		pattern11(input);
//		pattern12(input);
//		pattern13(input);
//		pattern14(input);
//		pattern15(input);
		pattern16(input);

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

//	1
//	0 1
//	1 0 1

	public static void pattern5(int num) {
		int start = 1;
		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				start = 0;
			} else {
				start = 1;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(start + " ");
				start = 1 - start;
			}
			System.out.println();
		}
	}

//	1         1
//	1 2     2 1
//	1 2 3 3 2 1

	public static void pattern6(int num) {
		int space = 2 * (num - 1);
		for (int i = 1; i <= num; i++) {

//			num
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

//			space
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

//			num
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			space = space - 2;
			System.out.println();

		}
	}

//	1
//	2 3
//	4 5 6

	public static void pattern7(int num) {
		int p = 1;
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(p++ + " ");
			}
			System.out.println();
		}
	}

//	A
//	A B
//	A B C

	public static void pattern8(int num) {
//		approach 1
//		for(int i =1; i<=num; i++) {
//			char p = 'A';
//			for(int j = 1; j<=i; j++) {
//				System.out.print(p++ + " ");
//			}
//			System.out.println();
//		}

//		approach 2
		for (int i = 1; i <= num; i++) {

			for (char c = 'A'; c <= 'A' - 1 + i; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

//	A B C
//	A B
//	A

	public static void pattern9(int num) {

		for (int i = 1; i <= num; i++) {

			for (char j = 'A'; j <= 'A' + (num - i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//	A
//	B B
//	C C C

	public static void pattern10(int num) {
		for (char c = 'A'; c < 'A' + num; c++) {

			for (int j = 1; j <= c - 'A' + 1; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

//     A
//   A B A
// A B C B A

	public static void pattern11(int num) {
		for (int i = 0; i < num; i++) {

			// space
			for (int j = 1; j < (num - i); j++) {
				System.out.print("  ");
			}

			// char
			char c = 'A';
			int breakPoint = (2 * i + 1) / 2;
			for (int j = 0; j < (2 * i) + 1; j++) {

				if (j < breakPoint) {
					System.out.print(c++ + " ");
				} else {
					System.out.print(c-- + " ");
				}
			}
//			// space
			for (int j = 1; j < (num - i); j++) {
				System.out.print("  ");
			}

			System.out.println();
		}

	}

//	C
//	C B 
//	C B A

	public static void pattern12(int num) {
		for (int i = 1; i <= num; i++) {

			char c = (char) ('A' + (num - 1));
			for (int j = 1; j <= i; j++) {
				System.out.print(c-- + " ");
			}
			System.out.println();
		}
	}

//	****** 
//	**  ** 
//	*    * 
//	*    * 
//	**  ** 
//	****** 

	public static void pattern13(int num) {

		int spaces = 0;
		for (int i = 0; i < num; i++) {

//			star
			for (int j = 1; j <= num - i; j++) {
				System.out.print("* ");

			}

//			space
			for (int j = 0; j < spaces; j++) {
				System.out.print("  ");
			}

//			star
			for (int j = 1; j <= num - i; j++) {
				System.out.print("* ");

			}
			System.out.println();
			spaces = spaces + 2;

		}

		int spaces1 = 2 * num - 2;
		for (int i = 1; i <= num; i++) {

//			star
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}

//			space
			for (int j = 0; j < spaces1; j++) {
				System.out.print("  ");
			}

//			star
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
			spaces1 = spaces1 - 2;

		}
	}

//
//	*    *
//	**  **
//	******
//	**  **
//	*    *

	public static void pattern14(int num) {
		int stars = 0;
		int space = 2 * num;
		for (int i = 1; i <= 2 * num - 1; i++) {

//			star

			if (i <= num) {
				stars++;
				space -= 2;
			} else {
				stars--;
				space += 2;
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("* ");
			}

//			space

			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

//			star
			for (int j = 1; j <= stars; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}
//	
//	****
//	*  *
//	*  *
//	****

	public static void pattern15(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();

		}
	}
//	i
//j	4444444 
//	4333334
//	4322234
//	4321234
//	4322234
//	4333334
//	4444444

	public static void pattern16(int n) {

		for (int i = 0; i < 2 * n - 1; i++) {

			for (int j = 0; j < 2 * n - 1; j++) {

				int top = i;
				int left = j;
				int right = (2 * n - 2) - j;
				int bottom = (2 * n - 2) - i;

				System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));

			}

			System.out.println();

		}

	}

}
