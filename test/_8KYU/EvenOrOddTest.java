package _8KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(EvenOrOdd.even_or_odd(6), "Even");
        assertEquals(EvenOrOdd.even_or_odd(7), "Odd");
    }
}