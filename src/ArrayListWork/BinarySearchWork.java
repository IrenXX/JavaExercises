package ArrayListWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchWork {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-3, 7, 8, 78, 34, -45, 5, -90, 23);
        Collections.sort(list);
        System.out.println("После сортировки массив " + list);

        int index = Collections.binarySearch(list, 20);
        System.out.println(index);

        Collections.reverse(list);
        System.out.println("Реверс массив " + list);

        Collections.shuffle(list);
        System.out.println("Перемешан массив " + list);

        int[] array = {-3, 7, 8, 78, 34, -45, 5, -90, 23};
        System.out.println("New array" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Массив после сортировки"+Arrays.toString(array));
        int index2 = Arrays.binarySearch(array, 23);
        System.out.println(index2);
    }
}
