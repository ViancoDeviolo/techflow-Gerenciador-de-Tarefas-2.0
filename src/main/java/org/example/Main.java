package org.example;

import com.techflow.gerenciadordetarefas.controller.TaskController;
import com.techflow.gerenciadordetarefas.model.Task;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TaskController controller = new TaskController();

        // Criando algumas tarefas
        controller.createTask(1, "Estudar Java", "Estudar orientação a objetos", LocalDate.of(2025, 11, 12));
        controller.createTask(2, "Treinar Academia", "Treino de peito e costas", LocalDate.of(2025, 11, 13));
        controller.createTask(3, "Projeto da Faculdade", "Finalizar trabalho de Engenharia da Computação", LocalDate.of(2025, 11, 15));

        // Listando tarefas
        System.out.println("=== LISTA DE TAREFAS ===");
        List<Task> tarefas = controller.listTasks();
        tarefas.forEach(System.out::println);

        // Buscando uma tarefa específica
        System.out.println("\n=== BUSCAR TAREFA ID 2 ===");
        System.out.println(controller.findTask(2));

        // Apagando uma tarefa
        System.out.println("\n=== APAGANDO TAREFA ID 1 ===");
        controller.deleteTask(1);

        // Lista após remoção
        System.out.println("\n=== LISTA ATUALIZADA ===");
        tarefas = controller.listTasks();
        tarefas.forEach(System.out::println);
    }
}

