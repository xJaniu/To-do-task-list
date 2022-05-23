package com.example.ToDo.SpringApp.controllers;

import com.example.ToDo.SpringApp.entities.Done;
import com.example.ToDo.SpringApp.entities.Task;
import com.example.ToDo.SpringApp.services.DoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.ToDo.SpringApp.services.TaskService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private DoneService doneService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listTasks", taskService.getAllTasks());
        return "index";
    }

    @GetMapping("/tasksDone")
    public String viewTasksDonePage(Model model){
        model.addAttribute("listDoneTasks", doneService.getAllDoneTasks());
        return "tasksDone";
    }

    @GetMapping("/addTaskForm")
    public String addTaskForm(Model model){
        Task task = new Task();
        model.addAttribute("task", task);
        return "new_task";
    }

    @PostMapping("/saveTask")
    public String saveTask(@ModelAttribute("task") Task task){
        taskService.saveTask(task);
        return "redirect:/";
    }

    @GetMapping("/updateTaskForm/{id}")
    public String updateTaskForm(@PathVariable (value = "id") long id, Model model){
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        return "update_task";
    }

    @PostMapping("/closeTask")
    public String closeTask(@ModelAttribute("done") Done done){
        doneService.closeTask(done);
        return "redirect:/";
    }

    @GetMapping("/closeTaskForm/{id}")
    public String closeTaskForm(@PathVariable (value = "id") long id, Model model){
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        this.taskService.deleteTaskById(id);
        return "close_task";
    }

    @GetMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable (value = "id") long id, Model model){
        this.taskService.deleteTaskById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteDoneTask/{id}")
    public String deleteDoneTask(@PathVariable (value = "id") long id, Model model){
        this.doneService.deleteDoneTaskById(id);
        return "redirect:/tasksDone";
    }

//    @GetMapping("/closeTask/{id}")
//    public String closeTask(@PathVariable (value = "id") long id, Done done){
//        this.doneService.closeTask(done);
//
//        this.taskService.deleteTaskById(id);
//
//        return "redirect:/";
//    }

}
