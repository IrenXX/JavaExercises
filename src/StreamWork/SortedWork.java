package StreamWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class SortedWork {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "New York", "Madrid", "Italy");
        cities.stream()
                .filter(city -> city.length() == 6)
                .forEach(city -> System.out.println(city));
        System.out.println("---------------------------------------------");

        //сортировка
        cities.stream()
                .filter(city -> city.length() >5)
                .sorted()
                .forEach(city -> System.out.println(city));
        System.out.println("--------------------------------------");
        Stream<String> citiesStream = Arrays.stream(new String[]{"Vienna", "Spain", "Dubai"});
//        citiesStream.forEach(System.out::println);
        citiesStream.sorted().forEach(System.out::println);


//        IntStream intStream = IntStream.of(4, 67, 98);
//        intStream.forEach(System.out::println);
//      LongStream longStream = Arrays.stream(new long[]{5, 32, 53, 24, 85});
//        longStream.forEach(s->System.out.print(s+" "));
        System.out.println("----------------------------------");

//        Stream<Phone> phones = Stream.of(new Phone("IPhone", 63000), new Phone("Samsung", 45000),
//                new Phone("Lumia", 30000));
//        //отображение - когда из одного элемента - одно отображение
////        phones
//                //.map(p -> "Наименование " + p.getName() + "; \tЦена " + p.getCost())
//                .map(p -> String.format("наименование: %s \t цена: %d", p.getName(), p.getCost()))
//                .forEach(System.out::println);

        //плоское отображение - из одного элемента - несколько
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

//        phoneStream
//                .flatMap(p -> Stream.of(
//                        String.format("название: %s; \t цена без скидки: %d", p.getName(), p.getCost()),
//                        String.format("название: %s; \t цена со скидкой: %d", p.getName(), (int)(p.getCost() * 0.9))))
//                .forEach(s -> System.out.println(s));

        //сортировка нашего класса по имени с помощью comparator
//        phoneStream.sorted(new PhoneComparator())
//                .forEach(p->System.out.printf("%s - %d \n",
//                        p.getName(), p.getCost()));

        //сортировка по ценнику - методом comparing
        phoneStream.sorted(comparing(Phone::getCost)).forEach(p->System.out.printf("%s - %d \n",
                        p.getName(), p.getCost()));
    }
}

class PhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}

 class Phone {
    private String name;
    private int cost;

     public void setCost(int cost) {
         this.cost = cost;
     }

     public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public Phone(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}