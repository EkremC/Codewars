package _7KYU;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/most-digits/train/java
public class MostDigits {

    public static int findLongest(int[] numbers) {
        int mostDigits = Integer.MIN_VALUE;
        int length = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("-")) {
                if (list.get(i).length() - 1 > length) {
                    length = list.get(i).length() - 1;
                    mostDigits = Integer.valueOf(list.get(i));
                }
            } else {
                if (list.get(i).length() > length) {
                    length = list.get(i).length();
                    mostDigits = Integer.valueOf(list.get(i));
                }
            }

        }

        return mostDigits;
    }

}
