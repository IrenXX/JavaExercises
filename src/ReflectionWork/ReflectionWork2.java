package ReflectionWork;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionWork2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> employeeClass = Class.forName("ReflectionWork.ReflectionEmployee");

        Constructor<?> constructor = employeeClass.getConstructor();
        Object object = constructor.newInstance();

        Constructor<?> constructor1 = employeeClass.getConstructor(int.class, String.class);
        Object o = constructor1.newInstance(5, "Pole");
        System.out.println(o);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(o, 400.44);
        System.out.println(o);
    }
}
