package Leetcode;

import java.util.*;

public class SingleNumber_260 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0};
        System.out.println(getSingleNumber(nums));
    }

    public static List<Integer> getSingleNumber(int[] nums) {
        Map<Integer, Integer> counterMap = new HashMap<>();

        Arrays.stream(nums).forEach(num ->
                counterMap.put(num, counterMap.getOrDefault(num, 0) + 1));

        List<Integer> list = counterMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        if (!list.isEmpty()) {
            return list;
        } else {
            return new ArrayList<Integer>();
        }
    }
}
