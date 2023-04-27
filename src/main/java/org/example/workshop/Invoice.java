package org.example.workshop;

public class Invoice extends Workshop {

    public Invoice() {
    }
    public void generateInvoice(int numberOfServices){
        System.out.println("****************************");
        System.out.println("**Tire pressure refill and**");
        System.out.println("**tire fix.               **");
        int starAmount = 28 - String.valueOf(numberOfServices).length() - 12;
        System.out.print("**Visit nr: " + numberOfServices);
        for(int i = 0; i < (starAmount -2); i++){
            System.out.print(" ");
        }

        System.out.println("**");
        System.out.println("**Total price: 100zł      **");
        System.out.println("****************************");


    }
}
