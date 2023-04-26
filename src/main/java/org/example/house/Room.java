package org.example.house;

public class Room {
    Window[] roomWindows;
    Bed bed;

    public Room(Window windows[], Bed bed) {
        this.bed = bed;
        this.roomWindows = windows;


    }
    public Room(){
        Window[] windows;
        windows = new Window[2];
        windows[0] = new Window();
        windows[1] = new Window();
        Bed bed = new Bed(10);
        this.roomWindows = windows;
        this.bed = bed;

    }

    public int howManyWindows(){
        return roomWindows.length;
    }

    public void cleanRoom(){
        for(Window window : roomWindows){
            window.openWindow();
        }
        bed.cleanBed();
    }

    public void windowsStatus(){
        int i = 1;
        for (Window window : roomWindows){
            String windowStatusTXT;
            if (window.isWindowOpen()){
                windowStatusTXT = "open";
            } else {
                windowStatusTXT = "closed";
            }

            System.out.println("Window " + i + " is: " + windowStatusTXT);
            i++;
        }
    }


    public Bed getBed() {
        return bed;
    }
}
