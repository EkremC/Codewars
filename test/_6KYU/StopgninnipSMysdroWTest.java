package _6KYU; /**
 * Created by ekremcandemir on 07/07/2017.
 */

import _7KYU.StopgninnipSMysdroW;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopgninnipSMysdroWTest {

    @Test
    public void test() {
        assertEquals("emocleW", new StopgninnipSMysdroW().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopgninnipSMysdroW().spinWords("Hey fellow warriors"));
    }


}
