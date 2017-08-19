package _7KYU;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
// https://www.codewars.com/kata/beginner-series-number-3-sum-of-numbers/train/java
public class BeginnerSeries3SumOfNumbers {

    public int GetSum(int a, int b) {
        int returnVal = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                returnVal += i;
            }
            return returnVal;
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                returnVal += i;
            }
            return returnVal;
        } else {
            return a;
        }
    }
}
