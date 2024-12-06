package org.howard.edu.lsp.finalexam.question2;
import java.util.Scanner;

/**
* Implementation of RandomNumberCLient using Java's built-in Random class.
*/
public class RandomNumberClient extends RandomNumberService {
	// create instance of Random class
	public static void main(String[] args)
	  {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Choose how you want your number generated. (1 for Built In Number Generator. 2 for Custom Number Generator.)");
		
		String choice = myObj.nextLine();  // Read user input
		System.out.print("Random number via ");
		if (choice.equals("1")) {
			System.out.print("Built in generator: ");
			System.out.println(generateRandomNumber1());
			
		}
		else {
			System.out.print("Custom generator: ");
			generateRandomNumber2();
		}
	  }

}


//https://www.geeksforgeeks.org/generating-random-numbers-in-java/
//Chat GPT
//https://www.geeksforgeeks.org/pseudo-random-number-generator-prng/
