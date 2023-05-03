package org.majowkaReview.line;

public class Rectangle {
    private int height;
    private int length;
    private String filling;

    public Rectangle(int height, int length, String filling) {
        this.height = height;
        this.length = length;
        this.filling = filling;
    }

    public void printRectangle(){
        for (int i = 0; i < height; i++){
            System.out.println();
            for (int j = 0; j < length; j++){
                System.out.print(filling);
            }

        }
    }


}
