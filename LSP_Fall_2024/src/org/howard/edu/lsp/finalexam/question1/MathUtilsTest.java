package org.howard.edu.lsp.finalexam.question1;
/**
 * For these questions, I coded in Python, then asked ChatGPT to help me translate to the proper syntax, etc. 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testFactorialOfZero() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-5));
    }

    @Test
    public void testIsPrimeWithPrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPrime(7));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(4));
    }

    @Test
    public void testIsPrimeWithEdgeCase() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(1));
    }

    @Test
    public void testGcdWithPositiveNumbers() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(6, mathUtils.gcd(18, 24));
    }

    @Test
    public void testGcdWithZeroAndNonZeroNumber() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(6, mathUtils.gcd(0, 6));
    }

    @Test
    public void testGcdWithBothNumbersZero() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }
}
