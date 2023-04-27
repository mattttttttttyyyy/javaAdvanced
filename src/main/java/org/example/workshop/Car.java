package org.example.workshop;

import java.util.Random;

public class Car {
    private Wheels[] wheels;
    private int serviceHistory = 0;

    public Car() {
        wheels = new Wheels[4];
        wheels[0] = new Wheels();
        wheels[1] = new Wheels();
        wheels[2] = new Wheels();
        wheels[3] = new Wheels();

    }


    public void flatTire(){
        Random random = new Random();
        int randomWheel = random.nextInt(4);
        wheels[randomWheel].setTirePressure(0);
        System.out.println("Wheel nr: " + (randomWheel+1) + " got a flat!");
    }

    public void tireStatus() {
        int i = 1;
        for (Wheels wheels : wheels){
            System.out.println("Tire "+ i + " pressure is: " + wheels.tirePressure);
            i++;
        }
    }

    public double eachTire(int i){
        return wheels[i].tirePressure;
    }
    public void pumpingTire(int tireNumber, double pumpingAmount){
        wheels[tireNumber].pumpTire(pumpingAmount);
    }

    public void performedService(){
        serviceHistory +=1;
    }


    public static void main(String[] args) {

    }

    public int getServiceHistory() {
        return serviceHistory;
    }

}
