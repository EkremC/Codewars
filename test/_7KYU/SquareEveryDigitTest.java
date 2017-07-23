package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
public class SquareEveryDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
    }
}