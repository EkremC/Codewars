package _7KYU;

import java.math.BigInteger;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
// https://www.codewars.com/kata/sum-of-odd-numbers/train/java

public class SumOfOddNumbers {

    public static int rowSumOddNumbers(int n) {

        int sum = 0;
        int multiply = n * (n - 1);


        int index = multiply / 2;

        int startingValue = 2 * index + 1;

        sum = startingValue;

        for (int i = 1; i < n; i++) {
            sum += startingValue + (2 * i);
        }

        return sum;

    }

}


/*
1 -> index: 0 kacinciSayi: (1) baslangic sayisi: (1)
2 -> index: 1 kacinciSayi: (2) baslangic sayisi: (3)
3 -> index: 3 kacinciSayi: (4) baslangic sayisi:(7)
4 -> index: 6 kacinciSayi: (7) baslangic sayisi:(13)
5 -> index: 10 kacinciSayi: (11) baslangic sayisi:(21)
6 -> index: 15 kacinciSayi: (16) baslangic sayisi: (31)
 */

/*
                        1
                     3     5
                  7     9    11
               13    15    17    19
            21    23    25    27    29
         31    33    35    37    39    41
                     ...
                     */