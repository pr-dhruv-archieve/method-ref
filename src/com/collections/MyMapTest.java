package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMapTest {
		
	public static void main(String[] args) {
		System.out.println("Non sorted Map");
		Map<String, String> map = new HashMap<>();
		map.put("A", "Mahi");
		map.put("B", "Sona");
		map.put("C", "Shruti");
		map.put("D", "Ocean");
		map.put("E", "Nitesh");
		map.put("F", "Shivam");
		System.out.println(map);
		
		map.remove("C");
		System.out.println(map);
		
		System.out.println("Value at B : " + map.get("B"));
		
		map.put("C", "Shruti");
		System.out.println("Replace old value\n\tOld value : " + map.put("C", "Dhruti") + "\n\tNew value : " + map.get("C"));
		
		
		System.out.println("\n\nMap Iteration");
		System.out.println("using KeySet");
		Set<String> allKeys = map.keySet();
		System.out.println("Key Set : " + allKeys);
		
		for (String key : allKeys) {
			System.out.println("Key : " + key + ", " + "Value : " + map.get(key));
		}
		
		/**
		 * Map -> Entry -> K,V
		 */
		System.out.println("using EntrySet");
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		for (Map.Entry<String, String> entry: entrySet) {
			System.out.println("Key = " + entry.getKey() + " value : " + entry.getValue());
		}
		
		

	}
}
