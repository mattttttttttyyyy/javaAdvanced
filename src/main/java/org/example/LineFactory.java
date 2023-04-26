package org.example;
import java.util.Random;

public class LineFactory {
    String selectCharacter;
   public int numberOfLines;
    static int lineLength;
    String character;
    static Random rand = new Random();
    static String availableCharacters ="!@#$%^&?!";

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

    public void setLengthRandomCharacter(){
        int randomCharNumber = rand.nextInt((availableCharacters.length()-1));
        Line line = new Line(lineLength, String.valueOf
                (availableCharacters.charAt(randomCharNumber)));
        line.linePrint();
    }

    public void randomAllLine(){
        Line line = new Line(rand.nextInt(25),
                String.valueOf(availableCharacters.
                        charAt(rand.nextInt((availableCharacters.length()-1)))));
        line.linePrint();
        for (int i = 0; i < numberOfLines; i++){
            setLengthRandomCharacter();
        }
    }

    public void randomCharAndTwoX(){
        lineLength = 1;
        for(int i = 0; i < numberOfLines; i++){
           lineLength = lineLength * 2;
            Line line = new Line(lineLength,
                    String.valueOf(availableCharacters.
                            charAt(rand.nextInt((availableCharacters.length()-1)))));
            line.linePrint();
        }
    }


    public Line test(int test){
        return new Line(test, "*");
    }

}
