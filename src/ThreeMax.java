//В списке чисел найти 3 максимальных

import java.util.*;

public class ThreeMax {
    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(34);//3
        list.add(56);//2
        list.add(14);
        list.add(23);
        list.add(76);//1
        //первый вариант решения
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\nSecond var: ");
        //второй вариант решения
        for (int i = 0; i < 3; i++) {
            if (list.size() < 3) return;
            int max = list.stream().max(Comparator.naturalOrder()).get();
            list.removeIf(next -> max == next);
//            for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
//                Integer next = iterator.next();
//                if (max==next){
//                iterator.remove();
//                }
//            }
            System.out.print(max + " ");
        }
    }

    public static void main2(String[] args) {
        List list = new ArrayList<Long>();
        list.add(1L);
        list.add(1.0);
        list.add(new Object());
        list.add("I am long");
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Tom", "Andrey");
        Collections.sort(names);
        System.out.println("List after sort() " + names);
        List<String> namesAfterSort = names.stream().sorted().toList();
        System.out.println("List after sorted() " + names);
    }
}
