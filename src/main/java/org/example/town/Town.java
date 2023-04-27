package org.example.town;
//Create an abstract class Citizen and inherit classes:
//        Peasant,
//        Townsman,
//        King,
//        Soldier.
//        All classes have a name field (think about where this field should be).
//        Citizen should be an abstract class that has an abstract method 'canVote'
//        which returns true for townsman and soldier but false for peasant and king.
//
//        Create a Town class that has a collection of Citizen objects.
//        Add some citizens to it (by creating them in main). The Town object should have methods:
//        - howManyCanVote - which returns the number of people who can vote,
//        - whoCanVote - which prints the names of people who can vote.

public class Town{
    Citizen[] citizens;

    public void setCitizens(Citizen citizens) {
        this.citizens = new Citizen[]{citizens};
    }

    public Citizen[] getCitizens() {
        return citizens;
    }
    public void canVote(Citizen citizen){
        System.out.println(citizen.name + " test");
    }


    public void setCitizens(Citizen[] citizens) {
        this.citizens=citizens;
    }
}
