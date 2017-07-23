package _7KYU;

import java.util.*;


/**
 * Created by ekremcandemir on 13/07/2017.
 */
// https://www.codewars.com/kata/two-to-one/train/java
public class TwoToOne {

    public static String longest (String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < charArray1.length; i++) {
            set.add(charArray1[i]);
        }
        for (int i = 0; i < charArray2.length; i++) {
            set.add(charArray2[i]);
        }

        List<Character> list = new ArrayList<>(set);
        Collections.sort(list);
        StringBuilder builder = new StringBuilder();
        for(char c : list){
            builder.append(c);
        }

        return builder.toString();
    }

}
