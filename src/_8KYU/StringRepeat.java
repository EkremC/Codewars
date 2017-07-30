package _8KYU;

/**
 * Created by ekremcandemir on 30/07/2017.
 */
// https://www.codewars.com/kata/string-repeat/train/java
public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {

        if (repeat <= 0 || string.isEmpty()) return "";

        StringBuilder builder = new StringBuilder();
        builder.append(string);

        for (int i = 0; i < repeat - 1; i++) {
            builder.append(string);
        }

        return builder.toString();
    }
}
