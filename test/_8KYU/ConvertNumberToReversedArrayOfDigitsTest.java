package _8KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
public class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
    }

    @Test
    public void tests1() {
        assertArrayEquals(new int[]{1, 3, 2, 5, -3}, ConvertNumberToReversedArrayOfDigits.digitize(-35231));
    }
}