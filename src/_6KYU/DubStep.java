package _6KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
// https://www.codewars.com/kata/dubstep/train/java
public class DubStep {

    public static String songDecoder(String song) {

        StringBuilder builder = new StringBuilder();
        Matcher matcher = Pattern.compile("(WUB)+").matcher(song);
        while (matcher.find()) {
            builder.replace(matcher.start(), matcher.end(), " ");

        }

        while (song.matches("(WUB)+")) {

        }

        return builder.toString();
    }
}
