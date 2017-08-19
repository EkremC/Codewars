package _6KYU;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
// https://www.codewars.com/kata/554a44516729e4d80b000012
public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        int months = 0;

        double startPriceNewDouble = startPriceNew;
        if (startPriceOld >= startPriceNew)
            return new int[]{months, startPriceOld - startPriceNew};


        startPriceOld += savingperMonth;
        startPriceNewDouble *= ((100 - percentLossByMonth) / 100);
        months++;

        while (startPriceOld < startPriceNewDouble) {

            if (months % 2 == 0 && months != 0) percentLossByMonth += 0.5;

            startPriceOld += savingperMonth;
            startPriceNewDouble *= ((100 - percentLossByMonth) / 100);
            months++;

        }


        return new int[]{months, startPriceOld - (int) startPriceNewDouble};
    }

}
