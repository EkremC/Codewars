package _8KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
public class StringRepeatTest {
    @Test
    public void test4a() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", StringRepeat.repeatStr(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }

    @Test
    public void testNegativeRepeat() {
        assertEquals("", StringRepeat.repeatStr(-10, "kata"));
    }
}