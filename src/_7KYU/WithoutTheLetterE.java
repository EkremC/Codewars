package _7KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class WithoutTheLetterE {

    public static String find_E(String str) {

        if (str.isEmpty()) return "";
        if (str.equals(null)) return null;

        int counter = 0;
        String a = str.toLowerCase();
        Pattern pattern = Pattern.compile("e");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find())
            counter++;
        return String.valueOf(counter);
    }

}
