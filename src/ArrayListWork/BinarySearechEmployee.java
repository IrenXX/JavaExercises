package ArrayListWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearechEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Tom", "Ivanov", 26);
        employeeList.add(emp1);
        Employee emp2 = new Employee("Tom", "Petrov", 22);
        employeeList.add(emp2);
        Employee emp3 = new Employee("Pavel", "Sidorov", 34);
        employeeList.add(emp3);
        System.out.println("До сортировки \n" + employeeList);
        Collections.sort(employeeList);
        System.out.println("После сортировки \n" + employeeList);
        int index = Collections.binarySearch(employeeList, emp1);
        System.out.println(index);
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
        return "{name= '%s', surname= '%s', age= %d} \t".formatted(name, surname, age);
    }

    @Override
    public int compareTo(Employee otherEmp) {
        int result = this.age - otherEmp.age;
        if (result == 0) {
            return this.name.compareTo(otherEmp.name);
        }
        return result;
    }
}