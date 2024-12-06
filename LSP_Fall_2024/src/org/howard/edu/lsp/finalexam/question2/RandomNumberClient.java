package org.howard.edu.lsp.finalexam.question2;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 */
public class RandomNumberClient {
    
    public static void main(String[] args) {
        
        // Get the singleton instance of the RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();
        
        // Set Java random number generator as the strategy
        service.setRandomNumberGenerator(new JavaRandomNumberGenerator());
        System.out.println("Random number using Java Random: " + service.generateRandomNumber());
        
        // Set Custom random number generator as the strategy
        service.setRandomNumberGenerator(new CustomRandomNumberGenerator(12345L));
        System.out.println("Random number using Custom RNG: " + service.generateRandomNumber());
    }
}