package org.majowkaReview.postOffice;

import java.util.ArrayList;
import java.util.Random;

public class PostOfficeDemo {
    public static void main(String[] args) {
        Package paczka = new Package("Jan", "Wojtek", 58897, true);
        System.out.println(paczka);
        System.out.println("Price: " + paczka.priceOfPackage() + "PLN" );

        ArrayList<Package> packages = new ArrayList<>();
        packages.add(new Package("Kuba", "Joanna", 856));
        packages.add(new Package("Magda", "Mateusz", 800, true));
        packages.add(new Package("Karol", "Joanna", 856));
        packages.add(new Package("Jacek", "Patrycja", 1765, true));
        packages.add(new Package("Radosław", "Zdzisław", 2556));
        System.out.println(packages.get(0));
        packages.get(0).sendPackage();
        System.out.println(packages.get(0));


        /*ArrayList<Package> packages100 = new ArrayList<>();
         Random random = new Random();

        for (int i = 0; i < 100; i++) {
            packages100.add(new Package("Sender"+i, "Recipient"+i, random.nextInt(15000), random.nextBoolean()));
        }
        float totalPrice = 0;

        for(int i = 1; i < packages100.size(); i++){
            System.out.println(packages100.get(i));
            totalPrice += packages100.get(i).priceOfPackage();
        }

        System.out.println("Total package price is: " + totalPrice);*/



    }
}
