package _7KYU;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
// https://www.codewars.com/kata/descending-order/train/java
public class DescendingOrder {

    public static int sortDesc(final int num) {

        List<Integer> list = new ArrayList<>();

        int tempNum = num;

        while (tempNum > 0){
            list.add(tempNum % 10);
            tempNum /= 10;
        }

        Collections.sort(list);
        int returnVal = 0;
        int exp = 0;
        for (int i = 0; i < list.size(); i++){
            returnVal += list.get(i) * Math.pow(10, exp);
            exp++;
        }

        return returnVal;
    }
}
