package org.example.streamChallangeP1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Kolejka {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();
        NameGenerator nameGenerator = new NameGenerator();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            customers.add(nameGenerator.randomName(random.nextInt(nameGenerator.nameBaseLegth())));

        }
        System.out.println(customers);
    }
}
