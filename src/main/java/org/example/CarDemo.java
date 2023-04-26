package org.example;

//1. Create a class of type Car and CarDemo with the main method.
// In the main method create two car objects.Objects of type
// Car must have the following characteristics: brand, mileage and
// mileage for review, the last one supplemented with a value, e.g.
// 20,000 km. In the main method, give values ​​for the features
// of the previously created cars.
//
//        For objects type Car prepare the following behaviors
//        and test them in the main method:
//        - create a method that displays the car brand and mileage,
//        - create a method that takes the distance to be driven and
//        increases the car's mileage by that distance,
//        - create a method that returns the number of kilometers after
//        which you will need to perform the inspection
//        (taking into account the current mileage).
//
//        more difficult variant: create an array of cars in
//        main and then, using a loop, display the data of each of them.

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

//        Line line = new Line(20, "#");
//        System.out.println(line.linePrint());
//        Line line2 = new Line(20, "*");
//        System.out.println(line2.linePrint());
        Rectangle rectangle = new Rectangle(5, 20, "*");
        rectangle.printRectangle();









    }
}