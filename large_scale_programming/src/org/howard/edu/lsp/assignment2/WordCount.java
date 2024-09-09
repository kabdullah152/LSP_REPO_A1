package org.howard.edu.lsp.assignment2;
//Name: Kimora Abdullah
import java.io.File;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class WordCount {
	public static void main(String[] args) throws Exception {
		char tempChar;
		int getCount = 0;
		String tempWord = "";
		File resourceFile = new File("../large_scale_programming/src/org/howard/edu/lsp/assignment2/words.text");
		Scanner myReader = new Scanner(resourceFile);  
		LinkedHashMap<String, Integer> words = new LinkedHashMap<String, Integer>();
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        for (int x = 0; x < data.length()-1; x++) {
	        	tempChar = data.charAt(x);
	        	if ((tempChar >= 'a' && tempChar <= 'z') || (tempChar >= 'A' && tempChar <= 'Z')) {
	        		tempWord += tempChar;
	        	}
	        	else {
	        		if (tempWord.length() > 3) {
	        			if (words.containsKey(tempWord.toLowerCase())) {
	        				getCount = words.get(tempWord.toLowerCase());
	        				words.replace(tempWord.toLowerCase(), getCount+1);
	        			}
	        			else {
	        				words.put(tempWord.toLowerCase(), 1);
	        			}
	        		}
	        		tempWord = "";
	        	}
	        }
	        for (String i : words.keySet()) {
	            System.out.println(i + " " + words.get(i));
	          }
	      }
	      myReader.close();
	}
}
