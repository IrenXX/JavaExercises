package ReflectionWork;

import java.lang.reflect.Field;

public class ReflectionWork3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ReflectionEmployee employee = new ReflectionEmployee(10, "Bob");

        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 1500);
        System.out.println(employee);
    }
}
