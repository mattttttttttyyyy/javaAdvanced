package org.example.workshop;

public class Wheels {
    double tirePressure = 2.5;

    public void setTirePressure(double tirePressure) {
        this.tirePressure = tirePressure;
    }

    public void pumpTire(double amount) {
        tirePressure += amount;

    }
}
