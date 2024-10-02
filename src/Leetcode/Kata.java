package Leetcode;

class Kata {
    public static String getMiddle(String word) {
        int index = word.length();

        return (index % 2 == 0) ?
                word.substring((index / 2) - 1, (index / 2) + 1) :
                word.substring((index / 2), (index / 2) + 1);
    }
}

class Test5 {
    public static void main(String[] args) {
        String str = "Willbbdebv";
        System.out.println(Kata.getMiddle(str));
    }
}