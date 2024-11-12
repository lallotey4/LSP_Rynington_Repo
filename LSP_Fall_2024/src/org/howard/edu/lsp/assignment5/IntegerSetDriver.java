package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.List;
public class IntegerSetDriver {
    public static void main(String[] args) {
        // Create IntegerSet set1 and add elements 1, 2, 3
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        // Print the contents of set1
        System.out.println("Value of Set1 is: " + set1.toString());
        
        // Print the smallest and largest elements in set1
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());
        // Create IntegerSet set2 and add elements 3, 4, 5
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        // Print the contents of set2
        System.out.println("Value of Set2 is: " + set2.toString());
        // Perform union of set1 and set2 and display the result
        System.out.println("Union of Set1 and Set2");
        System.out.println("Set1: " + set1.toString());
        System.out.println("Set2: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());
    }
}