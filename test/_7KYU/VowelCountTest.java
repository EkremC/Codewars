package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
public class VowelCountTest {

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }
}