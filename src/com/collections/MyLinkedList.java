package com.collections;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

	/**
	 * 1.	Child Class of List<?>
	 * 2. 	Default length = 0
	 * 3. 	increment = on each node addition by 1;
	 * 4. 	Not Thread Safe so that we can use multi threading,
	 * 			
	 * 5. 	Best use for Storing (Write access), ReadAccess because it implements RandomAccess
	 * 7. 	Memory efficient because of Random memory allocation
	 * 8.	Time Complexities:
	 * 		->	add	:	O(n); because of copying the previous elements into new array after array is full.
	 * 		->	delete : O(n); because of left shift
	 * 		-> 	replace: O(n); because of shifting
	 * 		->	fetch : O(1); because of RandomAccess(I) or Indexing; where RandomAccess is an interface
	 */
	
	public static void main(String[] args) {
		List<String> al = new LinkedList<>();
		al.add("String 1");
		al.add("String 2");
		al.add("String 3");
		al.add("String 4");
		al.add("String 5");
		al.add("String 6");
		System.out.println(al);
		
		al.add(2, "New String");
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.size());

		System.out.println(al.get(4));
		
		al.clear();// will clear the entire list
		
		al.isEmpty(); // returns true if list is empty
		
		al.contains("String 4");	// return true if list contains that item
		
		/**
		 * 1. Constructors:
		 * 		Defualt: ArrayList<?> list = new ArrayList<>(); length = 10;
		 * 		Custome: ArrayList<?> list = new ArrayList<>(int length);
		 * 		From Collection: ArrayList<?> list = new ArrayList<>(Collection c);
		 * 2. Retain:
		 * 		al.retainAll(Collection c);
		 * 			-> It will delete non-common element in al, and will remain common element in al.
		 * 		
		 */
		
		
	}
	
}