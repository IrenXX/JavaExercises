package Leetcode;

import java.util.Arrays;

public class StringSplit {
/* разбить строку на 2символа
* */

    public static void main(String[] args) {
        String s = "abcdt";
        Arrays.stream(solution(s)).forEach(System.out::println);
    }

    public static String[] solution(String s) {
        if (s.length()%2!=0){
            s+="_";
        }
        return s.split("(?<=\\G.{2})");
    }
}
