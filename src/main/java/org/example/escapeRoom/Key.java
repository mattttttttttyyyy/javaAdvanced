package org.example.escapeRoom;

public class Key extends allElements {

    private boolean inPossession = false;


    public Key(boolean inPossession) {
        this.inPossession = inPossession;
    }
    public Key(){
        this.name = "key";

    }

    public void setInPossession(boolean inPossession) {
        this.inPossession = inPossession;
    }

    public boolean isInPossession() {
        return inPossession;
    }
}
