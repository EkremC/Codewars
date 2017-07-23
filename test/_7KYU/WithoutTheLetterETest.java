package _7KYU;

import _7KYU.WithoutTheLetterE;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class WithoutTheLetterETest {
    @Test
    public void exampleTest() {
        assertEquals("1", WithoutTheLetterE.find_E("e"));
        assertEquals("4", WithoutTheLetterE.find_E("eljkleljlkjeljkle"));
        assertEquals("1", WithoutTheLetterE.find_E("English"));
        assertEquals("3", WithoutTheLetterE.find_E("EnglisheasdfE"));

    }
}