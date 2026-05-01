import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testAdicionarTarefa() {
        TaskManager manager = new TaskManager();
        TaskManager.Task task = manager.addTask("Carga Teste", "Alta");

        assertNotNull(task);
        assertEquals(1, task.id);
        assertEquals("Carga Teste", task.description);
    }

    @Test
    public void testMudancaEscopoPrioridadeUrgente() {
        // Valida o requisito de mudança de escopo (Adição de prioridade crítica)
        TaskManager manager = new TaskManager();
        TaskManager.Task task = manager.addTask("Carga Perecível", "Urgente");

        assertEquals("Urgente", task.priority);
    }
}
