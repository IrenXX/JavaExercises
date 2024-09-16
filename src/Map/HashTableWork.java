package Map;

import java.util.Hashtable;

public class HashTableWork {
    public static void main(String[] args) {
        Hashtable<Integer, Student> hashTable = new Hashtable<>();
        Student st1 = new Student("Tom", "Soyer", 1);
        Student st2 = new Student("Oleg", "Popov", 2);
        Student st3 = new Student("Mike", "Ivanov", 3);
        hashTable.put(23, st1);
        hashTable.put(56, st3);
        hashTable.put(45, st2);
        System.out.println(hashTable);
    }
}
