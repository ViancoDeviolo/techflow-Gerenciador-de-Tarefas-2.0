package com.techflow.gerenciadordetarefas.service;

import com.techflow.gerenciadordetarefas.model.Task;
import com.techflow.gerenciadordetarefas.repository.TaskRepository;

import java.time.LocalDate;
import java.util.List;

public class TaskService {

    private final TaskRepository repository = new TaskRepository();

    public void createTask(int id, String title, String description, LocalDate dueDate) {
        Task task = new Task(id, title, description, dueDate);
        repository.addTask(task);
    }

    public List<Task> listTasks() {
        return repository.getAllTasks();
    }

    public Task findTask(int id) {
        return repository.getTaskById(id);
    }

    public void deleteTask(int id) {
        repository.deleteTask(id);
    }
}

