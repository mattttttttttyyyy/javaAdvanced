package org.example.dodgeball;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public void gameEngine() {
        Result result = getResult();

        boolean gameIsOn = true;
        int round = 0;
        while (gameIsOn) {

            Playground playground = new Playground();
            playground.playgroundSetup(result.player1(), result.player2(), result.player3());
            Scanner scanner = new Scanner(System.in);
            if (isaBoolean(result.player1()) || isaBoolean(result.player1(), result.player2(), result.player3())) {
                System.out.println("Congratulation you won!");
                gameIsOn = false;
                continue;
            } else if (result.player1().getPlayerLife() == 0) {
                System.out.println("You lost! ☠");
                gameIsOn = false;
                continue;
            }
            System.out.println("Choose direction: ");
            String movement = scanner.nextLine();
            result.player1().playerMove(movement);
            result.player1().checkIfCollide(result.player1(), result.player2(), result.player3(), result.player1());
            round = getRound(result, round);

            System.out.println("Player 1 score: " + result.player1().getScore() + " player 2: " + result.player2().getScore() + " player 3: " + result.player3().getScore());
            round++;
            System.out.println("\n \n");



        }

    }

    private int getRound(Result result, int round) {
        if (round == 2){
            result.player2().computerMovement();
            result.player2().checkIfCollide(result.player2(), result.player1(), result.player3(), result.player2());
            result.player3().computerMovement();
            result.player3().checkIfCollide(result.player3(), result.player1(), result.player2(), result.player3());
            round = 0;
        }
        return round;
    }

    private Result getResult() {
        Random random = new Random();
        PlayerSetup player1 = new PlayerSetup(random.nextInt(10), random.nextInt(10), "☺");
        PlayerSetup player2 = new PlayerSetup(random.nextInt(10), random.nextInt(10), "♟");
        PlayerSetup player3 = new PlayerSetup(random.nextInt(10), random.nextInt(10), "♟");
        return new Result(player1, player2, player3);
    }

    private record Result(PlayerSetup player1, PlayerSetup player2, PlayerSetup player3) {
    }

    private boolean isaBoolean(PlayerSetup player1, PlayerSetup player2, PlayerSetup player3) {
        return player1.getPlayerLife() == 1 && player2.getPlayerLife() == 0 && player3.getPlayerLife() == 0;
    }

    private boolean isaBoolean(PlayerSetup player1) {
        return player1.getScore() == 2;
    }
}
