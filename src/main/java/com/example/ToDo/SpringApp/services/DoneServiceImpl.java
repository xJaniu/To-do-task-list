package com.example.ToDo.SpringApp.services;

import com.example.ToDo.SpringApp.entities.Done;
import com.example.ToDo.SpringApp.entities.Task;
import com.example.ToDo.SpringApp.repositories.DoneRepository;
import com.example.ToDo.SpringApp.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoneServiceImpl implements DoneService{

    @Autowired
    private DoneRepository doneRepository;

    @Override
    public List<Done> getAllDoneTasks(){
        return doneRepository.findAll();
    }

    @Override
    public void deleteDoneTaskById(long id){
        this.doneRepository.deleteById(id);
    }

    @Override
    public void closeTask(Done done){
        this.doneRepository.save(done);
    }
}
