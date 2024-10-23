package org.howard.edu.lsp.midterm.question2;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc.
 * The Calculator class provides utility methods to sum different types of numbers.
 * New line to help commit
 */
public class Calculator {

    /**
     * Sums two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sums two double values.
     * 
     * @param a the first double
     * @param b the second double
     * @return the sum of the two double values
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sums all elements in an array of integers.
     * 
     * @param arr the array of integers
     * @return the sum of all elements in the array
     */
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}
