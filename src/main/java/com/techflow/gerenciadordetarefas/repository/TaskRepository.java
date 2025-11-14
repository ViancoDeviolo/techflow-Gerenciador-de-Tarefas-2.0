package com.techflow.gerenciadordetarefas.repository;

import com.techflow.gerenciadordetarefas.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    // Cria
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Lê tudo
    public List<Task> getAllTasks() {
        return tasks;
    }

    // Busca ID
    public Task getTaskById(int id) {
        return tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Apaga
    public void deleteTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
    }
}

