package _7KYU;

/**
 * Created by ekremcandemir on 07/07/2017.
 */
// https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

public class StopgninnipSMysdroW {

    public static void main(String[] args){
        System.out.println(spinWords("Welcome"));
    }

    public static String spinWords(String sentence) {
        String[] split = sentence.split(" ");
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < split.length; i++) {
            if(split[i].length() >= 5){
                String reversed = new StringBuilder(split[i]).reverse().toString();
                if(i != 0)
                    builder.append(" " + reversed);
                else
                    builder.append(reversed);
            }else{
                if(i != 0)
                    builder.append(" " + split[i]);
                else
                    builder.append(split[i]);
            }
        }

        return builder.toString();
    }
}
