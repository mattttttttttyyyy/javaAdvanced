package org.example.house;

public class Bed {
    int daysCounter;

    public Bed(int daysCounter) {
        this.daysCounter = daysCounter;
    }

    public int getDaysCounter() {
        return daysCounter;
    }

    public void cleanBed(){
        daysCounter = 0;
    }
}
