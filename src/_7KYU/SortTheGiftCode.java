package _7KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
// https://www.codewars.com/kata/sort-the-gift-code/train/java
public class SortTheGiftCode {
    public String sortGiftCode(String code) {
        char[] chars = code.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
