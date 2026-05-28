package rvt.UserInterface;

import java.util.*;

public class CD implements Packable {
    private String artist;
    private String CDName;
    private double CDWeight= 0.1;
    private int pubclicationyear;

    public CD(String artist, String CDName, int publicationyear){
        this.artist = artist;
        this.CDName = CDName;
        this.pubclicationyear = publicationyear;

    }

   
    public double weight() {
        return this.CDWeight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.CDName + " (" + this.pubclicationyear + ")";
    }
}
