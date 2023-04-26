package org.example;

//2. Create a Line class. Objects of this class should have two characteristics: length and filling.
// In the main method, create 3 line objects and give them different lengths and fill symbols.
// Then create a method void printLines() that prints the symbol set as filling as many times as the
// length of the line is set. eg: with length set to 6 and filling "@"  it will print the following line:
//@@@@@@
//        with length 20 and filling "*" it should print the line:
//        ********************


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
