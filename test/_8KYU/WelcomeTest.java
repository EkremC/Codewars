package _8KYU;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class WelcomeTest {

    @Test
    public void exampleTest() {
        Assert.assertEquals("Your function should have returned 'Welcome'. Try again.","Welcome", Welcome.greet("english"));
        Assert.assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Welcome.greet("dutch"));
        Assert.assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
    }

}