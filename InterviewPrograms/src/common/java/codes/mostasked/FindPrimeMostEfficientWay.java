package common.java.codes.mostasked;

public class FindPrimeMostEfficientWay {

	public static void main(String[] args) {

		boolean primeNum = findPrimeNum(59);
		System.out.println(primeNum);

	}

//	Write a Java Program to find whether a number is prime or not in the most efficient way?

	public static boolean findPrimeNum(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
//		6k+-1 way
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}
}

/*
 * Step-by-Step Explanation
 * 
 * Handling Small Numbers: If num ≤ 1, return false (since 1 is not prime, and
 * negative numbers are not prime). If num is 2 or 3, return true (since both
 * are prime).
 * 
 * Eliminating Even and Multiple of 3 Numbers: If num is divisible by 2 or 3,
 * return false (since prime numbers other than 2 are always odd, and a prime
 * number >3 cannot be a multiple of 3).
 * 
 * Efficient Loop Using 6k ± 1 Optimization: Prime numbers greater than 3 are
 * always in the form of 6k ± 1 (e.g., 5, 7, 11, 13, 17, 19…). The loop starts
 * from i = 5 and goes up to sqrt(num) (i.e., i * i <= num). It increments by 6
 * each time (i += 6) to check numbers of the form 6k - 1 and 6k + 1 (i.e., i
 * and i+2). If num is divisible by either i or i + 2, return false.
 * 
 * Returning true if No Factors Found: If num is not divisible by any of these
 * values, it's prime.
 */    
