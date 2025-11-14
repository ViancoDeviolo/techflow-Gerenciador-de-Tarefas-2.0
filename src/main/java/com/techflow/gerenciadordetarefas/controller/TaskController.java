package com.techflow.gerenciadordetarefas.controller;

import com.techflow.gerenciadordetarefas.model.Task;
import com.techflow.gerenciadordetarefas.service.TaskService;

import java.time.LocalDate;
import java.util.List;

public class TaskController {

    private final TaskService service = new TaskService();

    public void createTask(int id, String title, String description, LocalDate dueDate) {
        service.createTask(id, title, description, dueDate);
    }

    public List<Task> listTasks() {
        return service.listTasks();
    }

    public Task findTask(int id) {
        return service.findTask(id);
    }

    public void deleteTask(int id) {
        service.deleteTask(id);
    }
}


