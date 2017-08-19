package _7KYU;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ekremcandemir on 11/07/2017.
 */

// https://www.codewars.com/kata/sectional-array-sort/train/java
public class SectionalArraySort {

    static int[] sort(final int[] array, final int start, final int... length) {

        if (array.length == 0) return new int[]{};

        if (length.length != 0 && start + length[0] > array.length) return array;

        List<Integer> tempList = new ArrayList<>();
        if (length.length == 0) {
            for (int i = start; i < array.length; i++) {
                tempList.add(array[i]);
            }

            Collections.sort(tempList);

            int tempStart = start;
            for (int i :
                    tempList) {
                array[tempStart] = i;
                tempStart++;
            }

            return array;
        } else {
            for (int i = start; i < (start + length[0]); i++) {
                tempList.add(array[i]);
            }
            Collections.sort(tempList);

            int tempStart = start;
            for (int i :
                    tempList) {
                array[tempStart] = i;
                tempStart++;
            }
            return array;
        }
    }
}
