package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a set of integers and allows basic set operations like 
 * union, intersection, difference, and complement.
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
     * @param otherSet the other IntegerSet to compare
     * @return true if the sets are equal, false otherwise
     */
    public boolean equals(IntegerSet otherSet) {
        return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
    }

    /**
     * Checks if the set contains a certain value.
     * @param value the value to check for
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * @return the largest value
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty.");
        }

        int max = set.get(0);
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Returns the smallest element in the set.
     * @return the smallest value
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty.");
        }

        int min = set.get(0);
        for (int num : set) {
            if (num < min) {
                min = num;
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
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it is present.
     * @param item the integer to remove from the set
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Modifies this set to be the union of itself and another set.
     * @param intSetb the other set to perform union with
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }
    }

    /**
     * Modifies this set to be the intersection of itself and another set.
     * @param intSetb the other set to perform intersection with
     */
    public void intersect(IntegerSet intSetb) {
        set.removeIf(num -> !intSetb.set.contains(num));
    }

    /**
     * Modifies this set to be the difference of itself and another set.
     * @param intSetb the other set to perform difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Modifies this set to be the complement of itself with respect to another set.
     * The complement is defined as elements in intSetb that are not in this set.
     * @param intSetb the universal set to use for complement
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (int num : intSetb.set) {
            if (!this.set.contains(num)) {
                complementSet.add(num);
            }
        }
        set = complementSet;
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
        return set.toString();
    }
}
