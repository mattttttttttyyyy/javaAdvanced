package org.example.dodgeball;
//15. Project Dodge-ball
//        Implement a simple dodge-ball game. The player entering the directions up,
//        down, left, right ('W', 'S', 'A', 'D') is supposed to move the pawn on the board
//        with dimensions of 10 x 10. There are 3 other computer players on the board, who make their
//        moves in a random direction every two moves of the player. The player's task is to move his
//        pawn on top of all opponents to knock them down. The capture takes place when the player's pawn
//        is on the same field as the opponent, and it was his turn to move. The game ends when all victims
//        are knocked off the board or the computer kills the player. Enemy pawns can also knock down other pawns -
//        this way you can lose the game.
//
//        The project should use inheritance and an abstract class.
//        Multidimensional arrays should not be used. Use objects and fields to store all data!


import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

    Game game = new Game();
    game.gameEngine();



    }
}
