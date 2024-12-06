package org.howard.edu.lsp.finalexam.question2;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 */
public class CustomRandomNumberGenerator implements RandomNumberGenerator {
    
    private long seed;
    
    /**
     * Constructor initializes with a seed value.
     * 
     * @param seed The initial seed value.
     */
    public CustomRandomNumberGenerator(long seed) {
        this.seed = seed;
    }
    
    @Override
    public int generateRandomNumber() {
        // A simple custom random number generation algorithm (Linear Congruential Generator)
        seed = (seed * 1664525L + 1013904223L) % Integer.MAX_VALUE;
        return (int) seed + 1; // Ensure positive result
    }
}