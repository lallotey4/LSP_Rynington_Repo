package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents a set of integers and allows basic set operations like 
 * union, intersection, and difference.
 */
public class IntegerSet {

    // Store the set elements in an ArrayList
    private List<Integer> set;

    // Default constructor
    public IntegerSet() {
        set = new ArrayList<Integer>();  // Initialize the set as an empty list
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();  // Clear all elements from the set
    }

    /**
     * Returns the length (number of elements) in the set.
     * @return the size of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if this set is equal to another set.
     * Two sets are equal if they contain the same elements, regardless of order.
     * @param o the other object to compare
     * @return true if the sets are equal, false otherwise
     */
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
        }
        return false;
    }

    /**
     * Checks if the set contains a certain value.
     * @param value the value to check for
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);  // Check if the value exists in the set
    }

    /**
     * Returns the largest element in the set.
     * @return the largest value
     * @throws IllegalStateException if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty.");
        }

        int max = set.get(0);  // Assume first element is the largest
        for (int num : set) {
            if (num > max) {
                max = num;  // Update max if a larger number is found
            }
        }
        return max;
    }

    /**
     * Returns the smallest element in the set.
     * @return the smallest value
     * @throws IllegalStateException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty.");
        }

        int min = set.get(0);  // Assume first element is the smallest
        for (int num : set) {
            if (num < min) {
                min = num;  // Update min if a smaller number is found
            }
        }
        return min;
    }

    /**
     * Adds an item to the set if it is not already present.
     * @param item the integer to add to the set
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);  // Only add the item if it's not already in the set
        }
    }

    /**
     * Removes an item from the set if it is present.
     * @param item the integer to remove from the set
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));  // Remove the item if it exists
    }

    /**
     * Modifies this set to be the union of itself and another set.
     * @param intSetb the other set to perform union with
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num)) {
                set.add(num);  // Add elements from intSetb that aren't already in this set
            }
        }
    }

    /**
     * Modifies this set to be the intersection of itself and another set.
     * @param intSetb the other set to perform intersection with
     */
    public void intersect(IntegerSet intSetb) {
        set.removeIf(num -> !intSetb.set.contains(num));  // Keep only elements that exist in both sets
    }

    /**
     * Modifies this set to be the difference of itself and another set.
     * @param intSetb the other set to perform difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);  // Remove elements that exist in intSetb from this set
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return the string representation of the set
     */
    @Override
    public String toString() {
        return set.toString();  // Convert the set to a string format like [1, 2, 3]
    }
}
