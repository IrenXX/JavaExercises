package ReflectionWork;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionPerson {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<ReflectionEmployee> classPerson = ReflectionEmployee.class;
        ReflectionEmployee employee = new ReflectionEmployee();

        Class classEmp2 = employee.getClass();

        Class classEmp = Class.forName("ReflectionWork.ReflectionEmployee");

        Method[] methods = classPerson.getMethods();
        Arrays.stream(methods).forEach((s) -> System.out.println(s.getName() + ", " + s.getReturnType() + "," +
                " " + Arrays.toString(s.getParameterTypes())));
        System.out.println("*******************");
        Field[] field = classEmp.getFields();
        Arrays.stream(field).forEach(f -> System.out.println(f.getName() + ", " + f.getType()));
        System.out.println("*******************");
        Field[] fields = classEmp.getDeclaredFields();
        Arrays.stream(fields).forEach(f -> System.out.println(f.getName() + ", " + f.getType()));
        System.out.println("*******************");


        Method method = classEmp.getMethod("setSalary", double.class);
        Object o = classEmp.getConstructor(int.class, String.class).newInstance(1, "Tim");

        method.invoke(o, 20.0);

        System.out.println(o);
    }
}
