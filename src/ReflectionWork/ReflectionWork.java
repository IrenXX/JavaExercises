package ReflectionWork;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionWork {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> classEmployee = Class.forName("ReflectionWork.ReflectionEmployee");

        Field someField = classEmployee.getField("id");
//        System.out.println("Type of id field: "+someField.getType());

        Field[] fields = classEmployee.getFields();
        //выведем только public поля
        Arrays.stream(fields).forEach(field -> System.out.println("Type of " + field.getName() + " = " + field.getType()));
        System.out.println("*******");

        //выведем private поля
        Field[] fields1 = classEmployee.getDeclaredFields();
//        System.out.println("Fields "+ Arrays.toString(fields1));
        Arrays.stream(fields1).forEach(field -> System.out.println("Type of " + field.getName() + " = " + field.getType()));

        Method someMethod = classEmployee.getMethod("IncreaseSalary");
        System.out.println("Return Type method IncreaseSalary: " + someMethod.getReturnType() +
                "\nParameter types: " + Arrays.toString(someMethod.getParameterTypes()));
        System.out.println("*******");

        Method someMethod1 = classEmployee.getDeclaredMethod("ChangeName", String.class);
        System.out.println("Return Type method ChangeName: " + someMethod1.getReturnType() +
                "\nParameter types: " + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("*******");

        Method[] methods = classEmployee.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> System.out.println("Method name of = " + method.getName() +
                " Return type = " + method.getReturnType() + " parameter types = " +
                Arrays.toString(method.getParameterTypes()) + "\n"));
        System.out.println("*******getDeclaredMethods2************");

        Method[] methods2 = classEmployee.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> {
                    if (Modifier.isPublic(method.getModifiers()))
                        System.out.println("Method name of = " + method.getName() +
                                " Return type = " + method.getReturnType() + " parameter types = " +
                                Arrays.toString(method.getParameterTypes()) + "\n");
                }
        );
        System.out.println("--------------------------------");

        Constructor [] constructor = classEmployee.getConstructors();
        Arrays.stream(constructor).forEach(constr -> System.out.println("Constructor name of = " + constr.getName() +
                " has = " + constr.getParameterCount() + " parameter types = " +
                Arrays.toString(constr.getParameterTypes()) + "\n"));
        System.out.println("*******");

        Constructor constructor2 = classEmployee.getDeclaredConstructor(int.class, String.class, double.class);
        System.out.println("Constructor has " + constructor2.getParameterCount()
                +" parameters, type are: " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("*******");





    }
}
