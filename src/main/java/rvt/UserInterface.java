package rvt;

import java.util.*;

public class UserInterface{
    private TodoList list;
    private Scanner scanner;

    public void UI(Scanner scanner, TodoList){
        TodoList = TodoList;
        Scanner = Scanner;
    }

    public void start(){
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("add")) {
                System.out.print("To add: " );
                String toadd = scanner.nextLine();
                list.add(toadd);
                
            }
            else if(command.equals("list")) {
                
            }
            

        }
     }

}