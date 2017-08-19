package _7KYU;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
// https://www.codewars.com/kata/find-the-next-perfect-square/train/java
public class FindTheNextPerfectSquare {

    public static long findNextSquare(long sq) {

        double sqrt = Math.sqrt(sq);
        long sqrtLong = (long) sqrt;

        if (Math.pow(sqrt, 2) != Math.pow(sqrtLong, 2)) return -1;


        return (long) Math.pow(sqrtLong + 1, 2);
    }


}
