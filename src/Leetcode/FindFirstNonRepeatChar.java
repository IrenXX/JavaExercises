package Leetcode;

import java.util.*;

public class FindFirstNonRepeatChar {
    public static void main(String[] args) {
        String string = "aabbcc";
        System.out.println(getNonRepeatChar(string));
    }

    public static Character getNonRepeatChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            Integer countValue = map.getOrDefault(c, 0);
            countValue++;
            map.put(c, countValue);

            /*
            map.put(c, map.getOrDefault(c, 0) + 1);
            */
        }
        Optional<Character> result = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
}
