package com.example.ToDo.SpringApp.services;

import com.example.ToDo.SpringApp.entities.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    void saveTask(Task task);
    Task getTaskById(long id);
    void deleteTaskById(long id);
}
