package org.example.town;

public class Demo {
    public static void main(String[] args) {

        Citizen[] citizens = new Citizen[]{new Peasant("Wieśniak"), new Townsman("Mieszczuch"),
                new Soldier("Wojak"), new King("Król"), new Townsman("Mieszczuch 2")};
        Town krakow = new Town();

        System.out.println("There is: " + krakow.howManyCanVote(citizens) + " voters.");
        System.out.println(krakow.whoCanVote(citizens));

    }
}
