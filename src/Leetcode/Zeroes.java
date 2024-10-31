package Leetcode;/*
*Дан целочисленный массив nums. Необходимо переместить все нулевые элементы в конец массива, сохраняя
* относительный порядок элементов, не являющихся нулем. Решение должно производиться на месте,
* без использования дополнительного массива, а также должно иметь минимальную сложность по времени и пространству.
Пример:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
* */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 2, 3, 12};

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        System.out.println(Arrays.toString(nums));

        Integer[] nums1 = new Integer[]{0, 1, 0, 0, 2, 3, 12};
        List<Integer> list = Arrays.asList(nums1);

        Collections.reverse(list);
        System.out.println(list);


//        List<String> names = Arrays.asList("John", "Mary", "Peter", "Alice");
//                names.stream()
//                .map(name -> name.substring(1)) // удаление первой буквы из каждого имени
//                .sorted() // сортировка списка
//                .forEach(System.out::println);
    }
}
