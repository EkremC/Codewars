package _6KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 23/07/2017.
 */
public class AreWeAlternateTest {
    @Test
    public void exampleTests() {
        assertEquals(true, AreWeAlternate.isAlt("amazon"));

    }

    @Test
    public void test(){
        assertEquals(false, AreWeAlternate.isAlt("apple"));
    }

    @Test
    public void test1(){
        assertEquals(false, AreWeAlternate.isAlt("wirejap"));

    }

}