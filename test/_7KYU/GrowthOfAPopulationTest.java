package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
public class GrowthOfAPopulationTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(GrowthOfAPopulation.nbYear(1500, 5, 100, 5000),15);
        testing(GrowthOfAPopulation.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(GrowthOfAPopulation.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }

}