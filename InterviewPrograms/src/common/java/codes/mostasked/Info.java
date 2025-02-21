package common.java.codes.mostasked;

import java.util.Iterator;
import java.util.Map;

public class Info {

//	Q #4) Write a Java Program to iterate HashMap using While and advance for loop.
	public void iterateHashMap(Map<String, String> map) {
		// Using advanced for-loop
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		// Using while-loop with iterator
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
