package org.example.fridayMay;
/*
Create a Printer interface with one method, print, which takes a String argument, use this
interface to implement a lambda function:
        - a screaming function that displays text in uppercase and adds an exclamation mark,
        -  (difficult) a function that displays a string created from the first letter of each word.




*/

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

interface Printer{
    String print(String text);
}
   /* Create Generator interface with one method generate that returns int.
        implement it using lambda expression to return random value of range 1-10*/
interface Generator{
    int generate();
}

  /*     Create TextConverter interface with proper abstract method and use it to create lambda expressions that take text
        fragment and count and return as int how many dots symbols (“.”) were used in the text.
*/

interface TextConverter{
    int dotCounter(String sentence);

}

public class Practice2 {
    public static void main(String[] args) {
        AtomicReference<String> messedUpString = new AtomicReference<>("");
        Printer scream = (String text) -> {
            return text.toUpperCase() + "!";
        };
        Printer messUpString = (String text) -> {
            for (String word : text.split(" ")) {
                messedUpString.updateAndGet(v -> v + word.charAt(0));
            }

                return String.valueOf(messedUpString);
        };

        System.out.println(messUpString.print("Testing the string mess up method"));
        System.out.println(scream.print("Testing the string scream method"));
        Random random = new Random();
        Generator generate = () -> {
            return random.nextInt(1,11);
        };

        System.out.println(generate.generate());
        TextConverter countDots = (String enterSentence) -> {
            char dots = '.';
            int count = 0;

            for (int i = 0; i < enterSentence.length(); i++) {
                if (enterSentence.charAt(i) == dots) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(countDots.dotCounter("Stanisław August z Bożej łaski i woli Narodu Król Polski, Wielki Książe Litewski, " +
                "Ruski, Pruski, Mazowiecki, Żmudzki, Kijowski, Wołyński, Podolski, Inflancki, Smoleński, Siewierski i Czerniechowski, " +
                "wraz z stanami skonfederowanemi, w liczbie podwójnej Naród Polski reprezentującemi, uznając, iż los nas wszystkich od " +
                "ugruntowania i wydoskonalenia konstytucji narodowej jedynie zawisł, długim doświadczeniem poznawszy zadawnione rządu naszego wady, " +
                "a chcąc korzystać z pory, w jakiej się Europa znajduje, i z tej dogorywającej chwili, która nas samym sobie wróciła, wolni od " +
                "hańbiących obcej przemocy nakazów, ceniąc drożej nad życie, nad szczęśliwość osobistą egzystencyją polityczną, niepodległość zewnętrzną i " +
                "wolność wewnętrzną narodu, którego los w ręce nasze jest powierzony, chcąc oraz na błogosławieństwo, na wdzięczność współczesnych " +
                "i przyszłych pokoleń zasłużyć, mimo przeszkód, które w nas namiętności sprawować mogą, dla dobra powszechnego, dla ugruntowania wolności, " +
                "dla ocalenia ojczyzny naszej i jej granic, z największą stałością ducha niniejszą konstytucję uchwalamy i tę całkowicie za świętą, " +
                "za niewzruszoną deklarujemy, dopóki by naród w czasie, prawem przepisanym, wyraźną wolą swoją nie uznał potrzeby odmienienia w niej " +
                "jakiego artykułu. Do której to konstytucji dalsze ustawy sejmu teraźniejszego we wszystkiem stosować się mają."));
    }
}
