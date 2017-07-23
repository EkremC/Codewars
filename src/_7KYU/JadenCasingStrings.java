package _7KYU;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/jaden-casing-strings/train/java
public class JadenCasingStrings {

    public String toJadenCase(String phrase) {

        if(phrase == null || phrase.isEmpty()) return null;

        String[] splitArr = phrase.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < splitArr.length; i++) {
            builder.append(splitArr[i].substring(0, 1).toUpperCase() + splitArr[i].substring(1) + " ");
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();


    }
}
