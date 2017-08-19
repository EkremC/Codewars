package _7KYU;

/**
 * Created by ekremcandemir on 12/07/2017.
 */
// https://www.codewars.com/kata/complementary-dna/train/java
public class ComplementaryDNA {

    public static String makeComplement(String dna) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (dna.substring(i, i + 1).equals("A")) builder.append("T");
            else if (dna.substring(i, i + 1).equals("T")) builder.append("A");
            else if (dna.substring(i, i + 1).equals("G")) builder.append("C");
            else if (dna.substring(i, i + 1).equals("C")) builder.append("G");
        }
        return builder.toString();
    }

}
