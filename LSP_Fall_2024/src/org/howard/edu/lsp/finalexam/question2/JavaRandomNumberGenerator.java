package org.howard.edu.lsp.finalexam.question2;
import java.util.Random;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 */
public class JavaRandomNumberGenerator implements RandomNumberGenerator {
    
    private Random random;
    
    /**
     * Constructor initializes the random number generator.
     */
    public JavaRandomNumberGenerator() {
        this.random = new Random();
    }
    
    @Override
    public int generateRandomNumber() {
        // Returns a positive random integer
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}