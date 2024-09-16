package LambdaWork;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


//interface studentChecks {
//    boolean checkStudent(Student s);
//}

//class checkOverAge implements studentChecks {
//    @Override
//    public boolean checkStudent(Student s) {
//        return s.age < 21;
//    }
//}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 23, 4);
        Student st2 = new Student("Jack", 24, 5);
        Student st3 = new Student("Olga", 20, 1);
        List<Student> students = List.of(st1, st2, st3);
        //new ArrayList<>();
        //Arrays.asList(st1,st2,st3);

//        students.forEach(studCouce -> {
//            if (studCouce.cource >= 2) {
//                System.out.println(studCouce);
//            }
//        });
//        System.out.println("--------------");
//        students.forEach(studAge -> {
//            if (studAge.age <= 23) {
//                System.out.println(studAge);
//            }
//        });
//        StudentInfo info = new StudentInfo();
        int result = avarageScore(students,stud->stud.cource);
        System.out.println(result);

//        Collections.sort(students, (o1, o2) -> o1.cource - o2.cource);
//        System.out.println(students);
//        System.out.println("--------------");
//
//        info.testStudent(students, new checkOverAge());
//        System.out.println("--------------");

//        info.testStudent(students, new Predicate<Student>() {
//            @Override
//            public boolean test(Student s) {return s.cource > 2;}
//        });
//
//        System.out.println("--------------");
//        info.testStudent(students, (Student s) -> {return s.age < 21;}
//        );
//        System.out.println("-------------------------");
//        System.out.println("выводим предикаты");
//        Predicate<Student> p1 = s -> s.cource > 2;
//        Predicate<Student> p2 = s -> s.age > 21;
//        info.testStudent(students, p1.and(p2));
//        System.out.println("----------------------");
//        info.testStudent(students, p1.or(p2));

//        info.printStudentUnderAge(students, 21);
//        System.out.println("-------------------------------");
//        info.printStudentUnderCouse(students, 2);
    }

    private static int avarageScore(List<Student> list, Function<Student, Integer> function) {
        int sum = 0;
        for (Student student : list) {
            sum += function.apply(student);
        }
        sum = sum / list.size();
        return sum;
    }
}

public class StudentInfo {
    void testStudent(List<Student> aL, Predicate<Student> sc) {
        for (Student s : aL) {
            if (sc.test(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentUnderCouse(ArrayList<Student> aL, int cource) {
//        for (Student s : aL) {
//            if (s.cource > cource) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> aL, int age) {
//        for (Student s : aL) {
//            if (s.age > age) {
//                System.out.println(s);
//            }
//        }
//    }
}
