package _6KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
public class DuplicateEncoderTest {

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }

}