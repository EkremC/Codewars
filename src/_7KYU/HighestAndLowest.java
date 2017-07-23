package _7KYU;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/highest-and-lowest/train/java
public class HighestAndLowest {

    public static String HighAndLow(String numbers) {
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        String[] split = numbers.split(" ");
        for (int i = 0; i < split.length; i++) {
            if(Integer.valueOf(split[i]) < minNumber)
                minNumber = Integer.valueOf(split[i]);
            if(Integer.valueOf(split[i]) > maxNumber)
                maxNumber = Integer.valueOf(split[i]);
        }
        return maxNumber + " " + minNumber;
    }

}
