package _6KYU;

import _6KYU.ReverseOrRotate;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class ReverseOrRotateTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");
        testing(ReverseOrRotate.revRot("1234", 0), "");
        testing(ReverseOrRotate.revRot("", 0), "");
        testing(ReverseOrRotate.revRot("1234", 5), "");
        String s = "733049910872815764";
        testing(ReverseOrRotate.revRot(s, 5), "330479108928157");
    }

}