package Yandex;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Lucky {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = reader.readLine();
        //ABBCBCAC
//        if (string.length()%2!=0){
//            string+=" ";
//        }
//        List<String> stringList = new ArrayList<>();
//        for (int i = 0; i < string.length(); i += 2) {
//            stringList.add(string.substring(i, i + 2));
//        }

        char[] charStr = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charStr.length; i++) {
            int counter = map.getOrDefault(charStr[i], 0);
            counter++;
            map.put(charStr[i], counter);
        }
        Character subStr;
        for (Map.Entry<Character, Integer> mapStr: map.entrySet()) {
            if (mapStr.getValue()>2){
                 subStr= mapStr.getKey();
            }
        }
//

        Integer value = map.entrySet().stream()
                .map(Map.Entry::getValue)
                .max(Integer::compare)
                .get();

        map.entrySet().stream()
                .filter(x -> x.getValue() == value)
                .map(Map.Entry::getKey)
                .forEach(print -> {
                    try {
                        writer.write(print);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        reader.close();
        writer.close();
    }
}
