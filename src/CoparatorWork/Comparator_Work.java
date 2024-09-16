package CoparatorWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Work {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Petya");
        list.add("Sam");
        list.add("Alex");
        System.out.println("До сортировки");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки");
        System.out.println(list);
        System.out.println("---------------");

        //создание сортировки нашего метода
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Tom", "Ivanov", 26);
        employeeList.add(emp1);
        Employee emp2 = new Employee("Tom", "Petrov", 22);
        employeeList.add(emp2);
        Employee emp3 = new Employee("Pavel", "Sidorov", 34);
        employeeList.add(emp3);
        System.out.println("До сортировки \n" + employeeList);
        //для comparable
        Collections.sort(employeeList);
        System.out.println("После сортировки по годам \n" + employeeList);
        //для comparator
//        Collections.sort(employeeList, new IdComparator());
//        System.out.println("После сортировки по годам \n" + employeeList);
        Collections.sort(employeeList, new NameComparator());
        System.out.println("После сортировки по имени \n" + employeeList);

    }
}

class Employee implements Comparable<Employee> {
    String name;
    String surname;
    Integer age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name= '%s', surname= '%s', age= %d ; \t".formatted(name, surname, age);
    }

    @Override
    public int compareTo(Employee o) {
//        if(this.age > o.age){
//        return 0;
//    }else if(this.age < o.age){
//        return -1;
//        }else
//            return 1;
//    }
//
//        либо такой вариант
//        return (this.age - o.age);
//
//        при использовании класса integer
        return this.age.compareTo(o.age);
//
//        //сортировка по имени работника
//        //return this.name.compareTo(o.name);
//
//        //поверка по имени и фамилии в порядке возрастания
//        int res = this.name.compareTo(o.name);
//        if (res == 0) {
//            res = this.surname.compareTo(o.surname);
//        }
//        return res;
    }
}

//class IdComparator implements Comparator<CoparatorWork.Employee>{
//
//    @Override
//    public int compare(CoparatorWork.Employee emp1, CoparatorWork.Employee emp2) {
//        if (emp1.age > emp2.age){
//        return 0;
//    }else if(emp1.age < emp2.age){
//        return -1;
//        }else
//            return 1;
//    }
//}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        int res = emp1.name.compareTo(emp2.name);
        if (res == 0) {
            res = emp1.surname.compareTo(emp2.surname);
        }
        return res;
    }
}