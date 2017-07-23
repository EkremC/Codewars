package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
public class FindTheNextPerfectSquareTest {

    @Test
    public void test1() {
        assertEquals(144, FindTheNextPerfectSquare.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, FindTheNextPerfectSquare.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, FindTheNextPerfectSquare.findNextSquare(114));
    }
}