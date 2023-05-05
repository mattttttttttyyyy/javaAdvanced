package org.example.streamChallangeP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PersonDemo {
    //za zadanię można otrzymać 14 punktów po 1 za każdą zaimplementowaną abstrakcyjną metodę

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Zbyszek", "Kasia", "Zosia", "Kasia", "Magda", "Iza"));
        int[] primeNumbers = {2, 79, 83, 41, 43, 47, 53, 59, 13, 17, 83, 31,
                37, 61, 67, 89, 3, 5, 7, 7, 11, 71, 73, 97, 19, 19, 23, 29};

        StreamService streamService = new MyStreamService();

        streamService.sortAndPrint(names);

        //miejsce na Twoje testy zaimplementowanych metod. Jeśli umiesz możesz wykonać testy jednostkowe udowadniające
        //poprawne działanie zaimplementowanych metod
        System.out.println(streamService.distinctAndCountNumbers(primeNumbers));
        System.out.println(streamService.computeMaleNames(names));
        streamService.printNumbersOfRange(primeNumbers, 10, 20);
        streamService.computeNamesLength(names);

        //List<Person> people = streamService.buildPeopleWithNames(names);
        //od tego momentu wykorzystuj również zbiór people do testu metod wykorzystujących argument List<Person>

        Random random = new Random();
        NameGenerator nameGenerator = new NameGenerator();
        System.out.println("\n");
        System.out.println(nameGenerator.randomName(random.nextInt(nameGenerator.nameBaseLegth())));
    }

}
