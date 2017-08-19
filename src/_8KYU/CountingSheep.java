package _8KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
// https://www.codewars.com/kata/counting-sheep-dot-dot-dot/train/java
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(a -> a != null && a == true).count();
    }
}
