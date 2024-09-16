package NestedClassWork;

public class InnerClassWork {
    String color;
    private int doors;
    Engine engine;

    public InnerClassWork(String color, int doors) {
        this.color = color;
        this.doors = doors;
     //   this.engine = this.new Engine(horsePower);
    }
    @Override
    public String toString() {
        return "My Car {" +
                "color='" + color + '\'' +
                ", doors= " + doors +
                ", engine= " + engine +
                '}';
    }

    void setEngine (Engine engine){
        Engine e = new Engine(300);
        System.out.println(e.horsePower);
        
        System.out.println(doors);
        this.engine = engine;
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }
        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower= " + horsePower +
                    '}';
        }
    }
}
class Test3 {
    public static void main(String[] args) {
     InnerClassWork car = new InnerClassWork("Black",4);
     InnerClassWork.Engine engine = car.new Engine(300);
     car.setEngine(engine);
        System.out.println(car);
        System.out.println(System.identityHashCode(car));
    }
}