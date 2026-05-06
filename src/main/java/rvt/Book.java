package rvt;
import java.util.*;

public class Book implements Packable {
    String author; 
    String book; 
    double weight;
    
    public Book(String author, String book, double weight){
        this.author = author;
        this.book = book; 
        this.weight = weight;
        
    }

    public double weight() {
        return weight = 0.0; 
    }

    public String toString() {
        return this.author + ": " + this.book + " (" + this.weight + ")";
}
}