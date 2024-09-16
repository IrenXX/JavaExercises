package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapWork {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Tom", "Soyer", 1);
        Student st2 = new Student("Oleg", "Popov", 2);
        Student st3 = new Student("Mike", "Ivanov", 3);
        linkedHashMap.put(23, st1);
        linkedHashMap.put(56, st3);
        linkedHashMap.put(45, st2);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(23));
        System.out.println(linkedHashMap.get(45));
        System.out.println(linkedHashMap);
    }
}
