package _6KYU;

/**
 * Created by ekremcandemir on 23/07/2017.
 */
// https://www.codewars.com/kata/multiples-of-3-and-5/train/java
public class MultiplesOf3And5 {

    public int solution(int number) {

        int sum = 0;

        for (int i = 3; i < number; i++) {
            if(i % 15 == 0){
                sum += i;
                continue;
            } else if(i % 3 == 0)
                sum += i;
            else if(i % 5 == 0)
                sum += i;
        }

        return sum;
    }

}
