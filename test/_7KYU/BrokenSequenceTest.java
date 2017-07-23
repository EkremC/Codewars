package _7KYU;

import _7KYU.BrokenSequence;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 07/07/2017.
 */
public class BrokenSequenceTest {

    @Test
    public void test1() {
        assertEquals("", 4, new BrokenSequence().findMissingNumber("1 2 3 5"));
    }

    @Test
    public void test2() {
        assertEquals("",2, new BrokenSequence().findMissingNumber("1 3"));
    }

    @Test
    public void test3() {
        assertEquals("", 0, new BrokenSequence().findMissingNumber(""));
    }

    @Test
    public void test4() {
        assertEquals("", 1, new BrokenSequence().findMissingNumber("2 1 4 3 a"));
    }

    @Test
    public void test6(){
        assertEquals("", 0, new BrokenSequence().findMissingNumber("1 2 3 4 5 6"));
    }

}