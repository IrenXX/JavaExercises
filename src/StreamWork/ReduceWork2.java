package StreamWork;

import java.util.ArrayList;
import java.util.List;

public class ReduceWork2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(23);
        int result = list.stream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(result);
        //8, 2, 5, 23
        //accumulator = 8 10 15 38
        // element =    2  5 23
        System.out.println("----------------------");
        int result2 = list.stream().reduce(0, (accumulator, element) -> accumulator + element);
        System.out.println(result2);
        //8, 2, 5, 23
        //accumulator = 0  8 10 15 38
        // element =    8  2  5 23
        System.out.println("------------------");
        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        str.add("Java");

        String result3 = str.stream().reduce("", (accumulator, element) -> accumulator + " " + element);
        System.out.println(result3);

    }
}
