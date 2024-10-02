package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Isogram {
    public static boolean isIsogram(String str) {
   //первый вариант
       return str.chars().distinct().count()==str.length();

   //второй вариант
//        int counter=0;
//        String[] array = str.split("");
//        Map<String, Integer> map = countWord(array);
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getValue()==1){
//                counter++;
//                if(counter== array.length){
//                    return true;
//                }
//            }
//        }
//        return false;
    }

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

class Test7 {
    public static void main(String[] args) {
        String string = "paOdl";
        System.out.println("Is this isogram? : " + Isogram.isIsogram(string.toLowerCase()));
    }
}
