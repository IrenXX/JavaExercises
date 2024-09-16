package Map;

import java.util.HashMap;
import java.util.Map;

public class MapWork {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Zaur");
        map.put(345, "Ivan");
        map.put(456, "Nikolay");
        map.putIfAbsent(367, "Pirat");
        System.out.println(map);
        System.out.println(map.get(345));
        System.out.println(map.containsValue("Pirat"));
        System.out.println(map.keySet());
    }
}
