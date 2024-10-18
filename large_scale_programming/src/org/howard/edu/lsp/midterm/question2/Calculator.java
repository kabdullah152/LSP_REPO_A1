package org.howard.edu.lsp.midterm.question2;

public class Calculator {
	// Two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // All elements within an array of integers
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
