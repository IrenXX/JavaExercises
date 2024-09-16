package NestedClassWork;

public class LocalInnerClassWork {
    public static void main(String[] args) {
        Math math = new Math();
        math.gerResult();
    }
}

class Math {
    private int a = 10;

    public void gerResult() {
        final int delimoe = 21;
        class Delenie {
            //            private int delimoe;
            private int delitel;

            //            public int getDelimoe() {
//                return delimoe;
//            }
            public int getDelitel() {
                return delitel;
            }

            //            public void setDelimoe(int delimoe) {
//                System.out.println(a);
//                this.delimoe = delimoe;
//            }
            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChasnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
        delenie.setDelitel(3);
        System.out.println("делимое = " + delimoe);
        System.out.println("делитель = " + delenie.getDelitel());
        System.out.println("часное = " + delenie.getChasnoe());
        System.out.println("остаток от деления = " + delenie.getOstatok());
    }

}