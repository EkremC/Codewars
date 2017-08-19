package _6KYU;


/**
 * Created by ekremcandemir on 23/07/2017.
 */
// https://www.codewars.com/kata/equal-sides-of-an-array/train/java
public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {

        int leftSum = findSum(arr, 0, 0);
        int rightSum = findSum(arr, 1, arr.length);

        for (int i = 0; i < arr.length - 1; i++) {
            if (leftSum == rightSum)
                return i;
            else {
                leftSum = findSum(arr, 0, i + 1);
                rightSum = findSum(arr, i + 2, arr.length);
            }
        }

        return -1;
    }

    private static int findSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

