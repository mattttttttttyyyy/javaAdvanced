package org.majowkaReview.car;

import java.util.ArrayList;

public class CarDemo {
    public static <Int> void main(String[] args) {
        ArrayList<Car> car = new ArrayList<>();
        car.add(new Car("Toyota", 15060));
        car.add(new Car("BMW", 65000));
        car.add(new Car("Honda"));

        for (Car value : car) {
            value.serviceChecker();
        }
        for (Car value : car) {
            System.out.println(value);
        }

        car.get(1).driveCar(7777);
        System.out.println(car.get(1).toString());







    }
}
