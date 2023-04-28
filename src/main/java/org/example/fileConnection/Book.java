package org.example.fileConnection;

public class Book {
    private String name;
    private int year;
    private String author;

    public Book(String author, String name, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year published=" + year +
                '}';
    }
}
