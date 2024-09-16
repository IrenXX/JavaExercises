import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class MapWork {
    public static void main(String[] args) {
        String world = "A, B, AA, BB, A, BB, A";
        List<String> splitWord = List.of(world.split(", "));
        Map<String, Integer> result = countWord(splitWord);
        System.out.println(result);

        //удаление дубликатов
        System.out.println(new LinkedHashSet<>(splitWord));
    }

    //посчет одинаковых слов в предложении
    private static Map<String, Integer> countWord(List<String> splitWord) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String element : splitWord) {
            int counter = countMap.getOrDefault(element, 0);
            counter++;
            countMap.put(element, counter);
        }
        return countMap;
    }
}
