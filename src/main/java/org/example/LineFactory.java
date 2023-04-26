package org.example;
//In the program with Lines, create an additional class: LineFactory, and in it create methods that produce and return:


//        Then, in the LineDemo class, test all the methods by printing the lines produced by them.


import java.util.Random;

public class LineFactory {
    String selectCharacter;
   public int numberOfLines;
    int lineRepetitionCounter;
    static int lineLength;
    String character;
    static Random rand = new Random();
    static String availableCharacters ="!@#$%^&?!";
//a line of random length with a selected character,


    public LineFactory(String selectCharacter, int numberOfLines, int lineLength) {
        this.selectCharacter = selectCharacter;
        this.numberOfLines = numberOfLines;
        LineFactory.lineLength = lineLength;
    }

    public void randomLengthWithCharacter(String selectCharacter){
        this.character = selectCharacter;
        int randomLength = rand.nextInt(25);
        Line line = new Line(randomLength, character);
        line.linePrint();
    }
//- a line of the selected length but with a random character,
    public void setLengthRandomCharacter(){
        int randomCharNumber = rand.nextInt((availableCharacters.length()-1));
        Line line = new Line(lineLength, String.valueOf(availableCharacters.charAt(randomCharNumber)));
        line.linePrint();

    }

//        - a line with random length and random character,
//        - specified number of lines with random length and character (use previous method),
    public void randomAllLine(){
        Line line = new Line(rand.nextInt(25),
                String.valueOf(availableCharacters.charAt(rand.nextInt((availableCharacters.length()-1)))));
        line.linePrint();
        for (int i = 0; i < numberOfLines; i++){
            setLengthRandomCharacter();
        }




    }

//        - a line with length two and a random character but each subsequent line returned is supposed to be 2x the previous one.
    public void randomCharAndTwoX(){
        lineLength = 1;
        for(int i = 0; i < numberOfLines; i++){
           lineLength = lineLength * 2;
            Line line = new Line(lineLength,
                    String.valueOf(availableCharacters.charAt(rand.nextInt((availableCharacters.length()-1)))));
            line.linePrint();
        }


    }




}
