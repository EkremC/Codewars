package _8KYU;

/**
 * Created by ekremcandemir on 31/07/2017.
 */
// https://www.codewars.com/kata/return-negative/train/java
public class ReturnNegative {

    public static int makeNegative(final int x) {

        if (x == 0) return 0;

        int a = x;

        return (a > 0) ? (-a) : a;
    }

}
