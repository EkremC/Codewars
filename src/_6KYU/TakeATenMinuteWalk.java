package _6KYU;

// https://www.codewars.com/kata/54da539698b8a2ad76000228
public class TakeATenMinuteWalk {

    public static boolean isValid(char[] walk) {
        if(walk.length != 10)
            return false;

        int ns = 0;
        int we = 0;

        for(char c : walk){
            if(c == 'n') ns++;
            else if(c == 's') ns--;
            else if(c == 'w') we++;
            else we--;
        }

        return ns == 0 && we == 0;
    }

}
