package common.java.codes.mostasked;

import java.util.List;

public class IterateList {

	public static void main(String[] args) {

		List<Integer> input = List.of(1, 5, 9, 11, 3);

		List<String> input2 = List.of("abc", "xyz", "hay", "hello");

		iterateList(input2);

	}

	private static <T> void iterateList(List<T> list) {

		// with normal for loop
		System.out.print("Iterate with normal for loop :: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("");

		// while loop
		System.out.print("Iterate with while loop :: ");
		int j = 0;
		while (j < list.size()) {
			System.out.print(list.get(j) + " ");
			j++;
		}
		System.out.println("");

		// enhanced for loop
		System.out.print("Iterate with enhanced for loop :: ");
		for (T e : list) {
			System.out.print(e + " ");
		}

	}

}
