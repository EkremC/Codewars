package _7KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
public class GreetMeTest {
    GreetMe greetme = new GreetMe();
    @Test
    public void basicTests() {
        assertEquals(greetme.greet("riley"), "Hello Riley!");
    }
}