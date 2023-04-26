package org.example;
//1. Create a class of type Car and CarDemo with the main method.
// In the main method create two car objects.Objects of type
// Car must have the following characteristics: brand, mileage and
// mileage for review, the last one supplemented with a value, e.g.
// 20,000 km. In the main method, give values or the features
// of the previously created cars.
//
//        For objects type Car prepare the following behaviors
//        and test them in the main method:



//
//        more difficult variant: create an array of cars in
//        main and then, using a loop, display the data of each of them.

public class Car {
    String brand;
    int mileage;
    int distance;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
        mileage = mileage + distance;
    }


//        - create a method that displays the car brand and mileage,

    public String getBrandAndMileage(){
        return "Car brand: "+ brand + ", car mileage: " +mileage + "Km";

    }
    //- create a method that takes the distance to be driven and
    //increases the car's mileage by that distance,

    public void carRides(int distance){
        this.mileage = mileage + distance;

    }

    //- create a method that returns the number of kilometers after
    //        which you will need to perform the inspection
    //        (taking into account the current mileage).
    public int howMuchToInspection(){
        float servicePeriods = (float) (mileage / 30000);
        return (mileage - Math.round(30000 * servicePeriods));
    }


}
