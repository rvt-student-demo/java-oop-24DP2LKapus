package rvt;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TodoList {
    private ArrayList<String> tasks;
    private final String filePath= "src/main/java/rvt/todo.csv";

    public TodoList() {
        this.tasks = new ArrayList<>();
        loadFromFile();
    }

    public void add(String task) {
        int newId = getLastId() + 1;
        tasks.add(newId + "," + task);
        updateFile();
    }

    public void print(){
        for (String line : tasks) {
            String[] parts = line.split(",");
            System.out.println(parts[0] + ": " + parts[1]);
        }
    }

    public void remove(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            String[] parts = tasks.get(i).split(",");
            int currentId = Integer.parseInt(parts[0]);

            if (currentId == id) {
                tasks.remove(i);
                break;
            }
        }
        updateFile();
    }

    private void loadFromFile() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(filePath));
            String line;

            reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(
                "An error occurred while reading the file: "
                + e.getMessage());
        }
    }

    private int getLastId() {
        if (tasks.isEmpty()) {
            return 0;
        }

        String lastLine = tasks.get(tasks.size() - 1);
        String[] parts = lastLine.split(",");
        return Integer.parseInt(parts[0]);
    }

    private void updateFile() {
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(filePath));

            writer.write("id,task");
            writer.newLine();

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            System.out.println(
                "An error occurred while writing the file: "
                + e.getMessage());
        }
    }
}


    





    
    
    
    


    

    


  



