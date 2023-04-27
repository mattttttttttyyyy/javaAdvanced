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

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class CardsDemo {


    public static void main(String[] args) {
        Card card1 = new Card(CardsSuit.DIAMONDS, CardsRank.EIGHT);
        //System.out.println(card1);
        Card[] card = new Card[52];
        System.out.println(" ");

//        for (int i = 0; i < 52; i++) {
//            for(int k = 0; k < 4; k++){
//                for(int j = 0; j < 13; j++){
//                    card[i] = new Card(CardsSuit.values()[k], CardsRank.values()[j]);
//                }
//
//            }
//
//        }
        for (int i = 0; i < 13; i++) {
            card[i] = new Card(CardsSuit.DIAMONDS, CardsRank.values()[i]);
            System.out.println(card[i]);
        }
        int j = 0;
        for (int i = 13; i < 26; i++) {

            card[i] = new Card(CardsSuit.CLUBS, CardsRank.values()[j]);
            System.out.println(card[i]);
            j++;
        }
        j = 0;
        for (int i = 26; i < 39; i++) {
            card[i] = new Card(CardsSuit.HEARTS, CardsRank.values()[j]);
            System.out.println(card[i]);
            j++;
        }
        j = 0;
        for (int i = 39; i < 52; i++) {
            card[i] = new Card(CardsSuit.SPADES, CardsRank.values()[j]);
            System.out.println(card[i]);
            j++;
        }
        System.out.println(Arrays.toString(card));
        Random random = new Random();
        CompareCards compareCards = new CompareCards();
        for (int i = 0; i < 100; i++){
            int num1 = random.nextInt(52);
            int num2 = random.nextInt(52);
            System.out.println("Num1 " + num1 + " num2 " + num2);
            compareCards.cardFight(card[num1], card[num2]);
            System.out.println("\n=========NEXT ROUND=======\n");
        }





    }


}
