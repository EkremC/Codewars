package _7KYU;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class NthSeries {

    public static String seriesSum(int n) {

        if (n == 0)
            return "0.00";

        double sum = 1;
        int denominator = 4;

        for (int i = 1; i < n; i++) {
            double fraction = (double) 1 / (double) (denominator);
            sum += fraction;
            denominator += 3;
        }

        return String.format("%.2f", sum);
    }

}
