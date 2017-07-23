package _7KYU;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class CountAllTheSheepOnFarmInTheHeightsOfNewZealand {

    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {

        int coming = 0;

        for (int i:
             fridayNightCounting) {
            coming += i;
        }

        for (int i:
                saturdayNightCounting) {
            coming += i;
        }

        return sheepsTotal - coming;
    }
}
