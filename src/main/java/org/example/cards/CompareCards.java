package org.example.cards;

public class CompareCards {
    public CompareCards(Card card1, Card card2){
        if(card1.getCardsRank() > card2.getCardsRank()){
            System.out.println(card1 + "is stronger!");

        } else {
            System.out.println(card2 + "is stronger!");
        }
    }
}
