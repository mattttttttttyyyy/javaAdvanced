package org.majowkaReview.car;

public class Bus {

    String name;
    int mileage;
    int capacity;

    public Bus(String name, int mileage, int capacity) {
        this.name = name;
        this.mileage = mileage;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
