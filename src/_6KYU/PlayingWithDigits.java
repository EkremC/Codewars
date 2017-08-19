package _6KYU;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by ekremcandemir on 23/07/2017.
 */
// https://www.codewars.com/kata/playing-with-digits/train/java
public class PlayingWithDigits {

    public static long digPow(int n, int p) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        int nTemp = n;
        while (nTemp > 0) {
            list.add(nTemp % 10);
            nTemp /= 10;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            sum += Math.pow(list.get(i), p);
            p++;
        }

        if (sum % n == 0) {
            return sum / n;
        } else
            return -1;


    }
}
