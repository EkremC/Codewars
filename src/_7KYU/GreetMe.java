package _7KYU;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
// https://www.codewars.com/kata/greet-me/train/java
public class GreetMe {
    public static String greet(String name) {
        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
