package common.java.codes.mostasked;

public class RemoveOccurFromArray {

	public static void main(String[] args) {
		int[] input = { 2, 5, 8, 3, 6, 4, 7, 5 };

		int result = removeElementFromArray(input, 5);

		System.out.println(result);

	}

//	Remove all occurrences of a value from an array in-place
	/*
	 * Given an array nums and a value val, remove all instances of that value
	 * in-place and return the new length of the array. Do not allocate extra space
	 * for another array. You must modify the input array in-place with O(1) extra
	 * memory.
	 */

	public static int removeElementFromArray(int[] nums, int element) {

		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != element) {
				nums[i] = nums[j];
				i++;
			}
		}

		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println("");
		return i;
	}
}
