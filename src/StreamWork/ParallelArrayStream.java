package StreamWork;

import java.util.Arrays;

public class ParallelArrayStream {
    public static void main(String[] args) {
//        int[] array = initArray(6);
//        for (int i : array) {
//            System.out.print(i + " ");
//        }

        Phone[] phones = new Phone[]{new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};
        Arrays.parallelSort(phones, new PhoneComparator());
        for (Phone phone : phones) {
            System.out.println(phone.getName());
        }

//        Arrays.parallelSetAll(phones, i -> {
//            phones[i].setCost(phones[i].getCost()-10000);
//            return phones[i];
//        });
//        for(Phone p: phones)
//            System.out.printf("%s - %d \n", p.getName(), p.getCost());

        int[] nums = new int[]{1, 2, 3, -4, 5, -86, 7, -38, 9};
        Arrays.parallelPrefix(nums, (x, y) -> x + y);
//        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] initArray(int size) {
        int[] arr = new int[size];
        Arrays.parallelSetAll(arr, x -> x * 10);
        return arr;
    }
}

