package _8KYU;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
// https://www.codewars.com/kata/convert-number-to-reversed-array-of-digits/train/java
public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {


        if (n < 10) return new int[]{(int) n};

        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            if (n % 10 < 0) list.add(0);
            else list.add((int) n % 10);
            n /= 10;
        }

        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
