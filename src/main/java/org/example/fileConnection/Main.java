package org.example.fileConnection;
/*
17. Execute the following commands:
        -Throw a NullPointer Exception and handle it in main.
        -Create a Scanner, ask for a number. If an exception occurs, display "Letters provided, cannot be converted to int".
        -Directly in the project path, create a file "books.txt" in this file, list at least 3 titles of books on programming
        that you are reading or intend to read. Write a program that displays all the titles in this file using Scanner and if
        the file is missing, it displays a message that you should start reading :)
        -Prepare a FileConnection class that allows you to connect to a file and read data from it. Calling the connect method
        is supposed to set the object's state to connected, but there is supposed to be a 25% chance that the connection will
        fail and your own FileConnectionException will be thrown.
        Also create a method that allows you to read data from the FileConnection (use the previously prepared reading of the
        file with books as the operation of this method) return the result as a String or List<String> . If files are missing
        or the text file is empty, a FileDbConnectionException should also be thrown with the appropriate message.
        Also implement the "disconnect" method to change the state of the object to unconnected. Call this method in the final block of main.
*/

public class Main {

    public static void main(String[] args) {

        try{
            exceptionExample();
        } catch (NullPointerException e){
            System.out.println("Exception!!!!!!!");
        }

    }

    public static void exceptionExample(){
        throw new NullPointerException();
        //System.out.println("No exception");
    }
}
