package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummeryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 4, 5, 6, 7, 9, 10, 13};
        System.out.println(getSummerRange(nums));
    }

    private static List<String> getSummerRange(int[] nums) {
        int n = nums.length;
        List<String> rangList = new ArrayList<>();
        if (n == 0) return rangList;

        int start = 0;

        for (int i = 1; i <= n; i++) {
            if ((i == n)
                    || (nums[i] != (nums[i - 1] + 1))
            ) {
                if (start == i - 1) {
                    rangList.add(String.valueOf(nums[start]));
                } else {
                    rangList.add(nums[start] + "->" + nums[i - 1]);
                }
                start = i;
            }
        }
        return rangList;
    }
}
