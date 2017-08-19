package _7KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 07/07/2017.
 */

// https://www.codewars.com/kata/5512e5662b34d88e44000060/train/java

public class BrokenSequence {

    public static void main(String[] args) {

    }

    public int findMissingNumber(String sequence) {
        int missing = 0;

        Pattern pattern = Pattern.compile("[^0-9 \\s]");
        Matcher matcher = pattern.matcher(sequence);

        if (matcher.find())
            return 1;

        if (sequence.isEmpty())
            return 0;

        String[] split = sequence.split(" ");

        if (Integer.valueOf(split[0]) != 1)
            return 1;

        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = 0; i < split.length - 1; i++) {
            if (Math.abs(Integer.valueOf(split[i]) - Integer.valueOf(split[i + 1])) != 1) {
                if (Integer.valueOf(split[i]) < Integer.valueOf(split[i + 1])) {
                    if (Integer.valueOf(split[i]) + 1 < min)
                        min = Integer.valueOf(split[i]) + 1;
                } else {
                    if (Integer.valueOf(split[i]) - 1 < min) {
                        min = Integer.valueOf(split[i]) - 1;
                    }
                }
                flag = true;
            }


        }
        if (!flag) {
            return 0;
        }

        if (min != Integer.MAX_VALUE)
            return min;

        return missing;
    }

}


/*
In short: an invalid sequence (a string with non numeric character) must return 1,
an already complete (or empty) sequence must return 0;
a broken sequence with more than one number missing should return the lowest missing number; otherwise return the missing number.
 */