package org.example.escapeRoom;

public class Door extends allElements {
    boolean doorOpen = false;
    public Door(){
        this.name = "door";

    }
    public Door(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
}
