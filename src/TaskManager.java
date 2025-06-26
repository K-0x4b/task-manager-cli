import java.util.ArrayList;

public class TaskManager {

    public ArrayList<Task> tasks;
    public int nextId;

   public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1; // Start IDs from 1
    }

    public void addTask(String title, String description, String dueDate, int priority) {
        Task task = new Task(nextId, title, description, dueDate, priority);
        nextId++;
        tasks.add(task);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
            for (Task task : tasks) {
                System.out.println(task);
                System.out.println("--------------------------------------------------");   
        }
       
    }

    public boolean markTaskCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                return true;
            }
        }
        return false; 
    }

    public boolean deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                return true;
            }
        }
        return false; 
    }

    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null; 
    }

    
}