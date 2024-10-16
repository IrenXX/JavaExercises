package Kote;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class Kisa {
    private final String name;
    private final int age;
    private final Color color;
    private final Breed breed;

    private static final Random random = new Random();
    private static final List<String> names =
            List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");

    private Kisa() {
        name = names.get(random.nextInt(names.size()));
        age = random.nextInt(10) + 1;
        breed = Breed.values()[random.nextInt(Breed.values().length)];
        color = Color.values()[random.nextInt(Color.values().length)];
    }

    public static List<Kisa> makeKisas(int amount) {
        return Stream.generate(Kisa::new)
                .limit(amount)
                .collect(Collectors.toList());
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Breed getBreed() {
        return breed;
    }

    enum Color {
        TABBY, SILVER, GRAY, PEACH, GINGER, TORTIE
    }

    enum Breed {
        SPHINX, BRITAIN, SCOTTISH, VULGARIS, ORIENTAL
    }
}
