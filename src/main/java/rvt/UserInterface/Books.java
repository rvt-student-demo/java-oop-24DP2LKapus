package rvt.UserInterface;

import java.util.*;

public class Books implements Packable {
    private String author;
    private String bookName;
    private double bookWeight;

    public Books(String author, String bookName, double bookWeight){
        this.author = author;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
    }

    public double weight() {
        return this.bookWeight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.bookName;
    }
}
