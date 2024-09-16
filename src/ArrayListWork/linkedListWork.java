package ArrayListWork;

import java.util.LinkedList;

public class linkedListWork {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 24);
        Student st2 = new Student("Jack", 25);
        Student st3 = new Student("Jane", 20);
        LinkedList<Student> l1 = new LinkedList<Student>();
        l1.add(st1);
        l1.add(st2);
        l1.add(st3);
        System.out.println("LinkedList: " + l1);
        System.out.println(l1.get(2));
        Student st4 = new Student("Igor", 26);
        l1.add(1, st4);
        System.out.println("LinkedList: " + l1);
        l1.remove(3);
        System.out.println("LinkedList: " + l1);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student {name=" + name + ", age=" + age + "}";
    }
}