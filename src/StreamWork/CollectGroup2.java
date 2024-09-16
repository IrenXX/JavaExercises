package StreamWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroup2 {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 23, 4);
        Student st2 = new Student("Jack", 24, 4);
        Student st3 = new Student("Olga", 20, 1);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

//        Map<Integer, List<Student>> mapStudent = list.stream().map(s->{s.setName(s.getName().toUpperCase());return s;}).
//                collect(Collectors.groupingBy(Student::getCource));
//        for (Map.Entry<Integer, List<Student>> entry : mapStudent.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue().toString());
//            System.out.println(entry.getKey());
//            for (Student student : entry.getValue()) {
//                System.out.println(student);
//            }
        Map<Boolean, List<Student>> mapSt = list.stream().collect(Collectors.partitioningBy(st -> st.getAge() >= 21));
        for (Map.Entry<Boolean, List<Student>> entry : mapSt.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }

    }
}
