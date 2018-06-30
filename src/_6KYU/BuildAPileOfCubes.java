package _6KYU;

// https://www.codewars.com/kata/5592e3bd57b64d00f3000047
public class BuildAPileOfCubes {

    public static long findNb(long m) {
        long sum = 0L;

        long i = 1;
        while(sum < m){
            sum += (i*i*i);
            i++;
        }

        return sum == m ? (i - 1) : -1;
    }

}
