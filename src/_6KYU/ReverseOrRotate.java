package _6KYU;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
// https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991/train/java

public class ReverseOrRotate {

    public static String revRot(String strng, int sz) {

        if (sz <= 0 || strng.isEmpty()) return "";

        if (sz > strng.length()) return "";

        String[] str = new String[strng.length() / sz];

        int startIndex = 0;
        int endIndex = startIndex + sz;

        for (int i = 0; i < strng.length() / sz; i++) {
            if (endIndex > strng.length()) break;
            str[i] = strng.substring(startIndex, endIndex);
            startIndex += sz;
            endIndex = startIndex + sz;
        }

        String returnVal = "";

        for (int i = 0; i < str.length; i++) {
            if (isDivisibleByTwo(str[i])) {
                returnVal += reverse(str[i]);
            } else {
                returnVal += rotate(str[i]);
            }
        }

        return returnVal;
    }

    private static boolean isDivisibleByTwo(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = (int) s.charAt(i);
            sum += Math.pow(value, 3);
        }

        return (sum % 2) == 0;
    }

    private static String rotate(String s) {
        String sb = s.substring(0, 1);
        String sb2 = s.substring(1, s.length());

        return sb2 + sb;
    }

    private static String reverse(String s) {

        return new StringBuilder(s).reverse().toString();
    }

}
