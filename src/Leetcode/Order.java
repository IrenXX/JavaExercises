package Leetcode;

import java.util.Arrays;

public class Order {

    public static void main(String[] args) {

        String s = "is2 Thi1s T4est 3a";
        System.out.println(order(s));

    }

    public static String order(String words) {
        if (words.isEmpty()) return "";
        String[] split = words.split(" ");
        

        String s = words.replaceAll("[a-zA-Z ]", "");
        String[] splitS = s.split("");
        String[] newString = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            int j = Integer.parseInt(splitS[i]);
            newString[j-1]=split[i];
        }

        return Arrays.toString(newString);
    }
}
