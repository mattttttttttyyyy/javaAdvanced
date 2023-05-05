package org.example.fridayMay;
/*
36. Using ready-made functional interface classes (Function, Consumer, Supplier, Comparator, Predicate) implement and test 5 functions:
        - a function that accepts a text and returns its length,
        - a function that checks whether the submitted text has at least 5 characters,
        - a function that supplies a random double between 0.1-0.5,
        - a function to print text in capital letters.
*/

import java.util.Random;
import java.util.function.*;


public class FunctionalInterfaces {



    public static void main(String[] args) {
        String textTester = "Text for testing the functions";
        Function<String, Integer> lengthCounter = String::length;
        Predicate<String> checkIfFiveLetter = text -> text.length() == 5;
        Supplier<Double> randomDouble = () -> new Random().nextDouble(0.1, 0.5);
        Consumer<String> toCapital = text -> System.out.println(text.toUpperCase());

        System.out.println(lengthCounter.apply(textTester));
        System.out.println(checkIfFiveLetter.test(textTester));
        System.out.println(randomDouble.get());
        toCapital.accept(textTester);
    }


}
