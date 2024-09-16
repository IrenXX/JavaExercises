package StreamWork;

import java.util.ArrayList;
import java.util.List;

public class MapToIntMethod {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 23, 4);
        Student st2 = new Student("Jack", 24, 5);
        Student st3 = new Student("Olga", 20, 1);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

//        List<Integer> courseList = list.stream()
//                .mapToInt(el->el.getAge())
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(courseList);

        int sum = list.stream().mapToInt(Student::getCource).sum();
        System.out.println(sum);
        System.out.println("-------------------------------");

        double age = list.stream().mapToInt(Student::getAge).average().getAsDouble();
        System.out.println(age);
        System.out.println("-------------------------------");

        int min = list.stream().mapToInt(Student::getCource).min().getAsInt();
        System.out.println(min);
        System.out.println("-------------------------------");

        int max = list.stream().mapToInt(Student::getCource).max().getAsInt();
        System.out.println(max);
        System.out.println("-------------------------------");
    }
}
