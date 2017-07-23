package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
public class ComplementaryDNATest {
    @Test
    public void test01() {
        assertEquals("TTTT", ComplementaryDNA.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", ComplementaryDNA.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", ComplementaryDNA.makeComplement("GTAT"));
    }
}