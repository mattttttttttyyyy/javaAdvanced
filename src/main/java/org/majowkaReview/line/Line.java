package org.majowkaReview.line;

public class Line {

    private int length;
    private String character;

    public Line(int length, String character) {
        this.length = length;
        this.character = character;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void printLine(){
        for (int i = 0; i < length; i++){
            System.out.print(character);
        }
    }

    @Override
    public String toString() {
        return "\ntest";
    }
}
