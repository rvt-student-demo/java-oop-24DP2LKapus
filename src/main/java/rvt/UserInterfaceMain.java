package rvt;

import java.util.Scanner;

public class UserInterfaceMain {
    public static void main(String[] args) {
         TodoList list = new TodoList();
         Scanner scanner = new Scanner(System.in);
         UserInterface UI = new UserInterface(scanner, list);
        UI.start();
        
    }

   
}
