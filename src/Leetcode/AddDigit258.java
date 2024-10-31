package Leetcode;

public class AddDigit258 {
    public static void main(String[] args) {
        int num = 5623;
        System.out.println(addDigit(num));
    }

    private static int addDigit(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}
