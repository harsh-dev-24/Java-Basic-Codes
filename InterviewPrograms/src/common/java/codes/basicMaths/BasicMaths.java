package common.java.codes.basicMaths;

public class BasicMaths {

	public static void main(String[] args) {

		int input = 36;

//		int countDigitsInNum = countDigitsInNum(20);
//		System.out.println(countDigitsInNum);

//		System.out.println(reverseNum(input));
//
//		System.out.println(input + " is Palindrome ::" + checkPalindrome(input));
//		
//		System.out.println(input + " is armstrong ::" + isArmStrongNum(input));

//		printDivisors(input);

//		System.out.println(findGCD(52, 10));
		
		System.out.println(findPrime(1));

	}

	public static int countDigitsInNum(int num) {

		// approach 1
//		int digitCount = (int)Math.log10(num)+1;

		int digitCount1 = 0;
		while (num > 0) {
			int digit = num % 10;
			digitCount1++;
			num = num / 10;
		}

		return digitCount1;

	}

	public static int reverseNum(int n) {
		int revNum = 0;

		while (n > 0) {
			int lastDigit = n % 10;
			n = n / 10;
			revNum = (revNum * 10) + lastDigit;
		}
		return revNum;
	}

	public static boolean checkPalindrome(int n) {
		int revNum = 0;
		int originalNum = n;
		while (n > 0) {
			int lastDigit = n % 10;
			n = n / 10;
			revNum = (revNum * 10) + lastDigit;
		}
		return originalNum == revNum;

	}

	public static boolean isArmStrongNum(int n) {
		int power = (int) Math.log10(n) + 1;
		int sum = 0;
		int dup = n;
		while (n > 0) {
			sum += Math.pow(n % 10, power);
			n = n / 10;

		}
		return sum == dup;
	}

	public static void printDivisors(int num) {

//		approach 1
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.print(i + " ");
//			}
//		}

//		approach 2 - square root approach
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				if (i != num / i) {
					System.out.print(num / i+" ");
				}
			}
		}

//	Find GCD - Greatest Common Divisor or HCF = Highest Common Factor
//		approach = using Euclidean Algo 
//		Time Complexity = O log(n) approx
	public static int findGCD(int num1, int num2) {
		while (num1 > 0 & num2 > 0) {
			if (num1 > num2) {
				num1 = num1 % num2;
			} else {
				num2 = num2 % num1;
			}
		}
		if (num1 == 0) {
			return num2;
		}
		return num1;
	}

	public static boolean findPrime(int num) {
		int count=0;
		if(num<=1) {
			return false;
		}
		for(int i=1; i*i<=num; i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) {
			return true;
		}
		return false;
	}

}

//extraction of digits
// 1. digit = 7789 % 10 = 9
// 2. num = 7789/10 = 778
// 3. Repeat first two steps till number < 0
