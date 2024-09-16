package StreamWork;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("public");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> List2 = list.stream()
                .map(element -> element.length()).collect(Collectors.toList());
        System.out.println(List2);

        int[] array = {3, -7, 5, 9};
        //1,-7, 5, 3
        array = Arrays.stream(array).map(element ->
        {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("--------------");

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("public");
        set.add("poka");
        System.out.println(set);

        List<Integer> set2 = set.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(set2);
    }
}
