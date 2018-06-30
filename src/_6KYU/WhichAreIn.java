package _6KYU;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by ekremcandemir on 07/07/2017.
 */
// https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> set = new TreeSet<>();
        for(String s1: array1){
            for(String s2 : array2){
                if(s2.contains(s1)){
                    set.add(s1);
                    break;
                }
            }
        }
        return set.toArray(new String[set.size()]);
    }

}
