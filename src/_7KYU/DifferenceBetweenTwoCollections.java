package _7KYU;

import java.util.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */

//https://www.codewars.com/kata/difference-between-two-collections/train/java
public class DifferenceBetweenTwoCollections {

    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {

        if (a.isEmpty() && !b.isEmpty()) {
            List<Character> returnList = new ArrayList<>();
            returnList.addAll(b);
            return returnList;
        }

        if (!a.isEmpty() && b.isEmpty()) {
            List<Character> returnList = new ArrayList<>();
            returnList.addAll(a);
            return returnList;
        }

        if (a.isEmpty() && b.isEmpty()) return new ArrayList<>();


        List<Character> list = findCommonElement(a, b);


        return list;
    }

    private static List<Character> findCommonElement(Collection<Character> a, Collection<Character> b) {
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();

        set.addAll(a);
        for (Character c :
                b) {
            if (set.add(c))
                list.add(c);
        }

        set.clear();

        set.addAll(b);
        for (Character c :
                a) {
            if (set.add(c))
                list.add(c);
        }

        Collections.sort(list);
        return list;
    }
}
