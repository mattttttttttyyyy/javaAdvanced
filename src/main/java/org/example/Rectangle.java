package org.example;

public class Rectangle {
    int height;
    int length;
    String filling;

    public Rectangle(int height, int length, String filling) {
        this.height = height;
        this.length = length;
        this.filling = filling;
    }

    public void printRectangle(){
        String lineToPrint = "";
        for (int j = 0; j < length; j++)
        {
            lineToPrint += filling;
        }

        for (int i = 0; i < height; i++){

            System.out.println(lineToPrint);
        }
    }
}
