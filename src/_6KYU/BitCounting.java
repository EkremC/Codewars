package _6KYU;

// https://www.codewars.com/kata/526571aae218b8ee490006f4
public class BitCounting {

    public static int countBits(int n){
        int count = 0;

        while(n != 0){
            if((n & 1) == 1)
                count++;

            n = n >>> 1;
        }

        return count;
    }

}
