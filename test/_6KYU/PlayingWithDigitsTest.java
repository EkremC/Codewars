package _6KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 23/07/2017.
 */
public class PlayingWithDigitsTest {
    @Test
    public void Test1() {
        assertEquals(1, PlayingWithDigits.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, PlayingWithDigits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }
}