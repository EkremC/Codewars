package _8KYU;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by ekremcandemir on 11/07/2017.
 */

// https://www.codewars.com/kata/do-i-get-a-bonus/train/java
public class DoIGetABonus {

    public static String bonusTime(final int salary, final boolean bonus) {
        int newSalary = salary;
        if(bonus){
            newSalary *= 10;
            return Currency.getInstance(Locale.UK).getSymbol(Locale.UK) + newSalary;

        }else{
            return Currency.getInstance(Locale.UK).getSymbol(Locale.UK) + newSalary;
        }
    }
}
