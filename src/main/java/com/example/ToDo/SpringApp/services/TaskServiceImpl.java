package com.example.ToDo.SpringApp.services;

import com.example.ToDo.SpringApp.entities.Task;
import com.example.ToDo.SpringApp.repositories.DoneRepository;
import com.example.ToDo.SpringApp.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private DoneRepository doneRepository;

    @Override
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    @Override
    public void saveTask(Task task){
        this.taskRepository.save(task);
    }

    @Override
    public Task getTaskById(long id){
        Optional<Task> optional = taskRepository.findById(id);
        Task task = null;
        if(optional.isPresent()){
            task = optional.get();
        }else{
            throw new RuntimeException("Task by id not found");
        }
        return task;
    }

    @Override
    public void deleteTaskById(long id){
        this.taskRepository.deleteById(id);
    }

}
