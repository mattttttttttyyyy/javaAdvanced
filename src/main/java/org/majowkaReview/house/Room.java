package org.majowkaReview.house;

import java.util.ArrayList;

public class Room {
    ArrayList<Window> windows;
    Bed bed;
    String roomName;

    public Room(ArrayList<Window> windows, Bed bed, String roomName) {
        this.windows = windows;
        this.bed = bed;
        this.roomName = roomName;
    }

    public Room(String roomName){
        ArrayList<Window> windowArrayList = new ArrayList<>();
        windowArrayList.add(new Window());
        windowArrayList.add(new Window());
        this.windows = windowArrayList;
        this.bed = new Bed(5);
        this.roomName = roomName;
    }

    public void cleanRoom(){
        for (Window window : windows) {
            window.setOpen(true);
        }
        bed.setDaysSinceCleanup(0);
        System.out.println(roomName + " is being cleaned.");
    }

    @Override
    public String toString() {
        String windowsStatus;
        if (windows.get(0).isOpen()){
            windowsStatus = "open";
        } else {
            windowsStatus = "closed";
        }
        return roomName + " has " + windows.size() + " windows, they are " + windowsStatus +
                " and bed was changed " + bed.getDaysSinceCleanup() + " days ago.";
    }
}
