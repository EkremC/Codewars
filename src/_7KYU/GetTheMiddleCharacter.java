package _7KYU;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/get-the-middle-character/train/java
public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {

        if (word.length() % 2 == 1) {
            return word.substring((word.length() / 2), (word.length() / 2) + 1);
        } else {
            return word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
        }

    }
}
