package _6KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
// https://www.codewars.com/kata/your-order-please/train/java
public class YourOrder {

    public static String order(String words) {
        String[] split = words.split(" ");
        String[] returnArr = new String[split.length];

        if (!split[0].matches("\\d+")) return "";

        Pattern pattern = Pattern.compile("[0-9]");

        for (String str : split) {
            Matcher matcher = pattern.matcher(str);
            int a = Integer.valueOf(matcher.group(1));
            returnArr[a - 1] = str;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < returnArr.length - 1; i++) {
            builder.append(returnArr[i] + " ");
        }

        return builder.append(returnArr[split.length]).toString();
    }
}
