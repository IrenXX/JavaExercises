package MentorWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Relations {
    String name;
    short age;
    int growth;

    public Relations(String name, short age, int growth) {
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    public Relations(short age, int growth, String name) {
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    public Relations(int growth, String name, short age) {
        this.name = name;
        this.age = age;
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Human {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                '}';
    }
}

class StrawBerry {
    public static void main1(String[] args) {
        ArrayList<Relations> array = new ArrayList<>();
        array.add(new Relations(177, "Jack", (short) 26));
        array.add(new Relations((short) 34, 167, "Den"));
        array.add(new Relations("Hum", (short) 34, 167));
        System.out.println(array.toString());
        System.out.println(array.size());
    }

    static {
        main(new String[]{"Hello"});
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}