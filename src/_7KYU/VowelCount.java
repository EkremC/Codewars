package _7KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/vowel-count/train/java
public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;

        Matcher matcher = Pattern.compile("a|e|i|o|u").matcher(str);

        while (matcher.find()) {
            vowelsCount++;
        }


        return vowelsCount;
    }

}
