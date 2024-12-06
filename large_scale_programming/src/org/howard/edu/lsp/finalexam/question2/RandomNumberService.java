package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;


public class RandomNumberService {
	static Random rand = new Random();
	/**
	* Implementation of generateRandomNumber using Java's built-in Random class.
	*/
	static public int generateRandomNumber1() {
		
		 int x = rand.nextInt(Integer.MAX_VALUE); // Generated an integer
		 if (x < 0) { // If negative...
			 x = (x * -1); // convert to positive
		 }
	     return x; //returns generated number
	 }
	 
	static public void generateRandomNumber2() {
		Random rand2 = new Random(System.currentTimeMillis());
	    int i;
	 
	    for (i = 0; i < 5; i++) {
	      System.out.print(rand2.nextInt(10));
	  }
	 
	// This code is contributed by phasing17
	}
}
