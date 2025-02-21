package common.java.codes.hashmap;

import java.util.List;

public class FindSecondLargest {
	
	public static void main(String[] args) {

		List<Integer> input = List.of(10, 20, 4, 45, 99, 99, 33);

		Integer secondLargestNum = findSecondLargestNum(input);

		System.out.println(secondLargestNum);

	}

	public static Integer findSecondLargestNum(List<Integer> nums) {

		if (nums == null || nums.size() < 2) {
			throw new RuntimeException("List must have at least two numbers");
		}

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}

		if (second == Integer.MIN_VALUE) {
			throw new RuntimeException("No second largest Number Found!!");
		}
		return second;
	}

}
