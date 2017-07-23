package _6KYU;

import _6KYU.WhichAreIn;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 07/07/2017.
 */
public class WhichAreInTest {

    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test2() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "harp", "armstrong", "arp2" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test3(){
        String a[] = new String[]{"1295", "code", "1346", "1028", "ar"};
        String b[] = new String[]{"12951295", "ode", "46", "10281066", "par"};
        String r[] = new String[]{"1028", "1295", "ar"};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test4() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "arp", "live", "strong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

}


