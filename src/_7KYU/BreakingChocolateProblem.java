package _7KYU;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
// https://www.codewars.com/kata/breaking-chocolate-problem/train/java
public class BreakingChocolateProblem {
    public static int breakChocolate(int n, int m) {
        if (n == 0 || m == 0) return 0;
        return (m - 1) + (m * (n - 1));
    }
}
