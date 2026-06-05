package rvt;

import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class UInewinterface{

    private static TodoList list;
    private Scanner scanner;

    public UInewinterface(Scanner theScanner, TodoList theList ) {
            list = theList;
            scanner = theScanner;
    }


    public static void start(){
        
       JFrame frame = new JFrame("ToDo list");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		
		JButton buttonStop = new JButton("Stop");
		panel.add(buttonStop);
		
		JButton buttonList= new JButton("List");
		panel.add(buttonList);

        JButton buttonAdd = new JButton("Add");
		
		frame.add(panel);
		
		frame.setSize(300, 300);	
		frame.setVisible(true);

       UIaActionListener listener = new UIaActionListener();
		buttonStop.addActionListener(listener);

    
        
     }

    public static void main(String[] args){
        start();
    }

     

}