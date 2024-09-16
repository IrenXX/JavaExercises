package StreamWork;

import java.util.ArrayList;
import java.util.List;

public class MaxMinLimitSkip {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 23, 4);
        Student st2 = new Student("Jack", 24, 5);
        Student st3 = new Student("Olga", 20, 1);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

//        Student min = list.stream().min((x,y)->x.getAge()-y.getAge()).get();
//        System.out.println(min);
//        Student max = list.stream().max((x,y)->x.getAge()-y.getAge()).get();
//        System.out.println(max);
        list.stream().filter(s -> s.getAge() > 20).forEach(System.out::println);
        System.out.println("------------------------------");
        list.stream().filter(s -> s.getAge() > 20).limit(1).forEach(System.out::println);
        System.out.println("------------------------------");
        list.stream().filter(s -> s.getAge() > 20).skip(1).forEach(System.out::println);
    }
}
