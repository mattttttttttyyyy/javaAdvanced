package org.example.cards;

public class CompareCards {
    public void cardFight(Card card1, Card card2){
        System.out.println(card1 + " vs " + card2);
        if(card1.getCardsRank() > card2.getCardsRank()){
            System.out.println(card1 + " is stronger!");

        } else if (card2.getCardsRank() > card1.getCardsRank()){
            System.out.println(card2 + " is stronger!");
        } else {
            System.out.println("Cards are equal!");
        }


    }
}
