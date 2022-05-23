package com.example.ToDo.SpringApp.entities;

import javax.persistence.*;

@Entity
@Table(name="done")
public class Done {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "importance")
    private String importance;

    @Column(name = "description")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
