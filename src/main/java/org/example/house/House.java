package org.example.house;
//In this task, you will have to create several objects, give them appropriate properties (fields),
// prepare constructors imposing the appropriate way of completing these characteristics and one behavior (method).
// After creating each object, prepare the toString method for it and test in main whether building project and the
// object methods works correctly, i.e. the object's features have the appropriate values.
//
//        Make a separate package in which you will implement the following:
//        Window objects can be open or closed.
//        The newly created window is closed but can be opened later.
//        Prepare an array of four windows in the program and open all the windows.
//        Bed type objects have a counter on how many days have passed since the last change of bed linen.
//        Each time you create a bed, you need to provide how many days ago the bedding was changed (don't use Scanner, only constructor parameters).
//        Room type objects have one bed and an array of windows.
//        There are two ways to create a room object. Passing the bed and window arrays and the second one using a parameterless constructor.
//        When you’re using the second way, in the room should be an array with two windows and a bed that has not been changed for five days.
//        The room can be cleaned by calling the appropriate method. It is supposed to change the sheets and open all the windows.
//        House objects have an array of rooms.
//        To create a house you need to pass rooms through the constructor.
//        In the program create a house with two rooms: one default and the other, larger, with four windows.


public class House {
    public static void main(String[] args) {
        Window[] windows;
        windows = new Window[4];
        windows[0] = new Window();
        windows[1] = new Window();
        windows[2] = new Window();
        windows[3] = new Window();

        for(Window window : windows){
            System.out.println("Window open: " + window.isWindowOpen());
        }
        Bed bed = new Bed(15);

        Room room1 = new Room(windows, bed);
        Room room2 = new Room();
        room1.windowsStatus();
        room2.windowsStatus();


        System.out.println("Room one bed sheet count: " + room1.bed.getDaysCounter());
        room1.cleanRoom();
        for(Window window : windows) {
            System.out.println("Window open: " + window.isWindowOpen());
        }
        System.out.println("Room one bed: " + room1.bed.getDaysCounter());
        System.out.println("Room two bed: " + room2.bed.getDaysCounter());
        System.out.println("cleaning room two");
        room2.cleanRoom();
        System.out.println("Room two bed: " + room2.bed.getDaysCounter());

        System.out.println("Big room has: " + room1.howManyWindows() + " windows.");
        System.out.println("Big room has: " + room2.howManyWindows() + " windows.");

        room1.windowsStatus();
        room2.windowsStatus();








    }
}
