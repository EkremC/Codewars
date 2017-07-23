package _5KYU;

import _5KYU.ConvertStringToCamelCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class ConvertStringToCamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    public void Test1() {
        String input = "right_left";
        System.out.println("input: "+input);
        assertEquals("rightLeft", ConvertStringToCamelCase.toCamelCase(input));
    }

}