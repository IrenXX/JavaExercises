import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapWork {
    public static void main(String[] args) {
        String world = "A, B, AA, BB, A, BB, A";
        List<String> splitWord = List.of(world.split(", "));
        Map<String, Integer> result = countWord(splitWord);
        System.out.println(result);

        //удаление дубликатов
        System.out.println(new LinkedHashSet<>(splitWord));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> collect =
                numbers.stream()
                        .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Все четные числа: " + collect.get(true));
        System.out.println("Все нечетные числа: " + collect.get(false));


    }

    //подсчет одинаковых слов в предложении
    private static Map<String, Integer> countWord(List<String> splitWord) {
        Map<String, Integer> countMap = new HashMap<>();


        splitWord.stream()
                .forEach(element ->
                        countMap.put(element, countMap.getOrDefault(element, 0) + 1));


//              второй вариант!!
//        for (String element : splitWord) {
//            int counter = countMap.getOrDefault(element, 0);
//            counter++;
//            countMap.put(element, counter);
//        }
        return countMap;
    }
}
