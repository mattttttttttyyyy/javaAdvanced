package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //call to method
        int value = readNumber();
        System.out.println("result is: " + value);


    }

    public static int readNumber() {
        //create scanner, ask for number
        boolean errorChecker = true;

        while (errorChecker){
            try {
                Scanner scanner = new Scanner(System.in);
                int userChoice = scanner.nextInt();
                errorChecker = false;
                return userChoice;

            } catch (InputMismatchException e){
                System.out.println("Please enter number!");
            }
        }

        //if user types text, ask for number again
        //return users number
        return 1;
    }

}