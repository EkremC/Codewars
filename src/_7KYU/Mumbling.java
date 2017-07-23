package _7KYU;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/mumbling/train/java
public class Mumbling {

    public static String accum(String s) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for(int j = 0; j < i + 1 ; j++){
                if(j != 0){
                    builder.append(s.substring(i, i + 1).toLowerCase());
                }else{
                    builder.append(s.substring(i, i + 1).toUpperCase());
                }
            }
            if(i != s.length() - 1)
                builder.append("-");
        }

        return builder.toString();
    }

}
