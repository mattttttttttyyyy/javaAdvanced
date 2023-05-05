package org.example.fridayMay;

interface Equation {

    int execute(int num1, int num2);

}

public class Main {
    public static void main(String[] args) {

        Equation addition = new Equation() {
            @Override
            public int execute(int num1, int num2) {
                return num1 + num2;
            }
        };

    /*      Equation subtraction = new Equation() {
            @Override
            public int execute(int num1, int num2) {
                return num1 - num2;
            }
        };*/

        Equation subtraction = (int num1, int num2) -> {
            return num1 - num2;

        };

        System.out.println(addition.execute(10, 5));
        System.out.println(subtraction.execute(10, 5));
    }

}
