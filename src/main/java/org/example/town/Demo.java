package org.example.town;

public class Demo {
    public static void main(String[] args) {
        Town krakow = new Town();
        Citizen[] citizens = new Citizen[]{new Peasant("Jan"), new Soldier("Wojak")};
        krakow.canVote(citizens[1]);



    }
}
