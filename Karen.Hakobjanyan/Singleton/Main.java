package Singleton;

import Singleton.models.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("1", true);
        Car car2 = new Car("2", false);

        CarsAvailability.Cars.putCarOrSetIsCarAvailable(car1.getId(), car1.isAvailable());
        CarsAvailability.Cars.putCarOrSetIsCarAvailable(car2.getId(), car2.isAvailable());

        new Thread(() -> {
                CarsAvailability.Cars.putCarOrSetIsCarAvailable("1", false);
                System.out.println("Thread 1 " + CarsAvailability.Cars.getIsCarAvailable("1"));
        }).start();

         new Thread(() -> {
                 CarsAvailability.Cars.getIsCarAvailable("1");
                 System.out.println("Thread 2 " + CarsAvailability.Cars.getIsCarAvailable("1"));
                 CarsAvailability.Cars.putCarOrSetIsCarAvailable("2", true);
                 List<String> carsIds = CarsAvailability.Cars.getAvailableCarsIds();
                 for (String id : carsIds) {
                     System.out.print("thread 2 " + id + " ");
                 }
             }).start();


        System.out.println("Main " + CarsAvailability.Cars.getIsCarAvailable("1"));
    }
}

