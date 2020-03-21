package com.collections;

import java.util.HashSet;
import java.util.Set;

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
	}
}
