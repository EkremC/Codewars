package _6KYU;

// https://www.codewars.com/kata/5839edaa6754d6fec10000a2
public class FindTheMissingLetter {

    public static char findMissingLetter(char[] array)
    {
        char ret = ' ';
        for(int i = 0; i < array.length - 1; i++){
            char curr = array[i];
            char next = array[i+1];
            if(next - curr != 1){
                ret = (char) (curr + 1);
                break;
            }
        }
        return ret;
    }

}
