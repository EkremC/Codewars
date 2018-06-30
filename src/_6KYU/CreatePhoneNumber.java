package _6KYU;

// https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        String s = "(";

        for(int i = 0; i <=2; i++ ){
            s += numbers[i];
        }
        s += ") ";

        for(int i = 3; i <= 5; i++){
            s += numbers[i];
        }
        s += "-";

        for(int i = 6; i < numbers.length; i++){
            s += numbers[i];
        }

        return s;
    }

}
