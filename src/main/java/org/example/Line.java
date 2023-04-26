package org.example;

public class Line {
    int length;
    String character;

    public Line(int length, String character) {
        this.length = length;
        this.character = character;
    }

    public void linePrint(){
        String lineToPrint = "";
        for (int i = 0; i < length; i++)
        {
            lineToPrint += character;
        }
        System.out.println(lineToPrint);
    }
}
