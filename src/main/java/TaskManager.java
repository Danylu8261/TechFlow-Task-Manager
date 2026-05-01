import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    // Representação de uma Carga/Tarefa Logística
    public static class Task {
        public int id;
        public String description;
        public String priority;

        public Task(int id, String description, String priority) {
            this.id = id;
            this.description = description;
            this.priority = priority;
        }
    }

    // Método para adicionar carga (CRUD)
    public Task addTask(String description, String priority) {
        Task newTask = new Task(tasks.size() + 1, description, priority);
        tasks.add(newTask);
        return newTask;
    }

    // Método para listar cargas (CRUD)
    public List<Task> listTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Container Eletrônicos - Porto", "Alta");
        manager.addTask("Carga Grãos - Rota 101", "Normal");

        System.out.println("=== TechFlow Solutions: Monitoramento Logístico ===");
        for (Task t : manager.listTasks()) {
            System.out.println("ID: " + t.id + " | Descrição: " + t.description + " | Prioridade: " + t.priority);
        }
    }
}
