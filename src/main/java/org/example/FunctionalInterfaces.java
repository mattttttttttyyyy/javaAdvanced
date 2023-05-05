package org.example;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

    Thread thread = new Thread(() -> System.out.println("hello"));
    thread.start();

    //Consumer - retrieve something and don't return anything:  (T) -> void
    Consumer<String> printer = text -> System.out.println(text);

    //Supplier - don't retrieve anything and return something: () -> T
    Supplier<String> nameGenerator = () -> {
        String[] names = {"Patrycja", "Kamila", "Mateusz", "Jakub"};
        return names[new Random().nextInt(names.length)];
    };
    System.out.println(nameGenerator.get());

    Function<Integer, String> nameDuplicates = (Integer repetition) ->
            nameGenerator.get().concat(" ").repeat(repetition);
    System.out.println(nameDuplicates.apply(3));
    //Function - retrieve something and return something of different type: (T) -> R

    BinaryOperator<String> connectText = (text1, text2) -> text1 + " " + text2;
    System.out.println(connectText.apply(nameGenerator.get(), nameGenerator.get()));
    //Operator - the case when function has the same parameter and same return type: (T) -> T
    Predicate<Integer> isItNegative = number -> number >= 0;
    System.out.println(isItNegative.test(-1));
    //Predicate - test parameter of the method returning boolean: (T) -> boolean

    //Runnable
    //Comparator
    //ActionListener
}
}
