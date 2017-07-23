package _7KYU;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/covfefe/train/java
public class Covfefe {

    public static String covfefe(String tweet) {

        boolean coverage = false;
        String[] arr = tweet.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("coverage")){
                arr[i] = "covfefe";
                coverage = true;
            }
        }
        String returnVal = "";
        if(coverage){
            for (int i = 0; i < arr.length - 1; i++) {
                returnVal += arr[i] + " ";
            }
            returnVal += arr[arr.length - 1];

            return returnVal;
        }else {
            tweet += " covfefe";
            return tweet;
        }
        
    }

}
