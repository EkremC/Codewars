package _7KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
// https://www.codewars.com/kata/name-array-capping/train/java
public class NameArrayCapping {
    public static String[] capMe(String[] strings) {
        return Arrays.stream(strings)
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase())
                .toArray(String[]::new);
    }
}
