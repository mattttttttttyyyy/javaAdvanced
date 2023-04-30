package org.majowkaReview.car;

public class Car {

    private String brand;
    private int mileage;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public Car(String brand){
        this.brand = brand;
        this.mileage = 20000;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", mileage=" + mileage;
    }

    public void driveCar(int distance){
        mileage += distance;
    }

    public void serviceChecker(){
        int milesToService = mileage - ((mileage/30000) * 30000);
        System.out.println(brand + " has miles left to service: " + milesToService);

    }
}
