package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyMap {
	/*
	 * Collection FrameWork = Collection(List + Map + Queue) + Map(Map) 
		Map(I)
		|
		----HashMap(C) (Insertion order will not be preserved)
		|		|
		|		----LinkedHashMap(C)(Insertion order will be preserved)
		|
		SortedMap(I)
		|
		NavigableMap(I)
		|
		---TreeMap(C) (Sorted form)
	*/
	/*
	0->5,10,15
	1->21			Map<Key, Value>=> Map<Value, Node>=> Node=> LinkedList.get(node)
	2->7,17
	3->
	4->14,19
	
	hashCode = ele % bucket or PrimeNumber = 5
				14 % 5 = 4 % 5 = 4
	
	List => 15,10,5,21,17,7,18,19,14
	*/
	/**
	 * 1.	Contains <key, value> pair with unique key
	 * 2.	Can have both sorted and un-sorted
	 * 3.	HashMap implementation data structure is Hashing.
	 * 		Time Complexities:
	 * 		->	put: O(1)
	 * 		->	delete: O(1)
	 * 		->	replace : O(1)
	 * 		->	fetch: O(1)	
	 * 4.	TreeMap is implemented on Red-Black Tree. Implementation data structure is Red-Black Tree.
	 * 		-> 	put: O(log n)
	 * 		->	delete: O(log n)
	 * 		-> 	replace: O(log n)
	 * 		->	fetch:	O(log n)
	 * 5.	Not thread safe.
	 */
		
	public static void main(String[] args) {
		System.out.println("Non sorted Map");
		Map<String, String> s = new HashMap<>();
		s.put("A", "Mahi");
		s.put("B", "Sona.");
		s.put("C", "Shruti");
		s.put("D", "Ocean");
		s.put("E", "Nitesh");
		s.put("F", "Shivam");
		System.out.println(s);
		
		s.remove("C");
		System.out.println(s);
		/**
		 * Method will be same as List
		 */
		
		System.out.println("\nSorted Map in Map");
		Map<String, String> s1 = new TreeMap<>();
		s1.put("K", "Mahi");
		s1.put("B", "Sona.");
		s1.put("X", "Shruti");
		s1.put("D", "Ocean");
		s1.put("Y", "Nitesh");
		s1.put("F", "Shivam");
		System.out.println(s1);
		
		s1.remove("D");
		System.out.println(s1);
		/**
		 * Method will be same as List
		 */
		
		System.out.println("\nSorted Map in SortedMap");
		SortedMap<String, String> s3 = new TreeMap<>();
		s3.put("K", "Mahi");
		s3.put("B", "Sona.");
		s3.put("X", "Shruti");
		s3.put("D", "Ocean");
		s3.put("Y", "Nitesh");
		s3.put("F", "Shivam");
		System.out.println(s3);
		
		s3.remove("D");
		System.out.println(s3);
		/**
		 * Method will be same as List
		 */
	}
}
