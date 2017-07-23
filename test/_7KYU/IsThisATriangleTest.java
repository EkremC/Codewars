package _7KYU;

import _7KYU.IsThisATriangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class IsThisATriangleTest {

    @Test
    public void publicTests() {
        assertEquals(IsThisATriangle.isTriangle(1,2,2), true);
        assertEquals(IsThisATriangle.isTriangle(7,2,2), false);
    }

}