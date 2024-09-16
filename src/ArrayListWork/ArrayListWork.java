package ArrayListWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWork {
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<>();
//        list.add("Any");
//        list.add("Pet");
//        list.add("Dog");
//        System.out.println(list);

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder[] array1 = {sb1, sb2, sb3};
        List<StringBuilder> list = Arrays.asList(array1);//массив получается зависимым полностью от первого массива SB
//        System.out.println(list);
//        array1[0].append("!!!");
//        array1[1]=new StringBuilder("D");
//        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ok");
        list1.add("C");
        list1.add("A");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        List<Integer> list3 = List.of(3, 8, 13);
        System.out.println(list3);

        List<String> list4 = List.copyOf(list2);
        System.out.println(list4);

//        list1.removeAll(list2);
//        list1.retainAll(list2);
//        System.out.println(list1);
//
//        boolean result = list1.containsAll(list2);
//        System.out.println(result);
//        List<String> list3 = list2.subList(0, 2);
//        System.out.println(list3);
//        Object [] objects = list1.toArray();
//        String [] array2 = list2.toArray(new String[list2.size()]);
//        System.out.println("Array 2 = "+Arrays.toString(array2));


    }
}
