package _6KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
public class DubStepTest {
    @Test
    public void Test1() {
        assertEquals("ABC", new DubStep().songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", new DubStep().songDecoder("RWUBWUBWUBLWUB"));
    }
}