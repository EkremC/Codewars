package _7KYU;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ekremcandemir on 19/08/2017.
 */
// https://www.codewars.com/kata/anagram-detection/train/java
public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if (test.isEmpty() || original.isEmpty()) return false;
        if (test.length() != original.length()) return false;
        Set<String> originalSet = new HashSet();
        test = test.toLowerCase();
        original = original.toLowerCase();
        for (int i = 0; i < original.length(); i++) {
            originalSet.add(original.substring(i, i + 1));
        }
        for (int i = 0; i < test.length(); i++) {
            if (originalSet.add(test.substring(i, i + 1))) return false;
        }
        return true;
    }
}
