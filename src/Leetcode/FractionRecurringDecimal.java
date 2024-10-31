package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class FractionRecurringDecimal {
    public static void main(String[] args) {
        int one = 4;
        int two = 60;
        String string = new Solution().fractionToDecimal(one, two);
        System.out.println(string);
        System.out.println(getRecurring(one, two));
    }

    private static StringBuilder getRecurring(int number1, int number2) {

        StringBuilder sb = new StringBuilder();
        if (number1 < 0 || number2 < 0) {
            sb.append("-");
        }
        sb.append(Math.abs(number1 / number2)).append(".")
                .append(Math.abs((number1 % number2)) * 10 / number2);
        return sb;
    }
}

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder fraction = new StringBuilder();

        if ((numerator < 0) ^ (denominator < 0)) {
            fraction.append("-");
        }

        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        fraction.append(String.valueOf(dividend / divisor));
        long remainder = dividend % divisor;
        if (remainder == 0) {
            return fraction.toString();
        }
        fraction.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                fraction.insert(map.get(remainder), "(");
                fraction.append(")");
                break;
            }
            map.put(remainder, fraction.length());
            remainder *= 10;
            fraction.append(String.valueOf(remainder / divisor));
            remainder %= divisor;
        }
        return fraction.toString();
    }
}