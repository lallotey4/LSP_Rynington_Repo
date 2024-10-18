package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordOccurrence {

	public static void main(String[] args) {
		String fileName = "words.text"; 
        HashMap<String, Integer> wordOcc = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();

               
                if (word.length() > 3 && !isDigit(word)) {
             
                    wordOcc.put(word, wordOcc.getOrDefault(word, 0) + 1);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

      
        for (String key : wordOcc.keySet()) {
            System.out.println(key + ": " + wordOcc.get(key));
        }
    }


    private static boolean isDigit(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
