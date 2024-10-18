package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc.
 * The MapUtilities class provides utility methods for working with HashMaps.
 */
public class MapUtilities {
    /**
     * Returns the number of common key/value pairs between two HashMaps.
     * 
     * @param map1 the first HashMap
     * @param map2 the second HashMap
     * @return the number of common key/value pairs, or 0 if either map is empty
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0; // Return 0 if either map is empty
        }

        int commonCount = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++; // Increment if both key and value match
            }
        }
        return commonCount;
    }
}

