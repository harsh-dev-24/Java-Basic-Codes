package common.java.codes.mostasked;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num = 15;
		boolean checkIfAmstrongNum = checkIfAmstrongNum(num);
		System.out.println(num + " is Armstrong :: " + checkIfAmstrongNum);
	}
	/*
	 * Write a Java Program to check Armstrong number.
	 * 
	 * An Armstrong number is a number that is equal to the sum of its own digits
	 * each raised to the power of the number of digits. This function checks if the
	 * given number is an Armstrong number.
	 */
	/*
	 * Formula for Armstrong Number
	 * 
	 * For an n-digit number: sum of (each digitn)=original number sum of (each
	 * digitn)=original number
	 */

	public static boolean checkIfAmstrongNum(int num) {

		int power = Integer.valueOf(num).toString().length();
		int originalNum = num;
		int sum = 0;
		for (int i = 0; i < power; i++) {

			int digit = originalNum % 10;
			originalNum -= digit;
			originalNum /= 10;

//			System.out.println(digit);
			sum += Math.pow(digit, power);

		}
		if (num == sum) {
			return true;
		}

		return false;
	}

}
