package _7KYU;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
public class YouAreASquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, YouAreASquare.isSquare(-1));
        assertEquals("3 isn't a square number", false,  YouAreASquare.isSquare(3));
        assertEquals("4 is a square number",    true,   YouAreASquare.isSquare(4));
        assertEquals("25 is a square number",   true,   YouAreASquare.isSquare(25));
        assertEquals("26 isn't a square number",false,  YouAreASquare.isSquare(26));
    }
    @Test
    public void shouldWorkForRandomSquareNumbers() throws Exception {
        Random rand = new Random();
        for(int i = 0; i < 100; ++i){
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            assertEquals(String.format("%d is a square number", randomSq), true, YouAreASquare.isSquare(randomSq));
        }
    }
}