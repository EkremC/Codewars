package _6KYU;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ekremcandemir on 29/07/2017.
 */
// https://www.codewars.com/kata/duplicate-encoder/train/java
public class DuplicateEncoder {

    static String encode(String word) {

        Set<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (!set.add(word.charAt(i))) {
                builder.append(")");
                for (int j = 0; j < builder.length(); j++) {
                    if (((Character) word.charAt(j)).equals(word.charAt(i))) {
                        builder.replace(j, j + 1, ")");
                    }
                }
            } else {
                builder.append("(");
            }
        }

        return builder.toString();
    }
}
