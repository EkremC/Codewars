package _7KYU;

import _7KYU.SumOfOddNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class SumOfOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42));
    }

    @Test
    public void test2(){
        assertEquals(8, SumOfOddNumbers.rowSumOddNumbers(2));
    }

    @Test
    public void test3(){
        assertEquals(216, SumOfOddNumbers.rowSumOddNumbers(6));
    }

}