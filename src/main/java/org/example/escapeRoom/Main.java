package org.example.escapeRoom;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Key key = new Key();
        Window window = new Window();
        Door door = new Door();

        ArrayList<allElements> available = new ArrayList<>();
        available.add(key);
        available.add(window);
        available.add(door);

        System.out.println(available);

        ArrayList<allElements> yourObjects = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to escape room!");


        boolean gameIsOn = true;
        while (gameIsOn) {
            System.out.println("--------------------------------------");

            System.out.println("Items in the room: " + available + " your items: " + yourObjects);
            System.out.println("--------------------------------------");
            System.out.println("Pick one: ");
            String choice = scanner.nextLine();
            if (Objects.equals(choice, "key")) {
                yourObjects.add(key);
                key.setInPossession(true);
                available.remove(key);
            } else if (Objects.equals(choice, "window")) {
                window.windowInteraction();
            } else if (Objects.equals(choice, "door")) {
                if (key.isInPossession()) {
                    System.out.println("Door open! \n YOU WIN!");
                    gameIsOn = false;
                } else {
                    System.out.println("Can't open the door");

                }
            }
        }

    }
}
