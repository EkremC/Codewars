package _8KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 31/07/2017.
 */
public class ReturnNegativeTest {
    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-9, ReturnNegative.makeNegative(-9));
    }

    @Test
    public void test3() {
        assertEquals(0, ReturnNegative.makeNegative(0));
    }
}