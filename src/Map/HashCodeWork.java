package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeWork {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Tom", "Soyer", 1);
        Student st2 = new Student("Oleg", "Popov", 2);
        Student st3 = new Student("Mike", "Ivanov", 3);
        map.put(st1, 7.5);
        map.put(st2, 8.3);
        map.put(st3, 9.5);
        System.out.println(map);
        Student st4 = new Student("Mike", "Ivanov", 3);
        boolean result = map.containsKey(st4);
        System.out.println(result);
        double num = map.put(st3, 4.5);
        System.out.println("Previos value st3 = " + num);
        System.out.println(map);
//        System.out.println(st3.hashCode());
//        System.out.println(st4.hashCode());
        for (Map.Entry<Student, Double> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

final class Student implements Comparable<Student> {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student { name: " + name + ", surname: " + surname + ", course: " + course + " }";
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                name.equals(student.name) &&
                surname.equals(student.surname);
    }

    //    @Override
//    public int hashCode() {
//        return name.hashCode() + surname.hashCode() + course;
//    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
        //  return name.length() + surname.length() + course;
    }
}