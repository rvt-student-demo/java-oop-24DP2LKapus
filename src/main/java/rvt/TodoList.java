package rvt;

import java.util.*;

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
    

    

}
