package Leetcode;

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return new int[]{min, max};
    }
}

class Test1 {
    public static void main(String[] args) {
        int[] arr = {13, 4, 3, 5};
        int[] its = MinMax.minMax(arr);
        System.out.println(Arrays.toString(its));
    }
}