package _6KYU;

import _6KYU.BowlingPins;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
public class BowlingPinsTest {
    @Test
    public void exampleTests()
    {
        BowlingPins bowling = new BowlingPins();
        int[] testArray = new int[]{1,2,3};
        assertEquals("I I I I\n I I I \n       \n       ", bowling.bowlingPins(testArray));

        testArray = new int[]{3,5,9};
        assertEquals("I I   I\n I   I \n  I    \n   I   ", bowling.bowlingPins(testArray));
    }
}