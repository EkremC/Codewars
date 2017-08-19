package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
public class AnagramDetectionTest {
    @Test
    public void exampleTests() {
        AnagramDetection k = new AnagramDetection();

        assertEquals(true, k.isAnagram("foefet", "toffee"));
        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, k.isAnagram("Twoo", "Woot"));
    }
}