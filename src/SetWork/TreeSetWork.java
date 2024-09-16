package SetWork;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWork {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(20);
        set.add(15);
        set.add(5);
//        System.out.println(set);
//        set.remove(5);
//        System.out.println(set);
//        System.out.println(set.contains(6));

        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });

        Student st1 = new Student("Jack", 5);
        treeSet.add(st1);
        Student st2 = new Student("Oleg", 3);
        treeSet.add(new Student("Tom", 1));
        treeSet.add(new Student("Make", 4));
        treeSet.add(st2);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        Student st3 = new Student("Tod", 5);
        treeSet.add(st3);
        System.out.println("HeadSet " + treeSet.headSet(st1));
        System.out.println("TailSet " + treeSet.tailSet(st2));
        System.out.println("Subset " + treeSet.subSet(st2, st1));
        System.out.println(treeSet);
        System.out.println(st1.hashCode() == st3.hashCode());
        System.out.println(st1.equals(st3));
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }
}