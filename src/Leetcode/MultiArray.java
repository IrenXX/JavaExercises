package Leetcode;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productArray(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productArray(int[] arr) {
//        int[] array2 = Arrays.copyOfRange(arr, 1,arr.length-1);
//        int[] reduce = Arrays.stream(array2)
//                .map((ux,sy)->ux*sy)
//                .toArray();
//        return reduce;

        //второй вариант
        int [] array1 = new int[arr.length];
        for (int i = 0; i < array1.length; i++) {
            int multy=1;
            for (int j = 0; j < arr.length; j++) {
                if (i!=j) {
                    multy*=arr[j];
                }
            }
            array1[i]=multy;
        }
        return array1;
    }


}

