package common.java.codes.mostasked;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("Java", "SpringBoot");
		map.put("Python", "Django");
		map.put("JavaScript", "NextJs");

		iterateHashMap(map);
	}

//	Write a Java Program to iterate HashMap using While and advance for loop.
	public static void iterateHashMap(Map<String, String> map) {

		// iterate using enhanced for loop

		System.out.println("Iterating with Enhanced For loop");
		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "::" + e.getValue());

		}

		// iterate using while loop
		System.out.println("Iterating with While loop");
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> e = iterator.next();
			System.out.println(e.getKey() + "::" + e.getValue());
		}

	}
}
