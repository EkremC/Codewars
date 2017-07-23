package _6KYU;

import java.util.*;

/**
 * Created by ekremcandemir on 10/07/2017.
 */

// https://www.codewars.com/kata/550498447451fbbd7600041c/train/java

public class AreTheyTheSame {

    public static boolean comp(int[] a, int[] b) {


        if(a.length == 0 || b.length == 0)
            return false;

        if(a == null || b == null)
            return false;

        if(a.length != b.length)
            return false;


        for (int i = 0; i < a.length; i++) {
            a[i] = Math.abs(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = Math.abs(b[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            aList.add(a[i]);
        }

        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            bList.add(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if(Math.pow(aList.get(i), 2) != bList.get(i))
                return false;
        }

        /*

        Set<Integer> aSet = new LinkedHashSet<>();
        for (int i:
             a) {
            aSet.add(Math.abs(i));
        }

        Set<Integer> bSet = new LinkedHashSet<>();
        for (int i:
                b) {
            bSet.add(Math.abs(i));
        }

        if(aSet.size() != bSet.size())
            return false;

        Iterator<Integer> aIte = aSet.iterator();
        Iterator<Integer> bIte = bSet.iterator();

        while (aIte.hasNext() && bIte.hasNext()){
            int aPow = (int) Math.pow(aIte.next(), 2);
            if(aPow != bIte.next())
                return false;
        }
*/

        return true;
    }

}

/*
if(a == null && b == null)
        return true;

    if(a == null || b == null)
            return false;

    if(a.length == 0 && b.length == 0)
            return true;

    if(a.length == 0 || b.length == 0)
            return false;



        if(a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.abs(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = Math.abs(b[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            aList.add(a[i]);
        }

        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            bList.add(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if(Math.pow(aList.get(i), 2) != bList.get(i))
                return false;
        }

        return true;
 */