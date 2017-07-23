package _5KYU;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
// https://www.codewars.com/kata/convert-string-to-camel-case/train/java

public class ConvertStringToCamelCase {

    static String toCamelCase(String s){

        String[] splitArr = {};

        if(s.contains("-")){
            splitArr = s.split("-");
        }else if(s.contains("_")){
            splitArr = s.split("_");
        }

        StringBuilder returnStr = new StringBuilder();

        returnStr.append(splitArr[0]);

            for (int i = 1; i < splitArr.length; i++) {
                char a = Character.toUpperCase(splitArr[i].charAt(0));
                splitArr[i] = a + splitArr[i].substring(1);
                returnStr.append(splitArr[i]);
            }

        return returnStr.toString();

        }
    }

