package com.example.ToDo.SpringApp.services;

import com.example.ToDo.SpringApp.entities.Done;
import com.example.ToDo.SpringApp.entities.Task;

import java.util.List;

public interface DoneService {
    List<Done> getAllDoneTasks();
    void deleteDoneTaskById(long id);
    void closeTask(Done done);
}
