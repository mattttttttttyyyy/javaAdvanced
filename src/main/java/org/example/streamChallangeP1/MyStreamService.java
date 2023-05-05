package org.example.streamChallangeP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamService implements StreamService {

    @Override
    public void sortAndPrint(List<String> names) {


        names.stream().sorted().forEachOrdered(System.out::println);


    }

    @Override
    public int distinctAndCountNumbers(int[] numbers) {



        return 0;
    }

    @Override
    public List<String> computeMaleNames(List<String> names) {
        names.removeIf(name -> name.charAt(name.length() - 1) != 'a');
        return names;
    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {
        for (int number : numbers)
            if (number >= minValue && number <= maxValue) System.out.print(number + " ");


    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        return names.stream().map(String::length).collect(Collectors.toList());
    }

    @Override
    public List<Person> buildPeopleWithNames(List<String> names) {
        return null;
    }

    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        return null;
    }

    @Override
    public boolean hasSenior(List<Person> people) {
        return false;
    }

    @Override
    public double sumTotalCash(List<Person> people) {
        return 0;
    }

    @Override
    public Person findRichestPerson(List<Person> people) {
        return null;
    }

    @Override
    public double computeAverageAge(List<Person> people) {
        return 0;
    }
}
