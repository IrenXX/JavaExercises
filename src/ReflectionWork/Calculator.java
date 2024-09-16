package ReflectionWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.printf("Summa %d i %d  = %d\t", a, b, result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.printf("Raznitsa %d i %d  = %d\t", a, b, result);
    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.printf("Proisvedenie %d i %d  = %d\t", a, b, result);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test100.txt"))){
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class<? extends Calculator> cl = calculator.getClass();
            Method method = null;
            Method [] methods = cl.getDeclaredMethods();
            for (Method mymethod: methods){
                if (mymethod.getName().equals(methodName)){
                    method = mymethod;
                }
            }
            method.invoke(calculator,Integer.parseInt(firstArg), Integer.parseInt(secondArg));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}


