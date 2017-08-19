package _6KYU;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by ekremcandemir on 07/07/2017.
 */
// https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        int arr1Size = array1.length;
        int arr2Size = array2.length;

        Set<String> returnSet = new HashSet<>();

        int in = 0;

        if (arr2Size > arr1Size || arr1Size == arr2Size) {
            for (int i = 0; i < arr1Size; i++) {
                for (int j = 0; j < arr2Size; j++) {
                    if (array2[j].contains(array1[i])) {
                        in++;
                        returnSet.add(array1[i]);
                        break;
                    }

                }
            }
        }

        if (in != 0) {
            List<String> list = new ArrayList<>();
            list.addAll(returnSet);
            Collections.sort(list);
            return list.toArray(new String[list.size()]);

        }

        //in = 0;
/*
        if(arr1Size > arr2Size ){
            for (int i = 0; i < arr2Size; i++) {
                for (int j = 0; j < arr1Size; j++) {
                    if(array1[j].contains(array2[i]))
                        in++;
                        returnSet.add(array2[i]);
                        break;
                }
            }
        }

        if(in != 0){
            List<String> list = new ArrayList<>();
            list.addAll(returnSet);
            Collections.sort(list);
            return list.toArray(new String[list.size()]);
        }
*/
        return new String[]{};

    }

}
