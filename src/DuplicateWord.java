import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {
        String string = "Пирамида";
        String[] array = string.toLowerCase().split("");
        System.out.println(countWord(array));

    }

    //посчет одинаковых букв в строке
    private static Map<String, Integer> countWord(String[] splitWord) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String element : splitWord) {
            int counter = countMap.getOrDefault(element, 0);
            counter++;
            countMap.put(element, counter);
        }

        return countMap;
    }
}
