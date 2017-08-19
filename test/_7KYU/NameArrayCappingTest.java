package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
public class NameArrayCappingTest {
    @Test
    public void downcase() {
        String[] strings = new String[] {"jo", "nelson", "jurie"};
        assertEquals(new String[] {"Jo", "Nelson", "Jurie"}, NameArrayCapping.capMe(strings));
    }
}