package Kote;

import java.util.Map;

public class MainCat {
    public static void main(String[] args) {
        Cat exprtimentalCat = new Cat("Василий1", 1);
        Cat cat2 = new Cat("Василий2", 2);
        Cat cat3 = new Cat("Василий3", 3);
        Cat cat4 = new Cat("Василий4", 4);

        Map<Cat, String> cats = Map.of(
                exprtimentalCat, "Василий для будущих экспериментов",
                cat2, "Василий2",
                cat3, "Василий3",
                cat4, "Василий4");
        System.out.println("Берем кота экспериментального");
        System.out.println("Найденное значение: " + cats.get(exprtimentalCat));

        System.out.println("Выводим мапу котов до экспериментов");
        System.out.println(cats);

        System.out.println("--------------");
        exprtimentalCat.setName("Экспериментальный Василий для тестов");//Cat("Экспериментальный Василий для тестов", 1)
        System.out.println(exprtimentalCat);

        System.out.println("Выводим мапу котов после экспериментов");
        System.out.println(cats);

        System.out.println("Берем кота экспериментального после экспериментов");
        //TODO какое значение из мапы вылезет и почему так?
        System.out.println("Найденное значение: " + cats.get(exprtimentalCat));
    }
}
