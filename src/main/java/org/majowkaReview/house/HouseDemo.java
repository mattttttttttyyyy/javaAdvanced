package org.majowkaReview.house;

import java.util.ArrayList;

public class HouseDemo {
    public static void main(String[] args) {
        House house = new House(new ArrayList<>());
        ArrayList<Window> windowArrayList = new ArrayList<>();
        windowArrayList.add(new Window());
        windowArrayList.add(new Window());
        windowArrayList.add(new Window());

        house.rooms.add(new Room("Sypialnia 1"));
        house.rooms.add(new Room(windowArrayList, new Bed(10), "Sypialnia 2"));

        System.out.println(house.rooms.get(0));
        System.out.println(house.rooms.get(1));
        house.rooms.get(0).cleanRoom();
        house.rooms.get(1).cleanRoom();
        System.out.println(house.rooms.get(0));
        System.out.println(house.rooms.get(1));

    }
}
