package _7KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
// https://www.codewars.com/kata/remove-duplicates/train/java
public class RemoveDuplicates {
    public static int[] unique(int[] integers) {
        return Arrays.stream(integers).distinct().toArray();
    }
}
