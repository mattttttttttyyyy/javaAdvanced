package org.example.dodgeball;

public class PlayerSetup {
    int positionX;
    int getPositionY;
    String name;
    int score;
    String symbol;

    public PlayerSetup(int positionX, int getPositionY, String symbol) {
        this.positionX = positionX;
        this.getPositionY = getPositionY;
        this.symbol = symbol;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return getPositionY;
    }

    public void playerMove(String direction){


    }
}
