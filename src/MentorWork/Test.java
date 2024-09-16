package MentorWork;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Arrays.stream(array).map(length -> array.length / 2).forEach(System.out::print);
    }
}
