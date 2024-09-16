package SetWork;

import java.util.HashSet;
import java.util.Set;

public class HashSetWork {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Oleg");
        set.add("Bob");
        set.add("Jack");

        System.out.println(set);
        set.remove("Oleg");
//        System.out.println(set);
//        set.stream().forEach(System.out::println);
//        System.out.println(set.size());
        System.out.println(set.contains("Bob"));

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(8);
        hashSet.add(3);
        System.out.println("hashSet "+hashSet);
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(5);
        hashSet1.add(8);
        System.out.println("hashSet1 "+hashSet1);

        HashSet<Integer> Union = new HashSet<>(hashSet);
        Union.addAll(hashSet1);
        System.out.println("Union "+Union);

        HashSet<Integer> intersect = new HashSet<>(hashSet);
        intersect.retainAll(hashSet1);
        System.out.println("Общие эл-ты (пересечение)" + intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet);//1-3-8
        subtract.removeAll(hashSet1);
        System.out.println("Эл-ты без пересечения " + subtract);
    }
}
