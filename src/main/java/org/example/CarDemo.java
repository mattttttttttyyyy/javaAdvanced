package org.example;

public class CarDemo {
    public static void main(String[] args) {
        Car[] cars;
        cars = new Car[3];
        cars[0] = new Car("Toyota", 55000);
        cars[1] = new Car("BMW", 120220);
        cars[2] = new Car("Renault", 66850);

        for (Car car : cars) {
            System.out.println(car.getBrandAndMileage());
        }

        System.out.println("\n Checking distance to service: \n");
        for (Car car : cars) {
            System.out.println(car.brand + " has " + car.howMuchToInspection() + " left to service.");
        }

        System.out.println("\n All cars are driving for another 25k Km \n");

        for (Car car : cars) {
            car.setDistance(25000);
        }

        System.out.println("\n New details: ");
        for (Car car : cars) {
            System.out.println(car.getBrandAndMileage());
        }

        System.out.println("\n New left to service: ");
        for (Car car : cars) {
            System.out.println(car.brand + " has " + car.howMuchToInspection() + " left to service.");
        }











    }
}