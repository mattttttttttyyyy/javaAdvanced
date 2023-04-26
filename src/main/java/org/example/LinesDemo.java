package org.example;

public class LinesDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 20, "*");
        rectangle.printRectangle();
        LineFactory lineFactory1 = new LineFactory("#", 5, 10);
        System.out.println("\n****************************************\n");

        lineFactory1.setLengthRandomCharacter();
        System.out.println("\n****************************************\n");

        lineFactory1.randomAllLine();
        System.out.println("\n****************************************\n");
        lineFactory1.randomCharAndTwoX();
        System.out.println("\n****************************************\n");
        lineFactory1.test(15).linePrint();
    }
}
