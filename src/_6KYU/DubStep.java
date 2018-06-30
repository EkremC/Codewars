package _6KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
// https://www.codewars.com/kata/dubstep/train/java
public class DubStep {

    public static String SongDecoder (String song)
    {
        String[] arr = song.split("(WUB)+");
        String ret = "";
        for(String s : arr){
            ret += " " + s;
        }

        return ret.trim();
    }
}
