package Leetcode;

import java.util.Arrays;
/*
 * Given n, take the sum of the digits of n.
 * If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
 * The input will be a non-negative integer.
 * */

public class DRoot {
    public static int digital_root(int n) {
        int sum=0;
        do {
            sum = Arrays.stream(String.valueOf(n).split(""))
                    .map(Integer::parseInt)
                    .reduce(Integer::sum)
                    .get();
            n=sum;
        }
        while (sum > 9);
        return sum;
    }
}


class Test6 {
    public static void main(String[] args) {
        int n = 493193; //4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
        System.out.println(DRoot.digital_root(n));
    }
}