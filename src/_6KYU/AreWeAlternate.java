package _6KYU;

/**
 * Created by ekremcandemir on 23/07/2017.
 */
// https://www.codewars.com/kata/are-we-alternate/train/java
public class AreWeAlternate {
    public static boolean isAlt(String word) {
        //make note that 'y' should not be treated as vowel
        //your code here

        int lastVowelIndex = 0;
        int lastConsonantIndex = 0;
        boolean firstVowel = false;
        boolean firstConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            if(firstVowel && firstConsonant)
                break;

            if(word.substring(i, i + 1).matches("a|e|i|o|u") && !firstVowel){
                    lastVowelIndex = i;
                    firstVowel = true;
            } else if(!firstConsonant){
                lastConsonantIndex = i;
                firstConsonant = true;
            }

        }

        for (int i = 0; i < word.length(); i++) {
            if(word.substring(i, i + 1).matches("a|e|i|o|u")){
                if(word.substring(i, i + 1).compareTo(word.substring(lastVowelIndex, lastVowelIndex + 1)) < 0){
                    return false;
                }else{
                    lastVowelIndex = i;
                }
            }else{
                if(word.substring(i, i + 1).compareTo(word.substring(lastConsonantIndex, lastConsonantIndex + 1)) < 0)
                    return false;
                else
                    lastConsonantIndex = i;
            }
        }

        return true;
    }
}
