package common.java.codes.mostasked;

import java.util.HashMap;
import java.util.Map;

public class ArrayNumsAndTarget {

	public static void main(String[] args) {

		int[] nums = { 4, 6, 2, 3, 9, 7 };
		int target = 8;

		int[] result = twoIntSum(nums, target);

		System.out.println(result[0] + " :: " + result[1]);

	}

	private static int[] twoIntSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			} else {
				numMap.put(nums[i], i);
			}
		}

		throw new RuntimeException("No two nums found whose sum is equal to target");

	}

//	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

}
