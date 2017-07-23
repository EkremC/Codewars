package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
public class JadenCasingStringsTest {
    JadenCasingStrings jadenCase = new JadenCasingStrings();

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", jadenCase.toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(""));
    }


}