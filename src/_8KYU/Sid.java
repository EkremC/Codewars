package _8KYU;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
// https://www.codewars.com/kata/i-love-you-a-little-a-lot-passionately-dot-dot-dot-not-at-all/train/java

public class Sid {

    private static String[] arr = new String[6];

    static {
        arr[0] = "I love you";
        arr[1] = "a little";
        arr[2] = "a lot";
        arr[3] = "passionately";
        arr[4] = "madly";
        arr[5] = "not at all";
    }

    public static String howMuchILoveYou(int nb_petals) {

        int index = nb_petals % 6;
        return arr[nb_petals - 1];
    }
}
