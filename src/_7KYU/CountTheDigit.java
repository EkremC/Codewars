package _7KYU;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class CountTheDigit {

    public static int nbDig(int n, int d) {

        int times = 0;

        for (int i = 0; i <= n; i++) {
            int nPow = (int) Math.pow(i, 2);

            Pattern pattern = Pattern.compile(String.valueOf(d));
            Matcher matcher = pattern.matcher(String.valueOf(nPow));

            while (matcher.find()){
                times++;
            }
        }
        return times;
    }


}
