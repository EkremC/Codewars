package _6KYU;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
// https://www.codewars.com/kata/sum-of-digits-slash-digital-root/train/java
public class SumOfDigitsRoot {

    public static int digital_root(int n) {
        if (n < 10) return n;

        int nTemp = n;
        int sum = 0;

        while (nTemp > 0) {
            sum += nTemp % 10;
            nTemp /= 10;
        }

        return digital_root(sum);

    }

}
