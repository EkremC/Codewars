package _6KYU;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class PersistentBugger {

    public static int persistence(long n) {
        int times = 0;

        if (n < 10) {
            return 0;
        }

        long returnValue = multiply(n);
        times++;
        while (returnValue >= 10) {
            returnValue = multiply(returnValue);
            times++;
        }

        return times;
    }

    private static int multiply(long n) {

        long nCopy = n;
        int multiplyValue = 1;
        while (nCopy > 0) {
            int mode = (int) nCopy % 10;
            multiplyValue *= mode;
            nCopy /= 10;
        }

        return multiplyValue;
    }


}
