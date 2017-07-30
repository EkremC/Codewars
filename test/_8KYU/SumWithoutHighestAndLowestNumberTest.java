package _8KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
public class SumWithoutHighestAndLowestNumberTest {
    @Test
    public void BasicTests() {
        assertEquals(16, SumWithoutHighestAndLowestNumber.sum(new int[]{6, 2, 1, 8, 10}));
    }
}