package _7KYU;

/**
 * Created by ekremcandemir on 13/07/2017.
 */
// https://www.codewars.com/kata/growth-of-a-population/train/java
public class GrowthOfAPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {

        int year = 0;
        double perc = percent / 100;

        while (p0 < p){
            p0 += (p0 * perc) + aug;
            year++;
        }
        return year;
    }

}
