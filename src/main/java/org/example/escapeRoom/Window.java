package org.example.escapeRoom;

public class Window extends allElements {
    boolean windowOpen = false;

    public boolean isWindowOpen() {
        return windowOpen;
    }

    public Window(){

    }

    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    public Window(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }
}
