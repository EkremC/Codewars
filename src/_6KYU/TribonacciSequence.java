package _6KYU;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
// https://www.codewars.com/kata/tribonacci-sequence/train/java
public class TribonacciSequence {

    public double[] tribonacci(double[] s, int n) {

        if (n == 0) return new double[]{};

        double[] arr = new double[n];

        if (n <= 3) {

            for (int i = 0; i < n; i++) {
                arr[i] = s[i];
                return arr;
            }
        }


        for (int i = 0; i < s.length; i++) {
            arr[i] = s[i];
        }


        for (int i = 1; i < n - 2; i++) {
            arr[i + 2] = arr[i - 1] + arr[i] + arr[i + 1];
        }

        return arr;

    }

}
