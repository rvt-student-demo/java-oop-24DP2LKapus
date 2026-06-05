package rvt;

import java.util.*;
import javax.swing.*;

public class UserInterface{
    private TodoList list;
    private Scanner scanner;

    public UserInterface(Scanner theScanner, TodoList theList ) {
            list = theList;
            scanner = theScanner;
    }

    public void start(){
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("list")){
                list.print();
                continue;
            }
            else if (command.equals("add")) {
                System.out.print("To add: " );
                String toadd = scanner.nextLine();
                list.add(toadd);
                continue;
            }
            

        }
     }

}