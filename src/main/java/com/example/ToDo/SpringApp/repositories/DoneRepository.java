package com.example.ToDo.SpringApp.repositories;

import com.example.ToDo.SpringApp.entities.Done;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoneRepository extends JpaRepository<Done, Long> {
}
