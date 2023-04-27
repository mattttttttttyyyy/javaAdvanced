package org.example.cards;

 /*
Create a Card object. The card will be described by two enum class fields Rank (Rank, e.g. nine, ace)
 and Suit (Color - e.g. spades). Create any two cards in the main, differing in rank and suit, present
 them using the overridden toString method.In the main display all possible ranks using the
 static method of enums - values(). Each of the ranks is supposed to have a strength assigned to it, for two 2,
 for three 3, etc.Card objects are supposed to have a method to retrieve the strength of the card.
 Create an additional class with a method to compare two cards, showing the larger one.Make a list of all
 possible spade-suited cards. (use loops to automate the task). Create an entire deck, i.e.
 a list of all possible cards for all possible suits and ranks.
*/


public class Card {
    CardsSuit cardsSuit;
    CardsRank cardsRank;

    public Card(CardsSuit cardsSuit, CardsRank cardsRank) {
        this.cardsSuit = cardsSuit;
        this.cardsRank = cardsRank;
    }

    public Card(CardsSuit cardsSuit, int cardS) {
        this.cardsSuit = cardsSuit;
        switch (cardS){
            case 2: this.cardsRank = CardsRank.TWO;
            case 3: this.cardsRank = CardsRank.THREE;
            case 4: this.cardsRank = CardsRank.FOUR;
            case 5: this.cardsRank = CardsRank.FIVE;
            case 6: this.cardsRank = CardsRank.SIX;
            case 7: this.cardsRank = CardsRank.SEVEN;
            case 8: this.cardsRank = CardsRank.EIGHT;
            case 9: this.cardsRank = CardsRank.NINE;
            case 10: this.cardsRank = CardsRank.TEN;
            case 11: this.cardsRank = CardsRank.JACK;
            case 12: this.cardsRank = CardsRank.QUEEN;
            case 13: this.cardsRank = CardsRank.KING;
            case 14: this.cardsRank = CardsRank.ACE;
        }
    }

    public int getCardsRank() {
        return cardsRank.getCardStrength();
    }

    @Override
    public String toString() {
        return "Card rank: " + cardsRank + ", card suit: " + cardsSuit.getSymbol();
    }
}
