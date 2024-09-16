package Annotations;

import java.lang.annotation.*;

public class AnnotationWork2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class xiaomiClass = Class.forName("Annotations.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi class: \n" +
                sm1.OS() + " - OS; " + sm1.yearCreation() + " - year creation;");

        Class iphoneClass = Class.forName("Annotations.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Iphone class: \n" +
                sm2.OS() + " - OS; " + sm2.yearCreation() + " - year creation;");
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";
    int yearCreation() default 2010;
}

@SmartPhone
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearCreation = 1976)
class Iphone {
    String model;
    double price;
}