package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;

/**
 * The MapUtilitiesDriver class is used to test the MapUtilities class.
 */
public class MapUtilitiesDriver {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Felix", "Fine");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Felix", "Fine");
        map2.put("Bob", "Happy");
        map2.put("Mary", "Ecstatic");

        System.out.println("Number of common key/value pairs is: " + 
            MapUtilities.commonKeyValuePairs(map1, map2)); // Output: 2
    }
}
