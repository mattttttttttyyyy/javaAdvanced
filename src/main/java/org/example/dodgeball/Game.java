package org.example.dodgeball;

import java.util.Random;
import java.util.Scanner;

public class Game {
    String playerMovement;

    public void gameSetup() {

    }

    public void gameEngine() {
        Random random = new Random();
        PlayerSetup player1 = new PlayerSetup(random.nextInt(10), random.nextInt(10), "O");
        PlayerSetup player2 = new PlayerSetup(random.nextInt(10), random.nextInt(10), "P");
        PlayerSetup player3 = new PlayerSetup(random.nextInt(10), random.nextInt(10), "Z");

        boolean gameIsOn = true;
        while (gameIsOn) {

            Playground playground = new Playground();
            //System.out.println("Player position X: " + player1.getPositionX() + " Y: " + player1.positionY);
            playground.playgroundSetup(player1, player2, player3);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose direction: ");
            player1.checkIfCollide(player1, player2, player3);
            if (player1.getScore() == 2) {
                System.out.println("Congratulation you won!");
                gameIsOn = false;
            }
            String movement = scanner.nextLine();
            player1.playerMove(movement);
            System.out.println("\n \n");



        }

    }
}
