package _7KYU;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
// https://www.codewars.com/kata/area-of-a-circle/train/java
public class AreaOfACircle {
    public static double area(double radius) {
        if (radius <= 0) throw new IllegalArgumentException();
        return ((Math.PI * radius * radius) * 100) / 100;
    }
}
