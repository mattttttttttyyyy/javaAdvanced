package org.example.dodgeball;

import java.util.Random;

public class PlayerSetup {
    int positionX;
    int positionY;
    String name;
    int score;
    String symbol;

    public PlayerSetup(int positionX, int positionY, String symbol) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.symbol = symbol;
    }

    public int getPositionX() {
        if (positionX > 9){
            return positionX = 9;
        } else if (positionX < 0){
            return positionX = 0;
        }
        return positionX;
    }

    public int getPositionY() {
        if (positionY > 9){
            return positionY = 9;
        } else if (positionY < 0){
            return positionY = 0;
        }
        return positionY;
    }

    public void playerMove(String direction) {
        switch (direction.toUpperCase()) {
            case "W" -> positionY -= 1;
            case "S" -> positionY += 1;
            case "A" -> positionX -= 1;
            case "D" -> positionX += 1;
        }
    }

    public void computerMovement() {
        Random random = new Random();
        int move = random.nextInt(4);
        switch (move) {
            case 0 -> positionY -= 1;
            case 1 -> positionY += 1;
            case 2 -> positionX -= 1;
            case 3 -> positionX += 1;
        }
    }
}
