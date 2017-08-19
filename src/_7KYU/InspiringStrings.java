package _7KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 11/07/2017.
 */

// https://www.codewars.com/kata/inspiring-strings/train/java
public class InspiringStrings {

    public static String longestWord(String wordString) {

        String[] splitArr = wordString.split(" ");
        String longestWord = "";

        for (int i = 0; i < splitArr.length; i++) {
            if (splitArr[i].length() >= longestWord.length())
                longestWord = splitArr[i];
        }

        return longestWord;
    }

}
