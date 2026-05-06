package rvt;
import java.util.*;

public class CD implements Packable {
     String artist; 
     String CDname; 
     int publicationYear;
     double weight; 

    public CD(String artist, String CDname, int publicationYear) {
        this.artist = artist; 
        this.CDname = CDname; 
        this.publicationYear = publicationYear;
    }

    public double weight() {
        return weight = 0; 
    }

    public String toString() {
        return this.artist + ": " + this.CDname + " (" + this.publicationYear + ")";
    }

    


  

}