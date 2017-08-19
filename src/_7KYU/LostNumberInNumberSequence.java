package _7KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
// https://www.codewars.com/kata/lost-number-in-number-sequence/train/java

public class LostNumberInNumberSequence {

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {

        if (arr.length == mixedArr.length)
            return 0;

        if (arr == null)

            Arrays.sort(arr);
        Arrays.sort(mixedArr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != mixedArr[i]) {
                return arr[i];
            }
        }

        return 0;

    }

}
