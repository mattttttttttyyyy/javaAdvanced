package org.example.dodgeball;

public class Playground {

    public void playgroundSetup(PlayerSetup playerSetup, PlayerSetup playerSetup1, PlayerSetup playerSetup2){
        for (int j = 0; j < 10; j++){
            for(int i = 0; i < 10; i++) {
                if( j == playerSetup1.getPositionY() && i == playerSetup1.getPositionX()){
                    if(playerSetup1.getPlayerLife() == 0){
                        System.out.print(" - ");
                    }else{
                        System.out.print(" " + playerSetup1.getSymbol() + " ");
                    }

                } else if ( j == playerSetup.getPositionY() && i == playerSetup.getPositionX()) {
                    if(playerSetup.getPlayerLife() == 0){
                        System.out.print(" - ");
                    }else{
                        System.out.print(" " + playerSetup.getSymbol() + " ");
                    }
                } else if (j == playerSetup2.getPositionY() && i == playerSetup2.getPositionX()) {
                    if(playerSetup2.getPlayerLife() == 0){
                        System.out.print(" - ");
                    }else{
                        System.out.print(" " + playerSetup2.getSymbol() + " ");
                    }

                } else {
                    System.out.print(" - ");
                }
        }
            System.out.println();

        }
    }

}
