package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertThrows;
public class IntegerSetTest {
   private IntegerSet set1;
   private IntegerSet set2;
   @BeforeEach
   public void setUp() {
       set1 = new IntegerSet();
       set2 = new IntegerSet();
   }
   @Test
   @DisplayName("Test case for clear")
   public void testClear() {
       set1.add(1);
       set1.add(2);
       set1.clear();
       assertTrue(set1.isEmpty(), "Set should be empty after clear");
   }
   @Test
   @DisplayName("Test case for length")
   public void testLength() {
       assertEquals(0, set1.length(), "Initial length should be 0");
       set1.add(1);
       assertEquals(1, set1.length(), "Length should be 1 after adding one element");
   }
   @Test
   @DisplayName("Test case for equals")
   public void testEquals() {
       set1.add(1);
       set1.add(2);
       set2.add(2);
       set2.add(1);
       assertTrue(set1.equals(set2), "Sets should be equal");
       set2.add(3);
       assertFalse(set1.equals(set2), "Sets should not be equal if elements differ");
   }
   @Test
   @DisplayName("Test case for contains")
   public void testContains() {
       set1.add(1);
       assertTrue(set1.contains(1), "Set should contain the added element");
       assertFalse(set1.contains(2), "Set should not contain an element not added");
   }
   @Test
   @DisplayName("Test case for largest")
   public void testLargest() {
       set1.add(1);
       set1.add(2);
       set1.add(3);
       assertEquals(3, set1.largest(), "Largest should return the maximum element");
       set1.clear();
       assertThrows(Exception.class, () -> set1.largest(), "Exception expected if set is empty");
   }
   @Test
   @DisplayName("Test case for smallest")
   public void testSmallest() {
       set1.add(1);
       set1.add(2);
       set1.add(3);
       assertEquals(1, set1.smallest(), "Smallest should return the minimum element");
       set1.clear();
       assertThrows(Exception.class, () -> set1.smallest(), "Exception expected if set is empty");
   }
   @Test
   @DisplayName("Test case for add")
   public void testAdd() {
       set1.add(1);
       assertTrue(set1.contains(1), "Set should contain added element");
       set1.add(1);
       assertEquals(1, set1.length(), "Duplicate adds should not increase set size");
   }
   @Test
   @DisplayName("Test case for remove")
   public void testRemove() {
       set1.add(1);
       set1.remove(1);
       assertFalse(set1.contains(1), "Element should be removed from set");
   }
   @Test
   @DisplayName("Test case for union")
   public void testUnion() {
       set1.add(1);
       set1.add(2);
       set2.add(2);
       set2.add(3);
       set1.union(set2);
       assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3), "Union should include all unique elements");
   }
   @Test
   @DisplayName("Test case for intersect")
   public void testIntersect() {
       set1.add(1);
       set1.add(2);
       set2.add(2);
       set2.add(3);
       set1.intersect(set2);
       assertTrue(set1.contains(2) && set1.length() == 1, "Intersection should include only common elements");
   }
   @Test
   @DisplayName("Test case for diff")
   public void testDiff() {
       set1.add(1);
       set1.add(2);
       set2.add(2);
       set2.add(3);
       set1.diff(set2);
       assertTrue(set1.contains(1) && !set1.contains(2), "Difference should exclude elements from set2");
   }
   @Test
   @DisplayName("Test case for complement")
   public void testComplement() {
       set1.add(1);
       set1.add(2);
       set2.add(2);
       set2.add(3);
       set1.complement(set2);
       assertTrue(set1.contains(3) && !set1.contains(1) && !set1.contains(2), "Complement should include elements in set2 not in set1");
   }
   @Test
   @DisplayName("Test case for isEmpty")
   public void testIsEmpty() {
       assertTrue(set1.isEmpty(), "Set should be initially empty");
       set1.add(1);
       assertFalse(set1.isEmpty(), "Set should not be empty after adding elements");
   }
   @Test
   @DisplayName("Test case for toString")
   public void testToString() {
       set1.add(1);
       set1.add(2);
       assertEquals("[1, 2]", set1.toString(), "toString should correctly display elements");
   }
}