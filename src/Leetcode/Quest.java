package Leetcode;

public class Quest {
    private final String name;

    public Quest(String name) {
        this.name = name;
    }

    private String name() {
        return name;
    }

    private void reproduce() {
        new Quest("reproduce") {
            void printName() {
                System.out.println(Quest.this.name());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Quest("main").reproduce();
    }
}
