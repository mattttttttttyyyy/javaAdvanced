package org.example.dodgeball;

public class Playground {

    public void playgroundSetup(PlayerSetup playerSetup, PlayerSetup playerSetup1, PlayerSetup playerSetup2){
        for (int j = 0; j < 10; j++){
            for(int i = 0; i < 10; i++) {
                if( j == playerSetup1.getPositionX() && i == playerSetup1.getPositionY()){
                    System.out.print(" " + playerSetup1.symbol + " ");
                } else if ( j == playerSetup.getPositionX() && i == playerSetup.getPositionY()) {
                    System.out.print(" " + playerSetup.symbol + " ");
                } else if (j == playerSetup2.getPositionX() && i == playerSetup2.getPositionY()) {
                    System.out.print(" " + playerSetup2.symbol + " ");

                } else {
                    System.out.print(" - ");
                }
        }
            System.out.println();

        }
    }

}
