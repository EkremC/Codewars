package _8KYU;

import _8KYU.Sid;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class SidTest {

    @Test
    public void test1() {
        assertEquals(Sid.howMuchILoveYou(1), "I love you");
        assertEquals(Sid.howMuchILoveYou(2), "a little");
        assertEquals(Sid.howMuchILoveYou(6), "not at all");
    }
}