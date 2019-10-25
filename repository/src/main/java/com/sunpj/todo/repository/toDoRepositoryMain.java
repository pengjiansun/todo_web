package com.sunpj.todo.repository;

import com.sunpj.todo.model.ToDoItem;

import java.util.List;

public class toDoRepositoryMain {
    public static void main(String[] args) {
        InMemoryToDoRepository repo = new InMemoryToDoRepository();
        ToDoItem toDoItem = new ToDoItem();
        toDoItem.setName("test jar dependencies.");
        repo.insert(toDoItem);

        List<ToDoItem> toDoItems = repo.findAll();
        for (int i=0;i<toDoItems.size();i++){
            System.out.println("todo name="+toDoItems.get(i).getName());
        }

    }


}

