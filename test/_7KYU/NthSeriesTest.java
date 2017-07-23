package _7KYU;

import _7KYU.NthSeries;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class NthSeriesTest {

    @Test
    public void test1() {
        assertEquals(NthSeries.seriesSum(5), "1.57");
    }
    @Test
    public void test2() {
        assertEquals(NthSeries.seriesSum(9), "1.77");
    }
    @Test
    public void test3() {
        assertEquals(NthSeries.seriesSum(15), "1.94");
    }
}