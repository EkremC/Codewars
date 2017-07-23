package _7KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
