package ArrayListWork;

import java.util.ArrayList;
import java.util.List;

//Поиск анаграмм

public class Anagram {
    public static void main(String[] args) {
        String[] strings = {"ая", "бо", "об", "яа", "ап", "па"};
        System.out.println(getListAnagram(strings));
    }

    private static List<List<String>> getListAnagram(String[] list) {
        List<List<String>> anagramList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            String current = list[i];
            for (int j = i + 1; j < list.length; j++) {
                String next = list[j];
                if (sortString(current).compareTo(sortString(next)) == 0) {
                    List<String> innerList = new ArrayList<>();
                    innerList.add(current);
                    innerList.add(next);
                    anagramList.add(innerList);
                }
            }
        }
        return anagramList;
    }

    public static String sortString(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
}
