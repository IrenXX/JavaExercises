package Leetcode;

import java.util.Arrays;

public class arrayDifferent {

    public static void main(String[] args) {
        int[] array = new int[]{3, 6, 10, 1};
        System.out.println(getDiffArray(array));
    }

    private static int getDiffArray(int[] array) {
        if (array.length < 2) {
            return 0;
        }
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        // int difference;
        int max = 0;
        for (int i = 1; i < sortedArray.length; i++) {
            //первый вариант
//            difference = sortedArray[i] - sortedArray[i - 1];
//            if (difference > max) {
//                max = difference;
//            }
            max = Math.max(sortedArray[i] - sortedArray[i - 1], max);
        }
        return max;
    }
}
