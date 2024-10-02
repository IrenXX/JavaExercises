package Leetcode;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}

class Test3{
    public static void main(String[] args) {
        String str = "Whates happena";
        System.out.println(Troll.disemvowel(str));
    }
}