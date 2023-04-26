package org.example.workshop;

public class WorkshopDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.tireStatus();
        car1.flatTire();
        car1.tireStatus();
        Workshop.acceptCar();
        Workshop.inspectCarAndFix(car1);

    }
}
