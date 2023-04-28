package org.example.dodgeball;

public class Playground {

    public void playgroundSetup(PlayerSetup playerSetup, PlayerSetup playerSetup1, PlayerSetup playerSetup2){
        for (int j = 0; j < 10; j++){
            for(int i = 0; i < 10; i++) {
                if( j == playerSetup1.getPositionY() && i == playerSetup1.getPositionX()){
                    System.out.print(" " + playerSetup1.symbol + " ");
                } else if ( j == playerSetup.getPositionY() && i == playerSetup.getPositionX()) {
                    System.out.print(" " + playerSetup.symbol + " ");
                } else if (j == playerSetup2.getPositionY() && i == playerSetup2.getPositionX()) {
                    System.out.print(" " + playerSetup2.symbol + " ");

                } else {
                    System.out.print(" - ");
                }
        }
            System.out.println();

        }
    }

}
