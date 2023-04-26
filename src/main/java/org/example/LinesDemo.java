package org.example;

public class LinesDemo {
    public static void main(String[] args) {
         Line line = new Line(20, "#");
//        System.out.println(line.linePrint());
//        Line line2 = new Line(20, "*");
//        System.out.println(line2.linePrint());
        Rectangle rectangle = new Rectangle(5, 20, "*");
        rectangle.printRectangle();
        LineFactory lineFactory1 = new LineFactory("#", 5, 10);
        System.out.println("\n****************************************\n");

        lineFactory1.setLengthRandomCharacter();
        System.out.println("\n****************************************\n");

        lineFactory1.randomAllLine();
        System.out.println("\n****************************************\n");
        lineFactory1.randomCharAndTwoX();
    }
}
