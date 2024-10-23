package org.howard.edu.lsp.assignment5;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Value of Set1 is: " + set1.toString()); //returns [1, 2, 3]
		set1.remove(3); //removes 3
		System.out.println("Value of Set1 with 3 removed is: " + set1.toString()); //returns [1, 2]
		//testing set1.add(5);
		// testing set1.add(4);
		//*Testing Purposes* set1.remove(2); -> set returns "[1, 3]"
		//*Testing Purposes* 
		//set1.clear(); //-> set returns "[]"
		set1.add(3);
		System.out.println("Value of Set1 with 3 added back is: " + set1.toString()); //returns [1, 2, 3]
		System.out.println("Length of Set1 is: " + set1.length()); //returns 3
		System.out.println("Smallest value in Set1 is: " + set1.smallest()); //returns 1
		System.out.println("Largest value in Set1 is: " + set1.largest()); //returns 3

		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		//testing comparison : set3.clear();
		//testing set3.add(4);

		//System.out.println("Union of Set1 and Set2: ");
		System.out.println("Value of Set1 is: " + set1.toString()); //returns [1, 2, 3]
		System.out.println("Value of Set2 is: " + set2.toString()); //returns [3, 4, 5]
		System.out.println("Value of Set3 is: " + set3.toString()); //returns [1, 2, 3]
		System.out.println("Set1 is equal to Set2?: " + set1.equals(set2)); //returns false
		System.out.println("Set1 is equal to Set3?: " + set1.equals(set3)); //returns true
		//set1.union(set2);	// union of set1 and set2
		set1.union(set2); // set 1 is now "[1, 2, 3, 4, 5]
		System.out.print("Result of union of Set1 and Set2: ");
		System.out.println(set1.toString());	// result of complement of set1 and set3
		set1.intersect(set3); //set 1 is now "[1, 2, 3]"
		System.out.print("Result of intersect of Set1 and Set3: ");
		System.out.println(set1.toString());	// result of complement of set1 and set3
		set1.diff(set3); // set 1 is now "[]"
		System.out.print("Result of diff of Set1 and Set3: ");
		System.out.println(set1.toString());	// result of complement of set1 and set3
		set1.complement(set3); // set 1 is now "[1, 2, 3]"
		
		System.out.print("Result of complement of Set1 and Set3: ");
		System.out.println(set1.toString());	// result of complement of set1 and set3
	}

}
