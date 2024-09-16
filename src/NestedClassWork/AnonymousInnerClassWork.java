package NestedClassWork;

interface Math2 {
    int doOperation(int a, int b);
}

public class AnonymousInnerClassWork {
    private int x = 5;

    public static void main(String[] args) {
        Math2 m = new Math2() {
            int a = 10;

            void abc() {
            }

            @Override
            public int doOperation(int a, int b) {
                AnonymousInnerClassWork nn = new AnonymousInnerClassWork();
                return a + b + nn.x;
            }
        };
        Math2 m2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(1, 2));
        System.out.println(m2.doOperation(3, 2));
    }
}