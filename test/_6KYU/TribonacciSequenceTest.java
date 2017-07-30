package _6KYU;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
public class TribonacciSequenceTest {


    private TribonacciSequence variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new TribonacciSequence();
    }

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, variabonacci.tribonacci(new double[]{1, 1, 1}, 10));
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, variabonacci.tribonacci(new double[]{0, 0, 1}, 10));
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, variabonacci.tribonacci(new double[]{0, 1, 1}, 10));
    }

    @Test
    public void test() {
        assertArrayEquals(new double[]{1, 2, 3, 4}, variabonacci.tribonacci(new double[]{12, 3, 5}, 14));
    }

    private void assertArrayEquals(double[] expecteds, double[] actuals) {
        for (int i = 0; i < actuals.length; i++)
            assertEquals(expecteds[i], actuals[i], 1e-10);
    }
}