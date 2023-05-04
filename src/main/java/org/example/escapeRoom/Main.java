package org.example.escapeRoom;

import java.util.ArrayList;
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
            String choice = scanner.nextLine().toLowerCase();
            gameIsOn = isGameIsOn(key, window, available, yourObjects, gameIsOn, choice);
        }

    }

    private static boolean isGameIsOn(Key key, Window window, ArrayList<allElements> available, ArrayList<allElements> yourObjects, boolean gameIsOn, String choice) {
        switch (choice) {
            case "key" -> {
                yourObjects.add(key);
                key.setInPossession(true);
                available.remove(key);
            }
            case "window" -> window.windowInteraction();
            case "door" -> {
                if (key.isInPossession()) {
                    System.out.println("Door open! \n YOU WIN!");
                    gameIsOn = false;
                } else {
                    System.out.println("Can't open the door");

                }
            }
        }
        return gameIsOn;
    }
}
