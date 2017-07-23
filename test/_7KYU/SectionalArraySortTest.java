package _7KYU;

import _7KYU.SectionalArraySort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class SectionalArraySortTest {

    private static void test(final int[] expected, final int[] input, final int start, final int... length) {
        assertArrayEquals("For input " + Arrays.toString(input) + " with start = " + start +
                        " and length " + (length.length == 1 ? "= " + length[0] : "not given") + ' ',
                expected, SectionalArraySort.sort(input, start, length));
    }

    @Test
    public void basicTests() {
        test(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 2);
        test(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8);
        test(new int[]{9, 7, 1, 2, 3, 4, 5, 8, 6}, new int[]{9, 7, 4, 2, 5, 3, 1, 8, 6}, 2, 5);
        test(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8, 3);
        test(new int[]{}, new int[]{}, 0);
    }

    @Test
    public void test(){
        test(new int[]{}, new int[]{}, 0);
    }

}