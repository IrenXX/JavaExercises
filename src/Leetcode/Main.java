package Leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n = {1, 2, 2};
        int i = Kata1.squareSum(n);
        System.out.println(i);
    }
}

class Kata1 {
    public static int squareSum(int[] n) {
        //Your Code
        int result = Arrays.stream(n).map(x -> x * x).sum();
//        int result = 0;
//        for (int j : n) {
//            result += j * j;
//        }
        return result;
    }
}