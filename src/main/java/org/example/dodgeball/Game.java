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
            playground.playgroundSetup(player1, player2, player3);
            Scanner scanner = new Scanner(System.in);
            if (player1.getScore() == 2 || (player1.getPlayerLife() ==1 && player2.getPlayerLife() == 0 && player3.getPlayerLife() == 0)) {
                System.out.println("Congratulation you won!");
                gameIsOn = false;
            } else if (player1.getPlayerLife() == 0) {
                System.out.println("You lost!");
                gameIsOn = false;
            }
            System.out.println("Choose direction: ");
            String movement = scanner.nextLine();
            player1.playerMove(movement);
            player1.checkIfCollide(player1, player2, player3, player1);
            player2.computerMovement();
            player2.checkIfCollide(player2, player1, player3, player2);
            player3.computerMovement();
            player3.checkIfCollide(player3, player1, player2, player3);
            System.out.println("Player 1 score: " + player1.getScore() + " player 2: " + player2.getScore() + " player 3: " + player3.getScore());
            System.out.println("\n \n");



        }

    }
}
