package _7KYU;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/partial-word-searching/train/java

public class PartialWordSearching {

    static String[] findWord(String x, String[] y) {

        List<String> returnList = new ArrayList<>();

        for (String s :
                y) {
            if (s.toLowerCase().contains(x)) {
                returnList.add(s);
            }
        }

        return returnList.size() == 0 ? new String[]{"Empty"} : returnList.toArray(new String[returnList.size()]);
    }

}
