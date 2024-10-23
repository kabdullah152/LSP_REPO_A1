package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	// Store the set elements in an ArrayList.
		private List<Integer> set = new ArrayList<Integer>();

		// Default Constructor
		public IntegerSet() {
		}

		// Constructor if you want to pass in already initialized
		public IntegerSet(ArrayList<Integer> set) {
			this.set = set;
		}

		// Clears the internal representation of the set. 5 pts.
	public void clear() {
		if (!set.isEmpty()) {
			List<Integer> tempSet = new ArrayList<Integer>();
			this.set = tempSet;
		}
	};

	// Returns the length of the set. 5 pts.
	public int length() {
		return set.size();
	}; // returns the length

	/*
	              * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class. 10 pts.
	*/
	public boolean equals(Object o) {
		boolean flag = true;
		if (set.size() != ((IntegerSet)o).length()) {
			flag = false;
		}
		for (int i : set) {
			if(!((IntegerSet)o).contains(i)) {
				flag = false;
			}
		}
        return flag;
	}; 

	// Returns true if the set contains the value, otherwise false. 5 pts.
	public boolean contains(int value) {
		boolean flag = false;
		for (int i : set) {
			if (i == value) {
				flag = true;
				break;
			}
		}
		return flag;
	};    
	// Returns the largest item in the set. 5 pts.
	public int largest(){
		int max = 0;
		if (!set.isEmpty()) {
			max = set.get(0);
			for (int i : set) {
				if (i > max) {
					max = i;
				}
			}
		}
		return max;
	}; 

	// Returns the smallest item in the set. 5 pts.
	public int smallest()  {
		int min = 0;
		if (!set.isEmpty()) {
			min = set.get(0);
			for (int i : set) {
				if (i < min) {
				min = i;
				}
			}
		}
		return min;
	};

		// Adds an item to the set or does nothing it already there. 5 pts.	
	public void add(int item) {
	 		if (!set.contains(item)) {
	 			set.add(item);
	 		}
	 		
	 	}; // adds item to the set or does nothing if it is in set

		// Removes an item from the set or does nothing if not there. 5 pts.
	public void remove(int item) {
		if (set.contains(item)) {
			List<Integer> tempSet = new ArrayList<Integer>();
			for (int i : set) {
				if (i != item) {
				tempSet.add(i);
				}
			}
			set = tempSet;
		}
	}; 

	// Set union. 11 pts.
	public void union(IntegerSet intSetb) {
		for (int i : intSetb.set) {
			if (!set.contains(i)) {
			set.add(i);
			}
		}
		//intSetb.set.clear();
	};

	// Set intersection, all elements in s1 and s2. 12 pts.
	public void intersect(IntegerSet intSetb) {
		List<Integer> tempSet = new ArrayList<Integer>();
		for (int i : intSetb.set) {
			if (set.contains(i)) {
				tempSet.add(i);
			}
		}
		set = tempSet;
		//intSetb.set.clear();
	}; 

	// Set difference, i.e., s1 –s2. 12 pts.
	public void diff(IntegerSet intSetb) {
		List<Integer> tempSet = new ArrayList<Integer>();
		for (int i : set) {
			if (!intSetb.set.contains(i)) {
				tempSet.add(i);
			}
		}
		set = tempSet;
		//intSetb.set.clear();
		
	}; // set difference, i.e. s1 - s2

	// Set complement, all elements not in s1. 11 pts.
	public void complement(IntegerSet intSetb) {
		List<Integer> tempSet = new ArrayList<Integer>();
		for (int i : intSetb.set) {
			if (!set.contains(i)) {
				tempSet.add(i);
			}
		}
		set = tempSet;
	}

	// Returns true if the set is empty, false otherwise. 5 pts.
	boolean isEmpty() {
		boolean flag = false;
		if (set.size() == 0) {
			flag = true;
		}
		return flag;
	}; 

	// Return String representation of your set.  This overrides the equal method from 
	// the Object class. 5 pts.
	public String toString() {
		String listFormat = "[";
		if (!set.isEmpty()) {
			for (int i : set) {
				listFormat += (i + ", ");
			}
			listFormat = listFormat.substring(0, (listFormat.length() - 2)) + "]";
		}
		else {
			listFormat = "[]";
		}
		return listFormat;
	};	// return String representation of your set

}