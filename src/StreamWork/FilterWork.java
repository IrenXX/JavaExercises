package StreamWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterWork {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 23, 4);
        Student st2 = new Student("Jack", 24, 5);
        Student st3 = new Student("Olga", 20, 1);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
//        list.stream().filter(x -> x.getAge() > 20 && x.getCource() > 4).forEach(System.out::println);

        list = list.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).
                collect(Collectors.toList());
//        System.out.println(list);

        //Имена сделать загл буквами, отфильтровать по курсу и отсортировать по age
//        list.stream().map(element ->
//                {
//                    element.setName(element.getName().toUpperCase());
//                    return element;
//                })
//                .filter(element -> element.getCource() > 2)
//                .sorted((x, y) -> x.getAge() - y.getAge())
//                .forEach(System.out::println);

        Optional first = list.stream().map(element ->
                {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getCource() > 2)
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst();
        System.out.println(first.get());
    }
}

class Student {
    private String name;
    private int age;
    private int cource;

    public Student(String name, int age, int cource) {
        this.name = name;
        this.age = age;
        this.cource = cource;
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cource=" + cource +
                '}';
    }
}
