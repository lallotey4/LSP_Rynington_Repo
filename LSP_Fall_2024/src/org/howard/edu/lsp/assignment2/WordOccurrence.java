package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordOccurrence {

	public static void main(String[] args) {
		String fileName = "words.text"; // Replace with the path to your text file
        HashMap<String, Integer> wordOcc = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase(); // Read next word and convert to lowercase

                if (!wordOcc.containsKey(word) && word.length() > 3) {
                    if (!isDigit(word)) {
                        wordOcc.put(word, 1); // Add new word with count 1
                    }
                    if (wordOcc.containsKey(word) && word.length() > 3) {
                        wordOcc.put(word, wordOcc.get(word) + 1); // Increment existing word count
                    }
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
