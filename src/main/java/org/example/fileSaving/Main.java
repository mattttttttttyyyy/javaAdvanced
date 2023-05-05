package org.example.fileSaving;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("czesc.txt");
            out.println("Test pisania do pliku.");
            out.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found exception");
        }
    }
}
