package org.example.workshop;

public class WorkshopDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.tireStatus();
        System.out.println("\n ---------------------------- \n");
        car1.flatTire();
        System.out.println("\n ---------------------------- \n");
        car1.tireStatus();
        System.out.println("\n ---------------------------- \n");
        Workshop.acceptCar();
        System.out.println("\n ---------------------------- \n");
        Workshop.inspectCarAndFix(car1);
        System.out.println("\n ---------------------------- \n");
        car1.flatTire();
        System.out.println("\n ---------------------------- \n");
        Workshop.inspectCarAndFix(car1);


    }
}
