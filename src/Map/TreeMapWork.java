package Map;

import java.util.TreeMap;

public class TreeMapWork {
    public static void main(String[] args) {
        //сортировка по Integer
        TreeMap<Integer, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Tom","Soyer",1);
        Student st2 = new Student("Oleg","Popov",2);
        Student st3 = new Student("Mike","Ivanov",3);
        treeMap.put(23,st1);
        treeMap.put(56,st3);
        treeMap.put(45,st2);
        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.get(90));
        System.out.println(treeMap.descendingMap());//перевернуть MAP
        System.out.println(treeMap.headMap(30));//вывести значения меньше key<30

//         Student implement Comparable сделан, для реализации сортировки
//        TreeMap <Student, Integer> treeMap = new TreeMap<>();

// второй способ - сразу реализовать Comparator
//        TreeMap <Student, Integer> treeMap1 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.compareTo(o2.name);
//            }

//            treeMap.put(st1,12);
//            treeMap.put(st3,32);
//            treeMap.put(st2,56);
//        System.out.println(treeMap);
    }
}
