package org.example.escapeRoom;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Key key = new Key();
        Window window = new Window();
        Door door = new Door();

        ArrayList<allElements> available = new ArrayList<>();
        available.add(key);
        available.add(window);
        available.add(door);

        System.out.println(available.toString());


    }
}
