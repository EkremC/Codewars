package _7KYU;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
// https://www.codewars.com/kata/square-every-digit/train/java
public class SquareEveryDigit {

    public int squareDigits(int n) {
        String[] strings = String.valueOf(n).split("");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            builder.append(String.valueOf((int) Math.pow(Integer.valueOf(strings[i]), 2)));
        }
        return Integer.valueOf(builder.toString());
    }
}
