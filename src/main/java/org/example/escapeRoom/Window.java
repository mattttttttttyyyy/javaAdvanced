package org.example.escapeRoom;

public class Window extends allElements {
    private boolean windowOpen = false;

    public boolean isWindowOpen() {
        return windowOpen;
    }

    public Window(){
        this.name = "window";

    }

    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
        }
    public void windowInteraction(){
        if (isWindowOpen()){
            setWindowOpen(false);
            System.out.println("You closed the window");
        } else{
            System.out.println("You opened the window");
            setWindowOpen(true);
        }
    }

    public Window(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }
}
