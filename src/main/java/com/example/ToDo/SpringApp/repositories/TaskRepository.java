package com.example.ToDo.SpringApp.repositories;

import com.example.ToDo.SpringApp.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
