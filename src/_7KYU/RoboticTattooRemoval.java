package _7KYU;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/robotic-tattoo-removal/train/java
public class RoboticTattooRemoval {

    public static String[][] robot(String[][] skinScan) {

        for(int i = 0; i < skinScan.length; i++){
            for(int j = 0; j < skinScan[i].length; j++){
                if(skinScan[i][j].equals("X"))
                    skinScan[i][j] = "*";
            }
        }
        return skinScan; //code code code
    }

}
