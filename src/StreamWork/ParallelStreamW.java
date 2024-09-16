package StreamWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamW {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("Tom", "Jack", "Oleg", "Bob", "Tim", "Sam");
        System.out.println("Последовательный поток:");
        people.stream().filter(p -> p.length() == 2).forEach(System.out::println);
        System.out.println("Параллельный поток:");
        people.parallelStream().filter(p -> p.length() > 2).forEachOrdered(System.out::println);

        List<Double> list = new ArrayList<>();
        list.add(10.8);
        list.add(6.7);
        list.add(14.7);
        list.add(19.7);
//        double result = list.parallelStream().reduce(Double::sum).get();
//        System.out.println("Result: "+result);
        double result = list.stream()
                .reduce((accum, element) -> accum / element).get(); // не нельзя исползовать при делении parallelStream()
        System.out.println(result);

    }
}
