package _6KYU;

import java.util.Arrays;

/**
 * Created by ekremcandemir on 23/09/2017.
 */
// https://www.codewars.com/kata/format-words-into-a-sentence/train/java
public class FormatWordsIntoASentence {
    public static String formatWords(String[] words) {
        if(words == null || words.length == 0 || (words.length == 1 && words[0].equals(""))) return "";
        if(words.length == 1) return words[0];

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            if(words[i].equals("")) continue;
            builder.append(words[i]).append(", ");
        }

        if(builder.length() == 0) return words[words.length - 1];
        if(words[words.length - 1].equals("")){
            builder.delete(builder.length() - (4 + words[words.length - 2].length()), builder.length() - (2 + words[words.length - 2].length()))
                    .append(" and ", builder.length() - (2 + words[words.length - 2].length()),  5)
                    .delete(builder.length() - 2, builder.length());

            return builder.toString();
        }
        builder.delete(builder.length() - 2, builder.length() - 1)
                .append("and ")
                .append(words[words.length - 1]);

        return builder.toString();


    }
}
