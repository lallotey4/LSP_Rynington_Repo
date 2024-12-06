package org.howard.edu.lsp.finalexam.question2;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 */
public class RandomNumberService {
    
    // The single instance of the service
    private static RandomNumberService instance;
    
    // The strategy used for generating random numbers
    private RandomNumberGenerator generator;
    
    /**
     * Private constructor to enforce singleton pattern.
     */
    private RandomNumberService() {
    }
    
    /**
     * Returns the singleton instance of the RandomNumberService.
     * 
     * @return The singleton instance of the service.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }
    
    /**
     * Sets the random number generator strategy.
     * 
     * @param generator The random number generator strategy.
     */
    public void setRandomNumberGenerator(RandomNumberGenerator generator) {
        this.generator = generator;
    }
    
    /**
     * Generates a random number using the current strategy.
     * 
     * @return A positive random integer.
     */
    public int generateRandomNumber() {
        return generator.generateRandomNumber();
    }
}