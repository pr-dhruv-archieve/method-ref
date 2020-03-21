package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySet {
	/*
	Collection(I)
		|
		Set(I)
		|
		----HashSet(C) (Insertion order will not be preserved)
		|		|
		|		----LinkedHashSet(C)(Insertion order will be preserved)
		|
		SortedSet(I)
		|
		NavigableSet(I)
		|
		---TreeSet(C) (Sorted form)
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
	 * 1.	Contains unique element
	 * 2.	Can have both sorted and un-sorted
	 * 3.	HashSet is implemented on HashMap. Implementation data structure is Hashing.
	 * 		Time Complexities:
	 * 		->	add: O(1)
	 * 		->	delete: O(1)
	 * 		->	replace : O(1)
	 * 		->	fetch: O(1)	
	 * 4.	TreeSet is implemented on Red-Black Tree. Implementation data structure is Red-Black Tree.
	 * 		-> 	add: O(log n)
	 * 		->	delete: O(log n)
	 * 		-> 	replace: O(log n)
	 * 		->	fetch:	O(log n)
	 * 5.	Not thread safe.
	 */
		
	public static void main(String[] args) {
		System.out.println("Non sorted set");
		Set<String> s = new HashSet<>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		System.out.println(s);
		
		s.remove("C");
		System.out.println(s);
		/**
		 * Method will be same as List
		 */
		
		System.out.println("\nSorted set in Set");
		Set<String> s1 = new TreeSet<>();
		s1.add("B");
		s1.add("D");
		s1.add("A");
		s1.add("Z");
		s1.add("X");
		s1.add("P");
		System.out.println(s1);
		
		s1.remove("D");
		System.out.println(s1);
		/**
		 * Method will be same as List
		 */
		
		System.out.println("\nSorted set in SortedSet");
		SortedSet<String> s3 = new TreeSet<>();
		s3.add("B");
		s3.add("D");
		s3.add("A");
		s3.add("Z");
		s3.add("X");
		s3.add("P");
		System.out.println(s3);
		
		s3.remove("D");
		System.out.println(s3);
		/**
		 * Method will be same as List
		 */
	}
}
