package rvt.UserInterface;

import java.util.*;

public class UserInterfaceMain {

 public static void main(String[] args) {
    Box box = new Box(10);

    box.add(new Books("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
    box.add(new Books("Robert Martin", "Clean Code", 1));
    box.add(new Books("Kent Beck", "Test Driven Development", 0.7));

    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(box);
}

   
}
