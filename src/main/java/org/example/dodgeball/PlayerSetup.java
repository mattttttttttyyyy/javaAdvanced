package org.example.dodgeball;

import java.util.Objects;
import java.util.Random;

public class PlayerSetup {
    private int positionX;
    private int positionY;
    private String name;
    private int score;
    private String symbol;
    int playerLife = 1;

    public PlayerSetup(int positionX, int positionY, String symbol) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
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
    public String getPlayerPosition(){
        return "Position X: " + positionX + " position Y: " + positionY;
    }

    public String getName() {
        return name;
    }
    public void looseLife(){
        playerLife -= 1;
    }

    public int getPlayerLife() {
        return playerLife;
    }

    public void gainPoint(){
        score += 1;
    }

    public int getScore() {
        return score;
    }

    public void checkIfCollide (PlayerSetup player1, PlayerSetup player2, PlayerSetup player3, PlayerSetup movingPlayer){
        if (Objects.equals(player1.getPlayerPosition(), player2.getPlayerPosition()) && movingPlayer == player1){
            player2.looseLife();
            movingPlayer.gainPoint();
        } else if (Objects.equals(player1.getPlayerPosition(), player3.getPlayerPosition()) && movingPlayer == player1) {
            player3.looseLife();
            movingPlayer.gainPoint();
        }
    }
}
