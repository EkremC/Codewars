package _7KYU;

import _7KYU.InspiringStrings;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class InspiringStringsTest {

    @Test
    public void tests() {
        assertEquals("fgh", InspiringStrings.longestWord("a b c d e fgh"));
        assertEquals("three", InspiringStrings.longestWord("one two three"));
        assertEquals("grey", InspiringStrings.longestWord("red blue grey"));
    }
}