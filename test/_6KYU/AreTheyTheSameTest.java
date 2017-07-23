package _6KYU;

import _6KYU.AreTheyTheSame;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class AreTheyTheSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreTheyTheSame.comp(a, b), true);
    }

    @Test
    public void test2() {
        int[] a = new int[]{2, 3, 3};
        int[] b = new int[]{4, 4, 9};
        assertEquals(AreTheyTheSame.comp(a, b), true);
    }
}