package SetWork;

import java.util.LinkedHashSet;

public class LinkedHashSetWork {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(8);
        linkedHashSet.add(20);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(10);
        System.out.println(linkedHashSet.contains(8));
    }

}
