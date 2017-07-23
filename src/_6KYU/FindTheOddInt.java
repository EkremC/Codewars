package _6KYU;

import java.util.*;

/**
 * Created by ekremcandemir on 23/07/2017.
 */
// https://www.codewars.com/kata/find-the-odd-int/train/java
public class FindTheOddInt {

    public static int findIt(int[] A) {

        Arrays.sort(A);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                int value = map.get(A[i]);
                map.put(A[i], value + 1);
            } else {
                map.put(A[i], 1);
            }
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((int) pair.getValue() % 2 == 1)
                return (int) pair.getKey();
        }

        return 0;

    }
}
