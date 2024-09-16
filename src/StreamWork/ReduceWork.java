package StreamWork;

import java.util.*;
import java.util.stream.Stream;

public class ReduceWork {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, -6, 7, 8, 9, -10));

        Stream<Integer> numStream = array.stream();
//        List<Integer> arrInteger = numStream.filter(x -> x > 3).collect(Collectors.toList());
//        System.out.println(arrInteger);
        //reduce NUM 1
//        Optional<Integer> reduce = numStream.reduce((x, y) -> x + y);
//        System.out.println(reduce.get());
        System.out.println("-------------------------");
        //reduce NUM2
        int identity = 1;
        int result = numStream.reduce(identity, (a, b) -> a * b);//типы совпадают у этих двух способов
        System.out.println("Result: " + result);
        System.out.println("-------------------------");

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 24000),
                new Phone("Lumia 950", 40000),
                new Phone("Samsung Galaxy S 6", 43000),
                new Phone("LG G 4", 32000));
//        Map<String, Integer> mapPhone = phoneStream.collect(Collectors.toMap(p->p.getName(),v->v.getCost()));
//        mapPhone.forEach((k,v)-> System.out.println("Key: "+k+" Value: \t"+v));
        //  System.out.println(mapPhone);

        int sum = phoneStream.reduce(0,
                (x, y) -> {
                    if (y.getCost()< 30000) {
                        return x + y.getCost();
                    } else {
                        return 0;
                    }
                },
                (x, y) -> x + y);
        System.out.printf("Сумма телефонов стоимостью меньше 43000 = %d \n\t", sum);
        System.out.println("-------------------------");
//        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
//        Optional<String> sentence = wordsStream.reduce((x, y) -> x + " " + y);
//        System.out.println(sentence.get());
        // пустой список
        ArrayList<Integer> numbers = new ArrayList<>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.orElse(-1)); // -1
        Random rnd = new Random();
        System.out.println(min.orElseGet(() -> rnd.nextInt(100)));
        min.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Not found")
        );
        System.out.println("-------------------------");
        // непустой список
        numbers.addAll(Arrays.asList(new Integer[]{4, 9, 6, 3, 8, 9}));
//        min = numbers.stream().min(Integer::compare);
//        System.out.println(min.orElse(-1)); // 4 или
//        min.ifPresent(v -> System.out.println(v));//4
        int sum1 = numbers.stream().reduce(0,
                (x, y) -> {
                    if (y > 6) {
                        return x + y;
                    } else {
                        return 0;
                    }
                },
                (x, y) -> x + y);
        System.out.println(sum1);
    }
}
