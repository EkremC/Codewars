package _6KYU;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f
public class YourOrderPlease {

    public static String order(String words) {
        String str = "";

        if(words.length() == 0)
            return str;

        String[] arr = words.split("\\s");
        String[] ret = new String[arr.length];

        for(String s : arr){
            String num = s.replaceAll("\\D+", "");
            ret[Integer.parseInt(num) - 1] = s;
        }

        for(String st : ret){
            str += st + " ";
        }

        return str.trim();
    }

}
