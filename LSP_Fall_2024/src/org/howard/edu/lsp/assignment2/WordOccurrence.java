package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordOccurrence {

	public static void main(String[] args) {
		String fileName = "words.text"; // Ensure this is the correct file path
        HashMap<String, Integer> wordOcc = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase(); // Read next word and convert to lowercase

                // Check if the word length is greater than 3 and not a digit
                if (word.length() > 3 && !isDigit(word)) {
                    // Update the word count
                    wordOcc.put(word, wordOcc.getOrDefault(word, 0) + 1);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Print word occurrences
        for (String key : wordOcc.keySet()) {
            System.out.println(key + ": " + wordOcc.get(key));
        }
    }

    // Helper method to check if a string is a digit
    private static boolean isDigit(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
