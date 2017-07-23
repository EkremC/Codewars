package _7KYU;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
public class YouAreASquare {

    public static boolean isSquare(int n) {

        double sqrt = Math.sqrt(n);
        int sqrtInt = (int) sqrt;

        return Math.pow(sqrt, 2) == Math.pow(sqrtInt, 2);
    }
}
