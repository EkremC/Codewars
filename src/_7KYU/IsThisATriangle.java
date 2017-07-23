package _7KYU;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
// https://www.codewars.com/kata/is-this-a-triangle/train/java

public class IsThisATriangle {

    public static boolean isTriangle(int a, int b, int c){
        //if( a + b > c && a + c > b && b + c > a && Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a)
        //    return true;
        //else
          //  return false;

        return ( a + b > c && a + c > b && b + c > a && Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a) ? true : false;
    }
}
