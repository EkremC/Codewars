package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 12/08/2017.
 */
public class SortArrays1Test {
    @Test
    public void intArrayTests() {
        int[] ai={1,2,3};
        int[] uai={2,3,1};
        assertEquals(ai[0], SortArrays1.sortArray(uai)[0]);
        assertEquals(ai[1], SortArrays1.sortArray(uai)[1]);
        assertEquals(ai[2], SortArrays1.sortArray(uai)[2]);
    }
}