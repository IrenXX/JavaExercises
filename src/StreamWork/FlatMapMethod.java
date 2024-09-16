package StreamWork;

import java.util.ArrayList;
import java.util.List;

public class FlatMapMethod {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 23, 4);
        Student st2 = new Student("Jack", 24, 5);
        Student st3 = new Student("Olga", 20, 1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathmatics");
        f1.addStudentsOnFaculty(st1);
        f1.addStudentsOnFaculty(st2);
        f2.addStudentsOnFaculty(st3);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));

    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentsOnFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}