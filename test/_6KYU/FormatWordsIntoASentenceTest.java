package _6KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 23/09/2017.
 */
public class FormatWordsIntoASentenceTest {
    @Test
    public void sampleTests() {
        assertEquals("one, two, three and four", FormatWordsIntoASentence.formatWords(new String[] {"one", "two", "three", "four"}));
        assertEquals("one", FormatWordsIntoASentence.formatWords(new String[] {"one"}));
        assertEquals("one and three", FormatWordsIntoASentence.formatWords(new String[] {"one", "", "three"}));
        assertEquals("three", FormatWordsIntoASentence.formatWords(new String[] {"", "", "three"}));
        assertEquals("one and two", FormatWordsIntoASentence.formatWords(new String[] {"one", "two", ""}));
        assertEquals("", FormatWordsIntoASentence.formatWords(new String[] {}));
        assertEquals("", FormatWordsIntoASentence.formatWords(null));
        assertEquals("", FormatWordsIntoASentence.formatWords(new String[] {""}));
    }

    @Test
    public void deneme(){
        assertEquals("one and two", FormatWordsIntoASentence.formatWords(new String[] {"one", "two", ""}));

    }
}