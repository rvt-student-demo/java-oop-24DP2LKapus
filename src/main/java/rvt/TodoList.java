package rvt;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TodoList {
    ArrayList<String> TodoList = new ArrayList<String>();

    public void add(String task) {
            TodoList.add(task);
        }

    public void print(){
        for (int i = 0; i < TodoList.size(); i++) {
            System.out.println(i+1 + ":" + TodoList.get(i));
        }
    }

    public void remove(int index) {
         TodoList.remove(index);
    }
    

    private ArrayList<String> tasks;
    private final String filePath= "";

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    private void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("todo.csv"))) {
            String line;
        while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
        } 
        catch (IOException e) {
        System.out.println("Error reading file.");
        }
    }
    

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("todo.csv"))) {
      bw.write("First line");
      bw.newLine();  // add line break
      bw.write("Second line");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }


  

}
}
