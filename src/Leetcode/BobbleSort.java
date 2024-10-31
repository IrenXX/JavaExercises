package Leetcode;

import java.util.Arrays;

//Сортировка пузырьком
/*
* Сортировка пузрьком — алгоритм, представляющий собой итерационный процесс,
* в котором сравниваются соседние элементы массива.

Если элемент слева больше элемента справа, то значения меняются местами.
* Это продолжается до тех пор, пока все элементы не будут отсортированы по возрастанию.
*/

public class BobbleSort {
    public static void main(String[] args) {
        int[] array = {1, 6, 3, 8, 4, 9, 5, 11, 2};
        System.out.println(Arrays.toString(getSortBobble(array)));

    }

    private static int[] getSortBobble(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
