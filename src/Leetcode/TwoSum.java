package Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 34};
        System.out.println(Arrays.toString(getArray(array, 18)));
    }

    private static int[] getArray(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int sum = array[low] + array[high];
            if (sum == n) {
                return new int[]{array[low], array[high]};
            } else if (sum < n) {
                ++low;
            } else {
                --high;
            }
        }
        return new int[]{-1, -1};
    }
}
