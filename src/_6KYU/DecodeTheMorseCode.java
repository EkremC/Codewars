package _6KYU;

// https://www.codewars.com/kata/54b724efac3d5402db00065e
public class DecodeTheMorseCode {

    public static String decode(String morseCode) {
        String[] arr = morseCode.trim().split("   ");

        if(arr.length == 0){
            return MorseCode.get(morseCode);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            for(String s : arr[i].split("\\s")){
                sb.append(MorseCode.get(s));
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }

}
