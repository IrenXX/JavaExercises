package NestedClassWork;

public class Car {
    String color;
    int doors;
    Engine engine;
    private static int a;

    public Car(String color, int doors, Engine engine) {
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }
    void metod (){
        Engine eng = new Engine(300);
        System.out.println(Engine.countOfObjects);
        System.out.println(eng.horsePower);
    }
    @Override
    public String toString() {
        return "My Car {" +
                "color='" + color + '\'' +
                ", doors= " + doors +
                ", engine= " + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(a);
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine {" +
                    "horsePower= " + horsePower +
                    '}';
        }
    }
}
 class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
 }