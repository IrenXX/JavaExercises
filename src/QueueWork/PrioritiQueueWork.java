package QueueWork;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class PrioritiQueueWork {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(13);
        priorityQueue.add(45);
        priorityQueue.add(23);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());

        PriorityQueue<Student> priorityQueue1 = new PriorityQueue<>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });

        priorityQueue1.offer(new Student("Tom", 2));
        priorityQueue1.offer(new Student("Mike", 5));
        priorityQueue1.offer(new Student("Jack", 3));
        priorityQueue1.offer(new Student("Oleg", 4));

        System.out.println(priorityQueue1);
        priorityQueue1.poll();
        System.out.println(priorityQueue1);
        priorityQueue1.poll();
        System.out.println(priorityQueue1);
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