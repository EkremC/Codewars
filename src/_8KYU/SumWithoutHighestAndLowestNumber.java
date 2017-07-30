package _8KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
// https://www.codewars.com/kata/sum-without-highest-and-lowest-number/train/java
public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers) {

        if (numbers == null || numbers.length == 1) return 0;


        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }

        return sum;
    }

}
