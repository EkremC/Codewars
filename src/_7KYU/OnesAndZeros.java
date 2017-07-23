package _7KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ekremcandemir on 06/07/2017.
 */
// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

public class OnesAndZeros {

    public static void main(String[] args){
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int size = binary.size();
        int decimal = 0;
        int pow = 0;
        for (int i = size - 1; i >= 0 ; i--) {
            if(binary.get(i) == 1){
                decimal += Math.pow(2, pow);
            }

            pow++;
        }

        return decimal;
    }

}
