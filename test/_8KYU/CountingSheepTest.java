package _8KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
public class CountingSheepTest {
    Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new CountingSheep().countSheeps(array1));
    }
}