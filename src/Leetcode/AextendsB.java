package Leetcode;

public class AextendsB {
    public static void main(String[] args) {

        try {
            B b = new B();
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }
    }
}

class A {
    public String string = "Green";

    public A() {
        System.out.println("str: " + getString() + "len: " + getString().length());
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}

class B extends A {
    private String string = "Blue";

    @Override
    public String getString() {
        return string;
    }

    @Override
    public void setString(String string) {
        this.string = string;
    }
}
