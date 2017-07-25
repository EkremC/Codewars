package _6KYU;

/**
 * Created by ekremcandemir on 25/07/2017.
 */
// https://www.codewars.com/kata/find-the-parity-outlier/train/java
public class FindTheParityOutlier {

    static int find(int[] integers){
	int oddCounter = 0; 
	int evenCounter = 0; 
	int oddNum = 0; 
	int evenNum = 0;
	for(int i = 0; i < integers.length; i++){
		if(Math.abs(integers[i]) % 2 == 0){
			evenCounter++; 
			evenNum = integers[i];
		}else{
			oddCounter++;
			oddNum = integers[i];
		}

		if(evenCounter > 0 && oddCounter > 0 && evenCounter != oddCounter){
			break;
		}
	}

	return (evenCounter > oddCounter) ? oddNum : evenNum;
    }

}
