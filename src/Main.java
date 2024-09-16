//Смотри: У тебя есть строка такого формата:
//        "fullName:test1;birthDate:1234;birthPlace:4567;"
//Твоя задача положить ее в мапу в таком формате:
//fullName:test1, где fullName - key, test1 - value, : протсо для удобства чтнеия. Тоесть в паме лежит fullName test1
//birthDate:1234
//birthPlace:4567

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String string = "fullName:test1;birthDate:1234;birthPlace:4567;";
        String[] array = string.split(";");
        for (int i = 0; i < array.length; i++) {
            String[] keyValue = array[i].split(":");
            map.put(keyValue[0], keyValue[1]);
        }
        System.out.println(map);
    }
}
