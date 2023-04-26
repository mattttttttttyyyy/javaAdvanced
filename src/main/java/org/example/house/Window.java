package org.example.house;

public class Window {
    boolean windowOpen = false;

    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    public boolean isWindowOpen() {
        return windowOpen;
    }

    public void openWindow(){
        windowOpen = true;
    }


}
