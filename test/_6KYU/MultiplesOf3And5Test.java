package _6KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 23/07/2017.
 */
public class MultiplesOf3And5Test {

    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3And5().solution(10));
    }
}