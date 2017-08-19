package _5KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ekremcandemir on 01/08/2017.
 */
// https://www.codewars.com/kata/directions-reduction/train/java
public class DirectionsReduction {

    public static String[] dirReduc(String[] arr) {

        int length = arr.length;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        List<Integer> indexes = new ArrayList<>();

        boolean flag = false;



        for (int i = 0; i < length - 1; i++) {
            if(list.get(i).equals("NORTH") && list.get(i + 1).equals("SOUTH")
                    || list.get(i).equals("EAST") && list.get(i + 1).equals("WEST")
                    || list.get(i).equals("SOUTH") && list.get(i + 1).equals("NORTH")
                    || list.get(i).equals("WEST") && list.get(i + 1).equals("EAST")){
                indexes.add(i);
                indexes.add(i + 1);
                //list.remove(i + 1);
                //list.remove(i);
                flag = true;
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            list.remove(i);
        }

        if(indexes.size() > 1 && flag){
            dirReduc(list.toArray(new String[list.size()]));
        }

        if(list.isEmpty()) return new String[] {};

        return list.toArray(new String[list.size()]);

    }
}
