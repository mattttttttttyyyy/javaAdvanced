package org.codeWars;

import java.util.Objects;

class Person {
    final String name;    // team memnber's name
    final int happiness;  // happiness rating out of 10

    Person(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }
}
public class TheOffice {

    public static String outed(Person[] meet, String boss) {
        int happinessSum = 0;

        for (Person person : meet) {
            happinessSum += person.happiness;
            if(boss.equals(person.name)){
                happinessSum += person.happiness;
            }

        }
        float happiness = (float) happinessSum / meet.length;
        if ( happiness <= 5){
            return "Get Out Now!";
        }else {
            return "Nice Work Champ!";
        }

    }

    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 1),
                new Person("jim", 3),
                new Person("randy", 9),
                new Person("sandy", 6),
                new Person("andy", 7),
                new Person("katie", 6),
                new Person("laura", 9),
                new Person("saajid", 9),
                new Person("alex", 9),
                new Person("john", 9),
                new Person("mr", 8)
        };

        System.out.println(outed(meet, "katie"));
    }


}
