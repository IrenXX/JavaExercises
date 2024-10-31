package Kote;

import java.util.List;
import java.util.Random;

public class ActiveCats {
    private static final Random r = new Random();
    private static final List<String> names =
            List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");

    private final String name;
    private String action;

    public ActiveCats(String action) {
        name = names.get(r.nextInt(names.size()));
        this.action = action;
    }

    public final String getName() {
        return name;
    }

    public void doAction() {
        System.out.printf("Я %s. %s%n", name, action);
    }

    /*****/
    // Действия доступные для котов

    public static String jump() {
        return "Я прыгаю!";
    }

    public static String sleep() {
        return "Я сплю!";
    }

    public static String eat() {
        return "Я кушаю!";
    }
    /*****/
}
