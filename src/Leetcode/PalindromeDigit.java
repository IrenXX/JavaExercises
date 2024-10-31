package Leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PalindromeDigit {
    public static void main(String[] args) {
        int x = 12134121;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> list = Arrays.stream(String.valueOf(x).split(""))
                .map(Integer::parseInt)
                .toList();
        ListIterator<Integer> listIterator = list.listIterator();
        ListIterator<Integer> reversIterator = list.listIterator(list.size());
        while (listIterator.hasNext() && reversIterator.hasPrevious()) {
            if (!listIterator.next().equals(reversIterator.previous())){
                return false;
            }
        }
        return true;
    }
}
