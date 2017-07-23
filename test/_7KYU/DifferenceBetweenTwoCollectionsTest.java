package _7KYU;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 11/07/2017.
 */
public class DifferenceBetweenTwoCollectionsTest {

    @Test
    public void exampleTests() {
        assertEquals("should return empty for the same content", DifferenceBetweenTwoCollections.diff(list('a', 'b'), list('a', 'b')), list());
        assertEquals("should return A if B is empty", DifferenceBetweenTwoCollections.diff(list('a', 'b'), list()), list('a', 'b'));
        assertEquals("should return B if A is empty", DifferenceBetweenTwoCollections.diff(list(), list('a', 'b')), list('a', 'b'));
        assertEquals("should return empty for the empty content", DifferenceBetweenTwoCollections.diff(list(), list()), list());
        assertEquals("should return the last character", DifferenceBetweenTwoCollections.diff(list('a', 'b', 'z'), list('a', 'b')), list('z'));
        assertEquals("should return the sorted characters", DifferenceBetweenTwoCollections.diff(list('a', 'b', 'z', 'd', 'e', 'd'), list('a', 'b', 'j', 'j')),
                list('d', 'e', 'j', 'z'));
    }

    @Test
    public void randomTests() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println("i: " + i);
            int firstListSize = r.nextInt(20);
            int secondListSize = r.nextInt(20);

            char[] firstList = new char[firstListSize];
            for (int j = 0; j < firstListSize; j++) {
                firstList[j] = (char) (r.nextInt(26) + 'a');
            }

            char[] secondList = new char[secondListSize];
            for (int j = 0; j < secondListSize; j++) {
                secondList[j] = (char) (r.nextInt(26) + 'a');
            }

            List<Character> a = list(firstList);
            List<Character> b = list(secondList);
            assertEquals(DifferenceBetweenTwoCollections.diff(a, b), diff(a, b));
        }
    }

    public List<Character> list(char... elements) {
        ArrayList<Character> list = new ArrayList<>();
        for (char s : elements) {
            list.add(s);
        }
        return list;
    }

    public List<Character> diff(Collection<Character> a, Collection<Character> b) {
        TreeSet<Character> symmetricDiff = new TreeSet<>(a);
        symmetricDiff.addAll(b);
        TreeSet<Character> tmp = new TreeSet<>(a);
        tmp.retainAll(b);
        symmetricDiff.removeAll(tmp);
        return new ArrayList<>(symmetricDiff);
    }
}