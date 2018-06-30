package _6KYU;

// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
public class CountingDuplicates {

    public static int duplicateCount(String text) {
        int[] arr = new int[128];
        text = text.toLowerCase();

        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(++arr[c - 'a'] == 2){
                count++;
            }
        }

        return count;

    }

}
