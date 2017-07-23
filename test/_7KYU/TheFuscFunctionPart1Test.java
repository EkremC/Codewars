package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class TheFuscFunctionPart1Test {
    @Test
    public void tests() {
        assertEquals(0, TheFuscFunctionPart1.fusc(0));
        assertEquals(1, TheFuscFunctionPart1.fusc(1));
        assertEquals(21, TheFuscFunctionPart1.fusc(85));
    }
}