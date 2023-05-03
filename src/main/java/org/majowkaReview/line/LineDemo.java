package org.majowkaReview.line;

public class LineDemo {

    public static void main(String[] args) {
        Line line1 = new Line(20, "$");
        line1.printLine();
        Rectangle rectangle = new Rectangle(5, 20, "@");
        rectangle.printRectangle();
        System.out.println(line1.toString());
    }

}
