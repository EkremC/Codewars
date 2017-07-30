import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by ekremcandemir on 07/07/2017.
 */
public class Deneme {

    public static void main(String[] args){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher("1 2 3 4 5 a");

        if(matcher.find()){
            //System.out.println("found!");
        }


        int[] a = {};

        //System.out.println(a.length);

        long m = 1;
        for (int i = 42; i > 0 ; i--) {
            m *= i;
        }

        //System.out.println(m);

        String[][] ab = new String[][]{
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", "*", "*", " ", " ", " ", "*", "*", " ", " "},
                {" ", "*", " ", " ", "*", " ", "*", " ", " ", "*", " "},
                {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                {" ", "*", " ", " ", " ", "*", " ", " ", " ", "*", " "},
                {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                {" ", "*", " ", " ", " ", " ", " ", " ", " ", "*", " "},
                {" ", " ", "*", " ", " ", " ", " ", " ", "*", " ", " "},
                {" ", " ", " ", "*", " ", " ", " ", "*", " ", " ", " "},
                {" ", " ", " ", " ", "*", " ", "*", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "*", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
        };

        int column = ab[0].length;
        int row = ab[1].length;

//        System.out.println("col: " + column + " row: " + row);

        //System.out.println(Math.sqrt(26) % 1);

        String s = "bitcoin take over the world maybe who knows perhaps";
        List<String> list = Arrays.asList(s.split(" "));
        // System.out.println(list.stream().min(Comparator.comparingInt(String::length)));

        List<String> names =
                Arrays.asList("Ali","Veli","Selami","Cem","Zeynel","Can","Hüseyin");

        /*
        names.stream().forEach(name -> {
            System.out.println(name);
        }); */

        List<String > upper = names
                .stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        names
                .stream()
                .filter(name -> name.length() == 4)
                .forEach(System.out::println);

        String[] arr = {"a", "b", "c", "a"};

        Set<String> set = Arrays.stream(arr).collect(Collectors.toSet());

        //System.out.println(set.size());


        String[] st = {"123", "345", "34", "2345"};

        String[] str = {"asd", "st3a", "asdf9asdf"};

        //Arrays.stream(st).mapToInt(Integer::valueOf).filter(i -> i > 123).forEach(System.out::print);
        //Arrays.stream(st).filter(str -> str.contains("5")).mapToInt(Integer::parseInt).forEach(System.out::print);
        //Arrays.stream(st).mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
        //long size =  Arrays.stream(st).mapToInt(Integer::parseInt).filter(num -> num > 100).count();
        Arrays.stream(str)
                .filter(a1 -> a1.contains("f") && a1.length() > 5)
                .map(String::toUpperCase);
        //.forEach(System.out::println);

        /*
        Matcher matcher1 = Pattern.compile("(WUB)+").matcher("WUBWUBABCWUB");


        while (matcher1.find()){
            System.out.println(matcher1.start());
            System.out.println(matcher1.end());
        }
*/

        String word = "is2";

        if (word.matches("\\d"))
            System.out.println("eşleşti");
        else
            System.out.println("eşleşmedi");
    }
}
