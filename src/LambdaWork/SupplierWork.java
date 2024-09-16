package LambdaWork;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierWork {
    public static ArrayList<Car> createCar(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> createCars = createCar(() -> new Car("BMV", "V6", 300.0));
        System.out.println(createCars);
        changeCar(createCars.get(0), car -> {
            car.brand = "Mercedes";
            car.model = "V3";
            System.out.println("Upgrade " + car);
        });
    }
}

class Car {
    String brand;
    String model;
    double engane;

    public Car(String brand, String model, double engane) {
        this.brand = brand;
        this.model = model;
        this.engane = engane;
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engane=" + engane +
                '}';
    }
}
