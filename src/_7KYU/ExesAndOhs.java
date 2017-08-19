package _7KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/exes-and-ohs/train/java
public class ExesAndOhs {

    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;

        String strLower = str.toLowerCase();

        if (!strLower.contains("x") && !str.contains("o")) return true;

        Matcher matcher = Pattern.compile("[x|o]").matcher(strLower);

        while (matcher.find()) {
            if (matcher.group(0).equals("x")) xCount++;
            else oCount++;
        }

        return xCount == oCount ? true : false;
    }

}
