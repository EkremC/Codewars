package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
public class MostDigitsTest {
    @Test
    public void exampleTest1() {
        assertEquals(100, MostDigits.findLongest(new int[] {1, 10, 100}));
    }

    @Test
    public void exampleTest2() {
        assertEquals(9000, MostDigits.findLongest(new int[] {9000, 8, 800}));
    }

    @Test
    public void exampleTest3() {
        assertEquals(900, MostDigits.findLongest(new int[]  {8, 900, 500}));
    }

    @Test
    public void exampleTest4() {
        assertEquals(40000, MostDigits.findLongest(new int[] {3, 40000, 100}));
    }

    @Test
    public void exampleTest5() {
        assertEquals(100000, MostDigits.findLongest(new int[] {1, 200, 100000}));
    }

    @Test
    public void exampleTest6() {
        assertEquals(-10, MostDigits.findLongest(new int[] {-10, 1, 0, 1, 10}));
    }

    @Test
    public void exampleTest7() {
        assertEquals(1479243320, MostDigits.findLongest(new int[] {1479243320, 1, 0, 1, -1006611551}));
    }

    @Test
    public void exampleTest8() {
        assertEquals(-1645873630, MostDigits.findLongest(new int[] {-538046219,1, 0, 1,-1645873630}));
    }


}