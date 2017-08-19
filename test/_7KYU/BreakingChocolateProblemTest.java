package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
public class BreakingChocolateProblemTest {
    @Test
    public void myTests() {
        assertEquals(BreakingChocolateProblem.breakChocolate(5, 5) , 24);
        assertEquals(BreakingChocolateProblem.breakChocolate(1, 1) , 0);
    }
}