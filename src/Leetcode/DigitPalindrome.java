package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class DigitPalindrome {

    public static void main1(String[] args) {
        int x = 134;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revers = 0;
        int temp = x;
        while (temp != 0) {
            int start = temp % 10;
            revers = revers * 10 + start;
            temp /= 10;
        }
        return revers == x;
    }

}

class byteR {
    public static void main(String[] args) {
        Map<Byte[], String> map = new HashMap<>();
        Byte[] bytes = new Byte[]{1, 2, 3};
        Byte[] bytes1 = new Byte[]{1, 2, 3};
        map.put(bytes, "Str");
        map.put(bytes1, "ddd");
        System.out.println(map.get(bytes1));

        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);

        a = 130;
        b = 130;
        System.out.println(a == b);

        a = new Integer(10);
        a = new Integer(10);
        System.out.println(a == b);

    }
}