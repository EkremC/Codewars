package _7KYU;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
// https://www.codewars.com/kata/shortest-word/train/java
public class ShortestWord {

    public static int findShort(String s) {

        String[] split = s.split(" ");
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < split.length; i++){
            if(split[i].length() < minLength) minLength = split[i].length();
        }

        return minLength;
    }

}
