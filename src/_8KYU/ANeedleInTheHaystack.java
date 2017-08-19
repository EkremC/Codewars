package _8KYU;


/**
 * Created by ekremcandemir on 01/08/2017.
 */
// https://www.codewars.com/kata/a-needle-in-the-haystack/java
public class ANeedleInTheHaystack {

    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if(haystack[i] instanceof String && haystack[i].equals("needle")){
                index = i;
                break;
            }
        }

        return "found the needle at position " + index;
    }
}
